package dev.petedoyle.commerce.ui.home

import dev.petedoyle.common.mvi.ViewAction

sealed class HomeScreenActions : ViewAction
data class ProductClicked(val productId: Int) : HomeScreenActions()
object ShoppingCartClicked : HomeScreenActions()