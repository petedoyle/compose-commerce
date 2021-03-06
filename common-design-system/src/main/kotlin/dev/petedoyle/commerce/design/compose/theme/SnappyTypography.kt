package dev.petedoyle.commerce.design.compose.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.petedoyle.commerce.design.compose.R

val LocalSnappyTypography = staticCompositionLocalOf { defaultSnappyTypography() }

@Immutable
data class SnappyTypography(
    val defaultFontFamily: FontFamily,
    val display1: TextStyle,
    val display2: TextStyle,
    val display3: TextStyle,
    val heading1: TextStyle,
    val heading2: TextStyle,
    val heading3: TextStyle,
    val body1: TextStyle,
    val body2: TextStyle,
    val body3: TextStyle,
    val label1: TextStyle,
    val label2: TextStyle,
    val label3: TextStyle,
    val label4: TextStyle,
    val caption1: TextStyle,
    val caption2: TextStyle,
    val snippet: TextStyle,
)

fun defaultSnappyTypography(): SnappyTypography {
    val inter = FontFamily(
        Font(R.font.inter_regular, FontWeight.Normal),
        Font(R.font.inter_medium, FontWeight.Medium),
        Font(R.font.inter_semibold, FontWeight.SemiBold),
        Font(R.font.inter_bold, FontWeight.Bold),
        Font(R.font.inter_extrabold, FontWeight.ExtraBold),
    )

    val sourceCodePro = FontFamily(
        Font(R.font.sourcecodepro_medium, FontWeight.SemiBold),
    )

    return SnappyTypography(
        defaultFontFamily = inter,
        display1 = TextStyle(
            fontFamily = inter,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 40.sp,
            lineHeight = 52.sp,
            letterSpacing = 0.sp,
        ),
        display2 = TextStyle(
            fontFamily = inter,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 28.sp,
            lineHeight = 40.sp,
            letterSpacing = 0.sp,
        ),
        display3 = TextStyle(
            fontFamily = inter,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 23.sp,
            lineHeight = 32.sp,
            letterSpacing = 0.sp,
        ),
        heading1 = TextStyle(
            fontFamily = inter,
            fontWeight = FontWeight.Bold,
            fontSize = 21.sp,
            lineHeight = 28.sp,
            letterSpacing = 0.sp,
        ),
        heading2 = TextStyle(
            fontFamily = inter,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.sp,
        ),
        heading3 = TextStyle(
            fontFamily = inter,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.sp,
        ),
        body1 = TextStyle(
            fontFamily = inter,
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp,
            lineHeight = 28.sp,
            letterSpacing = 0.sp,
        ),
        body2 = TextStyle(
            fontFamily = inter,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.sp,
        ),
        body3 = TextStyle(
            fontFamily = inter,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.sp,
        ),
        label1 = TextStyle(
            fontFamily = inter,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            lineHeight = 28.sp,
            letterSpacing = 0.sp,
        ),
        label2 = TextStyle(
            fontFamily = inter,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.sp,
        ),
        label3 = TextStyle(
            fontFamily = inter,
            fontWeight = FontWeight.SemiBold,
            fontSize = 15.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.sp,
        ),
        label4 = TextStyle(
            fontFamily = inter,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.sp,
        ),
        caption1 = TextStyle(
            fontFamily = inter,
            fontWeight = FontWeight.Medium,
            fontSize = 11.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.sp,
        ),
        caption2 = TextStyle(
            fontFamily = inter,
            fontWeight = FontWeight.Medium,
            fontSize = 10.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.sp,
        ),
        snippet = TextStyle(
            fontFamily = sourceCodePro,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.sp,
        )
    )
}
