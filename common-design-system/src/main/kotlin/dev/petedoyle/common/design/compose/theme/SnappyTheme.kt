package dev.petedoyle.common.design.compose.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun SnappyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors: SnappyColors = if (darkTheme) {
        SnappyDarkColors()
    } else {
        SnappyLightColors()
    }

    val snappyTypography = defaultSnappyTypography()
    CompositionLocalProvider(
        LocalSnappyColors provides colors,
        LocalSnappyTypography provides snappyTypography,
        LocalSnappyShapes provides SnappyShapes(),
        LocalSnappySpacing provides SnappySpacing(),
    ) {
        MaterialTheme(
            colors = Colors(
                primary = colors.primary_primary.value,
                primaryVariant = colors.primary_primaryactive.value,
                secondary = colors.secondary_secondary.value,
                secondaryVariant = colors.secondary_secondaryactive.value,
                background = colors.background_backgroundprimary.value,
                surface = colors.surface_surface.value,
                error = colors.error_error_errorprimary.value,
                onPrimary = colors.onprimary_onprimary.value,
                onSecondary = colors.onsecondary_onsecondary.value,
                onBackground = colors.onbackground_onbackground.value,
                onSurface = colors.onsurface_onsurface.value,
                onError = colors.error_onerror_onerrorprimary.value,
                isLight = !darkTheme,
            ),
            typography = Typography(defaultFontFamily = snappyTypography.defaultFontFamily),
            content = content
        )
    }
}

/**
 * Helper that allows for easy access of theme values. Examples:
 *
 * - `SnappyTheme.colors.border_primary_borderprimary`
 * - `SnappyTheme.typography.display1`
 * - `SnappyTheme.shapes.borderRounded`
 * - `SnappyTheme.spacing.xxl`
 */
object SnappyTheme {
    val colors: SnappyColors
        @Composable
        get() = LocalSnappyColors.current

    val typography: SnappyTypography
        @Composable
        get() = LocalSnappyTypography.current

    val shapes: SnappyShapes
        @Composable
        get() = LocalSnappyShapes.current

    val spacing: SnappySpacing
        @Composable
        get() = LocalSnappySpacing.current
}
