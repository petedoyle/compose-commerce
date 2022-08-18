package dev.petedoyle.commerce.cart

data class CartState(
    val items: List<CartLineItem> = listOf(),
)

fun CartState.isCartEmpty(): Boolean = items.isEmpty()

fun CartState.subtotal(): Double = items.mapNotNull {
    (it.variant.calculatedPrice ?: 0.0) * it.quantity.toDouble()
}.sumOf { it }

fun CartState.taxes(): Double = 0.0

fun CartState.shipping(): Double = 0.0

fun CartState.discounts(): Double = 0.0

fun CartState.total() = subtotal() + taxes() + shipping() - discounts()