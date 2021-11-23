package dev.petedoyle.snappy.design.compose.components.buttons

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.petedoyle.snappy.design.compose.theme.SnappyTheme

sealed class SnappyButtonSizeVariant(
    val minHeight: Dp,
    val loaderSize: Dp,
) {
    @get:Composable
    abstract val iconSpacing: Dp

    @get:Composable
    abstract val textStyle: TextStyle

    override fun equals(other: Any?): Boolean = this === other
    override fun hashCode(): Int = System.identityHashCode(this)

    class Default : SnappyButtonSizeVariant(
        minHeight = 48.dp,
        loaderSize = 20.dp,
    ) {
        override val iconSpacing: Dp
            @Composable
            get() = SnappyTheme.spacing.s

        override val textStyle: TextStyle
            @Composable
            get() = SnappyTheme.typography.label2
    }

    class Compact : SnappyButtonSizeVariant(
        minHeight = 36.dp,
        loaderSize = 14.dp,
    ) {
        override val iconSpacing: Dp
            @Composable
            get() = SnappyTheme.spacing.xs

        override val textStyle: TextStyle
            @Composable
            get() = SnappyTheme.typography.label3
    }

    class Tiny : SnappyButtonSizeVariant(
        minHeight = 28.dp,
        loaderSize = 14.dp,
    ) {
        override val iconSpacing: Dp
            @Composable
            get() = SnappyTheme.spacing.xs

        override val textStyle: TextStyle
            @Composable
            get() = SnappyTheme.typography.label4
    }
}