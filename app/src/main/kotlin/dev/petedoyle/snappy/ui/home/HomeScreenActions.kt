package dev.petedoyle.snappy.ui.home

import dev.petedoyle.snappy.common.mvi2.ViewAction

sealed class HomeScreenActions : ViewAction
data class ProductClicked(val productId: Int) : HomeScreenActions()
object ShoppingCartClicked : HomeScreenActions()