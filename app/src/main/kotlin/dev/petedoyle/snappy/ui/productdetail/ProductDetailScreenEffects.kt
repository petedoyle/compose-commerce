package dev.petedoyle.snappy.ui.productdetail

import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductFull
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductVariantFull
import dev.petedoyle.snappy.common.mvi2.ViewModelEffect

sealed class ProductDetailScreenEffects : ViewModelEffect
object NavigateBack : ProductDetailScreenEffects()
object NavigateToCart : ProductDetailScreenEffects()
data class LaunchCheckoutEffect(
    val product: ProductFull,
    val variant: ProductVariantFull
) : ProductDetailScreenEffects()

object NetworkError : ProductDetailScreenEffects()
