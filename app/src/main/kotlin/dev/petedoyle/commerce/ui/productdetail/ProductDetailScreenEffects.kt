package dev.petedoyle.commerce.ui.productdetail

import dev.petedoyle.commerce.common.api.bigcommerce.catalog.v3.model.ProductFull
import dev.petedoyle.commerce.common.api.bigcommerce.catalog.v3.model.ProductVariantFull
import dev.petedoyle.common.mvi.ViewModelEffect

sealed class ProductDetailScreenEffects : ViewModelEffect
object NavigateBack : ProductDetailScreenEffects()
object NavigateToCart : ProductDetailScreenEffects()
data class LaunchCheckoutEffect(
    val product: ProductFull,
    val variant: ProductVariantFull
) : ProductDetailScreenEffects()

object NetworkError : ProductDetailScreenEffects()
