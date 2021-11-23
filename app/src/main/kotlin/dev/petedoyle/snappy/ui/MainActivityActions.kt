package dev.petedoyle.snappy.ui

import dev.petedoyle.snappy.common.mvi2.ViewAction

sealed class MainActivityActions : ViewAction {
    object AppStarting : MainActivityActions()
    object CheckoutComplete : MainActivityActions()
}