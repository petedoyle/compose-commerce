/**
 * Carts
 *
 * Create a cart using BigCommerce cart logic.
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package dev.petedoyle.snappy.common.api.bigcommerce.carts.v3.model

import dev.petedoyle.snappy.common.api.bigcommerce.carts.v3.model.AppliedCoupon
import dev.petedoyle.snappy.common.api.bigcommerce.carts.v3.model.AppliedDiscount1
import dev.petedoyle.snappy.common.api.bigcommerce.carts.v3.model.BaseItem
import dev.petedoyle.snappy.common.api.bigcommerce.carts.v3.model.ItemDigitalAllOf
import dev.petedoyle.snappy.common.api.bigcommerce.carts.v3.model.ProductOption

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param variantId The id of the variant. Required in the /PUT or /POST if the product has variants.
 * @param productId The id of the product. Required in a /POST request.
 * @param quantity Quantity of this item in the cart.
 * @param id The line-item ID.
 * @param sku SKU of the variant.
 * @param name The item's product name.
 * @param url The product URL.
 * @param isTaxable Whether the item is taxable.
 * @param imageUrl Image of the product or variant.
 * @param discounts 
 * @param coupons 
 * @param discountAmount The total value of all discounts applied to this item. This includes coupons and cart level discounts
 * @param couponAmount The total value of all coupons applied to this item.
 * @param listPrice Item's list price, as quoted by the manufacturer/distributor. Optional price override.
 * @param salePrice Item's price after all discounts are applied. (The final price before tax calculation.)
 * @param extendedListPrice Item's list price multiplied by the quantity.
 * @param extendedSalePrice Item's sale price multiplied by the quantity.
 * @param options The list of selected options for this product.
 * @param downloadFileUrls URLs to download all product files.
 * @param downloadPageUrl The URL for the combined downloads page.
 * @param downloadSize Combined download size, in human-readable style. E.g.: `30MB`.
 */
@JsonClass(generateAdapter = true)
data class ItemDigital (

    /* The id of the variant. Required in the /PUT or /POST if the product has variants. */
    @Json(name = "variant_id")
    val variantId: java.math.BigDecimal,

    /* The id of the product. Required in a /POST request. */
    @Json(name = "product_id")
    val productId: java.math.BigDecimal,

    /* Quantity of this item in the cart. */
    @Json(name = "quantity")
    val quantity: java.math.BigDecimal,

    /* The line-item ID. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* SKU of the variant. */
    @Json(name = "sku")
    val sku: kotlin.String? = null,

    /* The item's product name. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The product URL. */
    @Json(name = "url")
    val url: java.net.URI? = null,

    /* Whether the item is taxable. */
    @Json(name = "is_taxable")
    val isTaxable: kotlin.Boolean? = null,

    /* Image of the product or variant. */
    @Json(name = "image_url")
    val imageUrl: java.net.URI? = null,

    @Json(name = "discounts")
    val discounts: kotlin.collections.List<AppliedDiscount1>? = null,

    @Json(name = "coupons")
    val coupons: kotlin.collections.List<AppliedCoupon>? = null,

    /* The total value of all discounts applied to this item. This includes coupons and cart level discounts */
    @Json(name = "discount_amount")
    val discountAmount: java.math.BigDecimal? = null,

    /* The total value of all coupons applied to this item. */
    @Json(name = "coupon_amount")
    val couponAmount: java.math.BigDecimal? = null,

    /* Item's list price, as quoted by the manufacturer/distributor. Optional price override. */
    @Json(name = "list_price")
    val listPrice: java.math.BigDecimal? = null,

    /* Item's price after all discounts are applied. (The final price before tax calculation.) */
    @Json(name = "sale_price")
    val salePrice: java.math.BigDecimal? = null,

    /* Item's list price multiplied by the quantity. */
    @Json(name = "extended_list_price")
    val extendedListPrice: java.math.BigDecimal? = null,

    /* Item's sale price multiplied by the quantity. */
    @Json(name = "extended_sale_price")
    val extendedSalePrice: java.math.BigDecimal? = null,

    /* The list of selected options for this product. */
    @Json(name = "options")
    val options: kotlin.collections.List<ProductOption>? = null,

    /* URLs to download all product files. */
    @Json(name = "download_file_urls")
    val downloadFileUrls: kotlin.collections.List<kotlin.String>? = null,

    /* The URL for the combined downloads page. */
    @Json(name = "download_page_url")
    val downloadPageUrl: kotlin.String? = null,

    /* Combined download size, in human-readable style. E.g.: `30MB`. */
    @Json(name = "download_size")
    val downloadSize: kotlin.String? = null

)

