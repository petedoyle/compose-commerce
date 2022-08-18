package dev.petedoyle.commerce.ui

import androidx.lifecycle.viewModelScope
import dev.petedoyle.common.coroutines.DispatcherProvider
import dev.petedoyle.common.mvi.ViewModelBase
import dev.petedoyle.commerce.cart.CartStore
import dev.petedoyle.commerce.cart.ClearCart
import dev.petedoyle.commerce.ui.MainActivityActions.AppStarting
import dev.petedoyle.commerce.ui.MainActivityActions.CheckoutComplete
import dev.petedoyle.commerce.ui.MainViewModelEffects.*
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