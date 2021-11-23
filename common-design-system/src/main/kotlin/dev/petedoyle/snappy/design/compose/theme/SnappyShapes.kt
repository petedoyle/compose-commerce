package dev.petedoyle.snappy.design.compose.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.dp

///////////////////////////////////////////////////////////////////////////
// GENERATED. Do not edit by hand.
///////////////////////////////////////////////////////////////////////////

val LocalSnappyShapes = staticCompositionLocalOf { SnappyShapes() }

@Immutable
data class SnappyShapes(
    val borderRounded: RoundedCornerShape = RoundedCornerShape(
        topStart = 6.dp,
        topEnd = 6.dp,
        bottomStart = 6.dp,
        bottomEnd = 6.dp
    ),
    val borderCircle: RoundedCornerShape = RoundedCornerShape(
        topStart = 100.dp,
        topEnd = 100.dp,
        bottomStart = 100.dp,
        bottomEnd = 100.dp
    ),
)