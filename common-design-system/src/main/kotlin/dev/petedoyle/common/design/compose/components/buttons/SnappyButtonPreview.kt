package dev.petedoyle.common.design.compose.components.buttons

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import dev.petedoyle.commerce.design.compose.R
import dev.petedoyle.common.design.compose.theme.SnappyTheme

@Preview(name = "Light", uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    backgroundColor = 0xff000000
)
@Composable
private fun Preview(
    @PreviewParameter(SnappyButtonStyleVariantProvider::class) styleVariant: SnappyButtonStyleVariant,
) {
    SnappyTheme {
        SnappyButtonGallery(styleVariant)
    }
}

@Composable
private fun SnappyButtonGallery(styleVariant: SnappyButtonStyleVariant) {
    val sizeVariants = listOf(
        SnappyButtonSizeVariant.Default(),
        SnappyButtonSizeVariant.Compact(),
        SnappyButtonSizeVariant.Tiny()
    )

    Column(
        verticalArrangement = Arrangement.spacedBy(SnappyTheme.spacing.xxl),
        modifier = Modifier.padding(SnappyTheme.spacing.m)
    ) {
        sizeVariants.forEach { sizeVariant ->
            Column(
                verticalArrangement = Arrangement.spacedBy(SnappyTheme.spacing.xs),
                modifier = Modifier.padding(SnappyTheme.spacing.m)
            ) {
                Text(
                    text = "${styleVariant.javaClass.simpleName} / ${sizeVariant.javaClass.simpleName}:",
                    color = SnappyTheme.colors.onbackground_onbackground.value,
                    style = SnappyTheme.typography.heading3,
                )

                // Enabled, no icon
                SnappyButton(
                    text = stringResource(id = R.string.snappy_checkout),
                    sizeVariant = sizeVariant,
                    styleVariant = styleVariant,
                )

                // Loading, no icon
                SnappyButton(
                    text = stringResource(id = R.string.snappy_checkout),
                    sizeVariant = sizeVariant,
                    styleVariant = styleVariant,
                    loading = true,
                )

                // Disabled
                SnappyButton(
                    text = stringResource(id = R.string.snappy_checkout),
                    sizeVariant = sizeVariant,
                    styleVariant = styleVariant,
                    enabled = false,
                )

                // Enabled, with lock icon
                SnappyButton(
                    text = stringResource(id = R.string.snappy_checkout),
                    sizeVariant = sizeVariant,
                    styleVariant = styleVariant,
                    iconRes = R.drawable.ico_lock_24,
                )

                // Loading, with lock icon
                SnappyButton(
                    text = stringResource(id = R.string.snappy_checkout),
                    sizeVariant = sizeVariant,
                    styleVariant = styleVariant,
                    loading = true,
                    iconRes = R.drawable.ico_lock_24,
                )

                // Disabled, with lock icon
                SnappyButton(
                    text = stringResource(id = R.string.snappy_checkout),
                    sizeVariant = sizeVariant,
                    styleVariant = styleVariant,
                    enabled = false,
                    iconRes = R.drawable.ico_lock_24,
                )
            }
        }
    }
}

// Must not be private, or Compose tooling will cease to render anything
class SnappyButtonStyleVariantProvider : PreviewParameterProvider<SnappyButtonStyleVariant> {
    override val values = sequenceOf(
        SnappyButtonStyleVariant.Primary(),
        SnappyButtonStyleVariant.Secondary(),
        SnappyButtonStyleVariant.DestructivePrimary(),
        SnappyButtonStyleVariant.DestructiveSecondary(),
    )
    override val count: Int = values.count()
}