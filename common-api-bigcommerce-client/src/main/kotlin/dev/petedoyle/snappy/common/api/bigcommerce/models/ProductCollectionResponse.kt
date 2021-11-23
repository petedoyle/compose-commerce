package dev.petedoyle.snappy.common.api.bigcommerce.models
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.MetaCollectionFull
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductFull
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductCollectionResponse (
    @Json(name = "data")
    val data: List<ProductFull>? = null,

    @Json(name = "meta")
    val meta: MetaCollectionFull? = null
)

