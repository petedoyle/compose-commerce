package dev.petedoyle.common.design.compose.components.buttons

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.petedoyle.common.design.compose.theme.FractalTheme

sealed class FractalButtonSizeVariant(
    val minHeight: Dp,
    val loaderSize: Dp,
) {
    @get:Composable
    abstract val iconSpacing: Dp

    @get:Composable
    abstract val textStyle: TextStyle

    override fun equals(other: Any?): Boolean = this === other
    override fun hashCode(): Int = System.identityHashCode(this)

    class Default : FractalButtonSizeVariant(
        minHeight = 48.dp,
        loaderSize = 20.dp,
    ) {
        override val iconSpacing: Dp
            @Composable
            get() = FractalTheme.spacing.s

        override val textStyle: TextStyle
            @Composable
            get() = FractalTheme.typography.label2
    }

    class Compact : FractalButtonSizeVariant(
        minHeight = 36.dp,
        loaderSize = 14.dp,
    ) {
        override val iconSpacing: Dp
            @Composable
            get() = FractalTheme.spacing.xs

        override val textStyle: TextStyle
            @Composable
            get() = FractalTheme.typography.label3
    }

    class Tiny : FractalButtonSizeVariant(
        minHeight = 28.dp,
        loaderSize = 14.dp,
    ) {
        override val iconSpacing: Dp
            @Composable
            get() = FractalTheme.spacing.xs

        override val textStyle: TextStyle
            @Composable
            get() = FractalTheme.typography.label4
    }
}