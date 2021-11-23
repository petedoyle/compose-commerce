package dev.petedoyle.snappy.cart

import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductFull
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductVariantFull

data class CartLineItem(
    val quantity: Int,
    val product: ProductFull,
    val variant: ProductVariantFull,
)
