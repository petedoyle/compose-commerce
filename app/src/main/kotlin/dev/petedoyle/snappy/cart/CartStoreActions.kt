package dev.petedoyle.snappy.cart

import dev.petedoyle.snappy.common.flux.StoreActions

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