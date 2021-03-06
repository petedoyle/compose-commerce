package dev.petedoyle.commerce.common.api.bigcommerce.models

import dev.petedoyle.commerce.common.api.bigcommerce.catalog.v3.model.Category
import dev.petedoyle.commerce.common.api.bigcommerce.catalog.v3.model.MetaCollectionFull
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CategoryCollectionResponse(
    val data: List<Category>,
    val meta: MetaCollectionFull,
)