package dev.petedoyle.snappy.ui.cart

import dev.petedoyle.snappy.common.mvi2.ViewAction
import dev.petedoyle.snappy.cart.CartLineItem

sealed class CartScreenActions : ViewAction
object BackClicked : CartScreenActions()
object QuickCheckoutClicked : CartScreenActions()
data class RemoveCartLineItemClicked(val item: CartLineItem) : CartScreenActions()
object ShoppingCartClicked : CartScreenActions()
data class UpdateLineItemQuantityClicked(
    val item: CartLineItem,
    val newQuantity: Int
) : CartScreenActions()