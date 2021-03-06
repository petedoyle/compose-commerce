package dev.petedoyle.commerce.cart

import dev.petedoyle.common.flux.StoreActions

sealed class CartStoreActions : StoreActions
data class AddLineItem(val item: CartLineItem) : CartStoreActions()
data class RemoveLineItem(val item: CartLineItem) : CartStoreActions()
data class UpdateLineItemQuantity(val item: CartLineItem, val newQuantity: Int) :
    CartStoreActions() {
    init {
        require(newQuantity > 0)
    }
}
object ClearCart : CartStoreActions()