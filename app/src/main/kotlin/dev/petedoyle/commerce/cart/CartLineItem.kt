package dev.petedoyle.commerce.cart

import dev.petedoyle.commerce.common.api.bigcommerce.catalog.v3.model.ProductFull
import dev.petedoyle.commerce.common.api.bigcommerce.catalog.v3.model.ProductVariantFull

data class CartLineItem(
    val quantity: Int,
    val product: ProductFull,
    val variant: ProductVariantFull,
)
