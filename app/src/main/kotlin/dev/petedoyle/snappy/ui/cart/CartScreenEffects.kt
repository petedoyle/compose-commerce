package dev.petedoyle.snappy.ui.cart

import dev.petedoyle.snappy.common.mvi2.ViewModelEffect
import dev.petedoyle.snappy.cart.CartState

sealed class CartScreenEffects : ViewModelEffect
data class LaunchCheckoutEffect(val cartState: CartState) : CartScreenEffects()
object NavigateBackEffect : CartScreenEffects()
