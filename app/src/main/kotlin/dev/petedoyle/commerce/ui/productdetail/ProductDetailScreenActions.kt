package dev.petedoyle.commerce.ui.productdetail

import dev.petedoyle.commerce.common.api.bigcommerce.catalog.v3.model.ProductVariantFull
import dev.petedoyle.common.mvi.ViewAction

sealed class ProductDetailScreenActions : ViewAction
object BackClicked : ProductDetailScreenActions()
object ShoppingCartClicked : ProductDetailScreenActions()
data class ProductVariantSelected(val variant: ProductVariantFull) : ProductDetailScreenActions()
object CheckoutClicked : ProductDetailScreenActions()
object AddToCartClicked : ProductDetailScreenActions()