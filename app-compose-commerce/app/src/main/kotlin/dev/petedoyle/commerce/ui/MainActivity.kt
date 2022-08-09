package dev.petedoyle.commerce.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import dev.petedoyle.common.design.compose.theme.SnappyTheme
import dev.petedoyle.commerce.ui.MainActivityActions.AppStarting
import dev.petedoyle.commerce.ui.MainViewModelEffects.AppUpdateAvailableEffect
import dev.petedoyle.commerce.ui.MainViewModelEffects.AppUpdateCheckFailedEffect
import dev.petedoyle.commerce.ui.MainViewModelEffects.AppUpdateNotAvailableEffect
import com.google.android.play.core.appupdate.AppUpdateManager
import com.google.android.play.core.appupdate.AppUpdateOptions
import com.google.android.play.core.install.model.AppUpdateType
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    @Inject
    lateinit var appUpdateManager: AppUpdateManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Subscribe to effects
        lifecycleScope.launchWhenResumed {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.effectFlow.collect { effect ->
                    onViewModelEffect(effect)
                }
            }
        }

        // Checks for updates and emits an effect when done (which must call installSplashScreen())
        viewModel.onAction(AppStarting)

        // For edge-to-edge support
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            SnappyTheme {
                SnappyApp()
            }
        }
    }

    private fun onViewModelEffect(effect: MainViewModelEffects) {
        when (effect) {
            AppUpdateNotAvailableEffect -> installSplashScreen()
            is AppUpdateAvailableEffect -> {
                installSplashScreen()
                startAppUpdateImmediate(effect)
            }
            is AppUpdateCheckFailedEffect -> {
                // ignore for now
                installSplashScreen()
            }
        }
    }

    private fun startAppUpdateImmediate(effect: AppUpdateAvailableEffect) {
        appUpdateManager.startUpdateFlow(
            effect.appUpdateInfo,
            this,
            AppUpdateOptions.defaultOptions(AppUpdateType.IMMEDIATE)
        )
    }
}
