package dev.petedoyle.snappy.ui

import androidx.lifecycle.viewModelScope
import dev.petedoyle.snappy.common.coroutines.DispatcherProvider
import dev.petedoyle.snappy.common.mvi2.ViewModelBase
import dev.petedoyle.snappy.cart.CartStore
import dev.petedoyle.snappy.cart.ClearCart
import dev.petedoyle.snappy.ui.MainActivityActions.AppStarting
import dev.petedoyle.snappy.ui.MainActivityActions.CheckoutComplete
import dev.petedoyle.snappy.ui.MainViewModelEffects.*
import com.google.android.play.core.appupdate.AppUpdateInfo
import com.google.android.play.core.appupdate.AppUpdateManager
import com.google.android.play.core.install.model.UpdateAvailability
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val appUpdateManager: AppUpdateManager,
    private val cartStore: CartStore,
    dispatcherProvider: DispatcherProvider,
) : ViewModelBase<MainViewModelState, MainActivityActions, MainViewModelEffects>(
    MainViewModelState,
    dispatcherProvider
) {

    override fun onAction(action: MainActivityActions) {
        when (action) {
            AppStarting -> handleAppStarting()
            is CheckoutComplete -> handleCheckoutComplete()
        }
    }

    private fun handleAppStarting() {
        checkForUpdates()
    }

    private fun handleCheckoutComplete() {
        viewModelScope.launch(dispatcherProvider.io()) {
            cartStore.dispatch(ClearCart)
        }
    }

    private fun checkForUpdates() {
        appUpdateManager.appUpdateInfo.apply {
            addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val appUpdateInfo: AppUpdateInfo = task.result
                    when (appUpdateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE) {
                        true -> emitEffect(AppUpdateAvailableEffect(appUpdateInfo))
                        else -> emitEffect(AppUpdateNotAvailableEffect)
                    }
                } else {
                    emitEffect(AppUpdateCheckFailedEffect(task.exception))
                }
            }
        }
    }
}