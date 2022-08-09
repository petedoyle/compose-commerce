package dev.petedoyle.common.design.compose.components.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import dev.petedoyle.common.design.compose.theme.SnappyTheme

sealed class SnappyTextVariant {
    @Composable
    abstract fun textStyle(): TextStyle

    @Composable
    fun defaultColor(): Color = SnappyTheme.colors.onbackground_onbackground.value

    override fun equals(other: Any?): Boolean = this === other
    override fun hashCode(): Int = System.identityHashCode(this)

    object Display1 : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.display1
    }

    object Display2 : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.display2
    }

    object Display3 : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.display3
    }

    object Heading1 : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.heading1
    }

    object Heading2 : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.heading2
    }

    object Heading3 : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.heading3
    }

    object Body1 : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.body1
    }

    object Body2 : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.body2
    }

    object Body3 : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.body3
    }

    object Label1 : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.label1
    }

    object Label2 : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.label2
    }

    object Label3 : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.label3
    }

    object Label4 : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.label4
    }

    object Caption1 : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.caption1
    }

    object Caption2 : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.caption2
    }

    object Snippet : SnappyTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = SnappyTheme.typography.snippet
    }
}