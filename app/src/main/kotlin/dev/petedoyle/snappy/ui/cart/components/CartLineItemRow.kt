package dev.petedoyle.snappy.ui.cart.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductFull
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductImageFull
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductVariantFull
import dev.petedoyle.snappy.design.compose.components.incrementer.Incrementer
import dev.petedoyle.snappy.design.compose.theme.SnappyTheme
import dev.petedoyle.snappy.R
import dev.petedoyle.snappy.cart.CartLineItem
import coil.compose.rememberImagePainter
import coil.size.Scale

private val IMAGE_WIDTH = 40.dp
private const val IMAGE_ASPECT_RATIO = 3 / 4f
private val IMAGE_CORNER_RADIUS = 4.dp

@Composable
fun CartLineItemRow(
    item: CartLineItem,
    onRemoveLineItemClicked: (item: CartLineItem) -> Unit,
    onChangeLineItemQuantityClicked: (item: CartLineItem, newQuantity: Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = SnappyTheme.spacing.xl)
    ) {

        val thumbnailUrl = if (!item.variant.imageUrl.isNullOrBlank()) {
            item.variant.imageUrl
        } else {
            item.product.images?.firstOrNull()?.urlThumbnail
        }

        Image(
            painter = rememberImagePainter(
                data = thumbnailUrl,
                builder = {
                    scale(Scale.FILL)
                    crossfade(true)
                }
            ),
            contentScale = ContentScale.Crop,
            contentDescription = stringResource(
                R.string.cart_line_item_photo_content_description,
                item.product.name
            ),
            modifier = Modifier
                .width(IMAGE_WIDTH)
                .aspectRatio(IMAGE_ASPECT_RATIO)
                .clip(RoundedCornerShape(IMAGE_CORNER_RADIUS))
                .background(SnappyTheme.colors.primitives_gray_gray50.value)
        )

        Column(
            Modifier
                .padding(start = SnappyTheme.spacing.s)
                .weight(1f)
        ) {
            Text(
                text = item.product.name,
                color = SnappyTheme.colors.onbackground_onbackground.value,
                style = SnappyTheme.typography.label2,
            )

            Row(modifier = Modifier.padding(top = SnappyTheme.spacing.xxs)) {
                Text(
                    text = stringResource(
                        R.string.price_format,
                        item.variant.calculatedPrice ?: 0f
                    ),
                    color = SnappyTheme.colors.onbackground_onbackgroundvariant1.value,
                    style = SnappyTheme.typography.label3,
                )

                Text(
                    text = "•",
                    color = SnappyTheme.colors.onbackground_onbackgroundvariant1.value,
                    style = SnappyTheme.typography.label3,
                    modifier = Modifier.padding(horizontal = SnappyTheme.spacing.xxs),
                )

                Text(
                    text = stringResource(R.string.remove),
                    color = SnappyTheme.colors.accent_accent.value,
                    style = SnappyTheme.typography.label3,
                    modifier = Modifier.clickable { onRemoveLineItemClicked(item) },
                )
            }

            item.variant.optionValues.orEmpty().forEach { optionValue ->
                Text(
                    text = "${optionValue.optionDisplayName}: ${optionValue.label}",
                    color = SnappyTheme.colors.onbackground_onbackgroundvariant1.value,
                    style = SnappyTheme.typography.label3,
                    modifier = Modifier.padding(top = SnappyTheme.spacing.xs)
                )
            }
        }

        Incrementer(
            quantity = item.quantity,
            onDecrement = { onChangeLineItemQuantityClicked(item, it) },
            onIncrement = { onChangeLineItemQuantityClicked(item, it) },
        )
    }
}

@Preview(name = "Light", uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true)
@Preview(name = "Dark", uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
private fun Preview() {
    SnappyTheme {
        CartLineItemRow(
            item = CartLineItem(
                quantity = 1,
                product = ProductFull(
                    name = "Orbit Terrarium",
                    type = ProductFull.Type.physical,
                    weight = 1.0f,
                    price = 89.00f,
                    images = listOf(
                        ProductImageFull(
                            urlThumbnail = "https://cdn11.bigcommerce.com/s-c22nuunnpp/products/81/images/274/roundterrariumsmall2.1652641773.220.290.jpg?c=1"
                        )
                    ),
                ),
                variant = ProductVariantFull(
                    price = 9.99
                )
            ),
            onRemoveLineItemClicked = {},
            onChangeLineItemQuantityClicked = { _, _ -> }
        )
    }
}