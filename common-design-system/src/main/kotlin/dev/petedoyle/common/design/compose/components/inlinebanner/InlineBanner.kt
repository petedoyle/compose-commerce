package dev.petedoyle.common.design.compose.components.inlinebanner

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import dev.petedoyle.commerce.design.compose.R
import dev.petedoyle.common.design.compose.theme.FractalTheme

@Composable
fun InlineBanner(
    text: String,
    variant: InlineBannerVariant,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
) {
    InlineBanner(
        text = AnnotatedString(text),
        variant = variant,
        modifier = modifier,
        onClick = onClick
    )
}

@Composable
fun InlineBanner(
    text: AnnotatedString,
    variant: InlineBannerVariant,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
) {
    Box(
        modifier
            .clip(FractalTheme.shapes.borderRounded)
            .clickable(enabled = onClick != null) { onClick?.invoke() }
            .border(
                width = 1.dp,
                color = FractalTheme.colors.border_primary_borderprimary.value,
                shape = FractalTheme.shapes.borderRounded
            )
            .background(FractalTheme.colors.background_backgroundsecondary.value)
            .padding(FractalTheme.spacing.m),
        contentAlignment = Alignment.Center,
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = R.drawable.ico_infocircle_24),
                contentDescription = stringResource(variant.iconContentDescription()),
                tint = variant.iconTint(),
                modifier = Modifier.align(Alignment.CenterVertically)
            )

            Text(
                text = text,
                style = FractalTheme.typography.label4,
                color = FractalTheme.colors.onbackground_onbackground.value,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = FractalTheme.spacing.xs)
            )
        }
    }
}

@Preview(name = "Light", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(name = "Dark", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview(@PreviewParameter(InlineBannerVariantProvider::class) variant: InlineBannerVariant) {
    FractalTheme {
        InlineBanner(
            text = "Banner message goes here.",
            variant = variant,
        )
    }
}