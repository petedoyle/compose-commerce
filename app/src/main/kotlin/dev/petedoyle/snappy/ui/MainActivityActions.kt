package dev.petedoyle.snappy.ui

import dev.petedoyle.common.mvi.ViewAction

sealed class MainActivityActions : ViewAction {
    object AppStarting : MainActivityActions()
    object CheckoutComplete : MainActivityActions()
}