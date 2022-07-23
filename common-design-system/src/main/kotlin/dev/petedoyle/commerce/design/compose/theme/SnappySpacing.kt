package dev.petedoyle.commerce.design.compose.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

///////////////////////////////////////////////////////////////////////////
// GENERATED. Do not edit by hand.
///////////////////////////////////////////////////////////////////////////

val LocalSnappySpacing = staticCompositionLocalOf { SnappySpacing() }

@Immutable
data class SnappySpacing(
    val xxs: Dp = 4.dp,
    val xs: Dp = 8.dp,
    val s: Dp = 12.dp,
    val m: Dp = 16.dp,
    val l: Dp = 20.dp,
    val xl: Dp = 24.dp,
    val xxl: Dp = 32.dp,
    val xxxl: Dp = 40.dp,
    val xxxxl: Dp = 64.dp,
)