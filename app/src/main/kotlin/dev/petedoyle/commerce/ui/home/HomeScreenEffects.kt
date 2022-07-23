package dev.petedoyle.commerce.ui.home

import dev.petedoyle.common.mvi.ViewModelEffect

sealed class HomeScreenEffects : ViewModelEffect
data class NavigateToProductDetail(val productId: Int) : HomeScreenEffects()
object NavigateToCart : HomeScreenEffects()
object NetworkError: HomeScreenEffects()
