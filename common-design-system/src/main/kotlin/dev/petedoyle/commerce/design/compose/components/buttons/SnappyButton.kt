package dev.petedoyle.commerce.design.compose.components.buttons

import androidx.annotation.DrawableRes
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import dev.petedoyle.commerce.design.compose.theme.SnappyTheme

@Composable
fun SnappyButton(
    text: String,
    modifier: Modifier = Modifier,
    sizeVariant: SnappyButtonSizeVariant = SnappyButtonSizeVariant.Default(),
    styleVariant: SnappyButtonStyleVariant = SnappyButtonStyleVariant.Primary(),
    onClick: () -> Unit = {},
    enabled: Boolean = true,
    loading: Boolean = false,
    @DrawableRes iconRes: Int = 0,
) {
    var buttonModifier = modifier.defaultMinSize(minHeight = sizeVariant.minHeight)

    val outlineColor = styleVariant.outlineColor
    if (outlineColor != null) {
        buttonModifier = buttonModifier.border(1.dp, outlineColor, SnappyTheme.shapes.borderRounded)
    }

    val buttonColors = when (styleVariant.outlineColor) {
        null -> ButtonDefaults.buttonColors(
            backgroundColor = styleVariant.primaryColor,
            contentColor = styleVariant.contentColor,
            disabledBackgroundColor = styleVariant.primaryColorDisabled,
            disabledContentColor = styleVariant.contentColorDisabled,
        )
        else -> ButtonDefaults.outlinedButtonColors(
            backgroundColor = styleVariant.primaryColor,
            contentColor = styleVariant.contentColor,
            disabledContentColor = styleVariant.contentColorDisabled,
        )
    }

    Button(
        modifier = buttonModifier,
        elevation = ButtonDefaults.elevation(0.dp, 0.dp, 0.dp, 0.dp, 0.dp),
        onClick = { onClick() },
        enabled = enabled,
        colors = buttonColors,
        shape = SnappyTheme.shapes.borderRounded,
    ) {
        Box {
            if (loading) {
                CircularProgressIndicator(
                    color = styleVariant.contentColor,
                    strokeWidth = 2.dp,
                    modifier = Modifier
                        .size(sizeVariant.loaderSize)
                        .align(Alignment.Center)
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.alpha(if (loading) 0f else 1f)
            ) {
                if (iconRes > 0) {
                    Icon(
                        painter = painterResource(id = iconRes),
                        contentDescription = null,
                        tint = styleVariant.contentColor,
                        modifier = Modifier.padding(end = sizeVariant.iconSpacing)
                    )
                }
                Text(
                    text = text,
                    color = styleVariant.contentColor,
                    style = sizeVariant.textStyle,
                )
            }
        }
    }
}

