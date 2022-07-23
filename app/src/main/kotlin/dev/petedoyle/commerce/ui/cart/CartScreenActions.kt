package dev.petedoyle.commerce.ui.cart

import dev.petedoyle.common.mvi.ViewAction
import dev.petedoyle.commerce.cart.CartLineItem

sealed class CartScreenActions : ViewAction
object BackClicked : CartScreenActions()
object QuickCheckoutClicked : CartScreenActions()
data class RemoveCartLineItemClicked(val item: CartLineItem) : CartScreenActions()
object ShoppingCartClicked : CartScreenActions()
data class UpdateLineItemQuantityClicked(
    val item: CartLineItem,
    val newQuantity: Int
) : CartScreenActions()