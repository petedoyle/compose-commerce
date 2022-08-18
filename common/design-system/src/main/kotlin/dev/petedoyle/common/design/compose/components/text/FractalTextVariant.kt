package dev.petedoyle.common.design.compose.components.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import dev.petedoyle.common.design.compose.theme.FractalTheme

sealed class FractalTextVariant {
    @Composable
    abstract fun textStyle(): TextStyle

    @Composable
    fun defaultColor(): Color = FractalTheme.colors.onbackground_onbackground.value

    override fun equals(other: Any?): Boolean = this === other
    override fun hashCode(): Int = System.identityHashCode(this)

    object Display1 : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.display1
    }

    object Display2 : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.display2
    }

    object Display3 : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.display3
    }

    object Heading1 : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.heading1
    }

    object Heading2 : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.heading2
    }

    object Heading3 : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.heading3
    }

    object Body1 : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.body1
    }

    object Body2 : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.body2
    }

    object Body3 : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.body3
    }

    object Label1 : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.label1
    }

    object Label2 : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.label2
    }

    object Label3 : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.label3
    }

    object Label4 : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.label4
    }

    object Caption1 : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.caption1
    }

    object Caption2 : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.caption2
    }

    object Snippet : FractalTextVariant() {
        @Composable
        override fun textStyle(): TextStyle = FractalTheme.typography.snippet
    }
}