package dev.petedoyle.snappy.ui.home

import dev.petedoyle.snappy.common.mvi2.ViewModelEffect

sealed class HomeScreenEffects : ViewModelEffect
data class NavigateToProductDetail(val productId: Int) : HomeScreenEffects()
object NavigateToCart : HomeScreenEffects()
object NetworkError: HomeScreenEffects()
