package dev.petedoyle.snappy.ui.cart

import dev.petedoyle.common.mvi.ViewModelEffect
import dev.petedoyle.snappy.cart.CartState

sealed class CartScreenEffects : ViewModelEffect
data class LaunchCheckoutEffect(val cartState: CartState) : CartScreenEffects()
object NavigateBackEffect : CartScreenEffects()
