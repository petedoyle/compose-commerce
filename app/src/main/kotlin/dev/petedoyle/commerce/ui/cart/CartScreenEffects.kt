package dev.petedoyle.commerce.ui.cart

import dev.petedoyle.common.mvi.ViewModelEffect
import dev.petedoyle.commerce.cart.CartState

sealed class CartScreenEffects : ViewModelEffect
data class LaunchCheckoutEffect(val cartState: CartState) : CartScreenEffects()
object NavigateBackEffect : CartScreenEffects()
