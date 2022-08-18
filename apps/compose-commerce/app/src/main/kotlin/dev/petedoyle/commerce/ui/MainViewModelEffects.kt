package dev.petedoyle.commerce.ui

import dev.petedoyle.common.mvi.ViewModelEffect
import com.google.android.play.core.appupdate.AppUpdateInfo

sealed class MainViewModelEffects : ViewModelEffect {
    data class AppUpdateAvailableEffect(val appUpdateInfo: AppUpdateInfo) : MainViewModelEffects()
    object AppUpdateNotAvailableEffect : MainViewModelEffects()
    data class AppUpdateCheckFailedEffect(val e: Exception?) : MainViewModelEffects()
}