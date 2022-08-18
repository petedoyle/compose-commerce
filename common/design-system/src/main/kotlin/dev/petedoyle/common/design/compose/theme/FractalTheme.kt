package dev.petedoyle.common.design.compose.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun FractalTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors: FractalColors = if (darkTheme) {
        FractalDarkColors()
    } else {
        FractalLightColors()
    }

    val fractalTypography = defaultFractalTypography()
    CompositionLocalProvider(
        LocalFractalColors provides colors,
        LocalFractalTypography provides fractalTypography,
        LocalFractalShapes provides FractalShapes(),
        LocalFractalSpacing provides FractalSpacing(),
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
            typography = Typography(defaultFontFamily = fractalTypography.defaultFontFamily),
            content = content
        )
    }
}

/**
 * Helper that allows for easy access of theme values. Examples:
 *
 * - `FractalTheme.colors.border_primary_borderprimary`
 * - `FractalTheme.typography.display1`
 * - `FractalTheme.shapes.borderRounded`
 * - `FractalTheme.spacing.xxl`
 */
object FractalTheme {
    val colors: FractalColors
        @Composable
        get() = LocalFractalColors.current

    val typography: FractalTypography
        @Composable
        get() = LocalFractalTypography.current

    val shapes: FractalShapes
        @Composable
        get() = LocalFractalShapes.current

    val spacing: FractalSpacing
        @Composable
        get() = LocalFractalSpacing.current
}
