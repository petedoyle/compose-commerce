package dev.petedoyle.commerce.design.compose.components.text

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import dev.petedoyle.commerce.design.compose.theme.SnappyTheme

@Composable
fun SnappyText(
    text: String,
    snappyTextVariant: SnappyTextVariant,
    modifier: Modifier = Modifier,
    color: Color = snappyTextVariant.defaultColor(),
    onTextLayout: (TextLayoutResult) -> Unit = {},
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
) {
    BasicText(
        text = text,
        style = snappyTextVariant.textStyle().copy(color = color),
        modifier = modifier,
        onTextLayout = onTextLayout,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
    )
}

@Composable
fun SnappyText(
    text: AnnotatedString,
    snappyTextVariant: SnappyTextVariant,
    modifier: Modifier = Modifier,
    color: Color = snappyTextVariant.defaultColor(),
    onTextLayout: (TextLayoutResult) -> Unit = {},
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    inlineContent: Map<String, InlineTextContent> = mapOf(),
) {
    BasicText(
        text = text,
        style = snappyTextVariant.textStyle().copy(color = color),
        modifier = modifier,
        onTextLayout = onTextLayout,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        inlineContent = inlineContent,
    )
}

@Composable
fun SnappyTextGallery(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(SnappyTheme.spacing.xxs),
        modifier = modifier.padding(SnappyTheme.spacing.m)
    ) {
        SnappyText("Display1", SnappyTextVariant.Display1)
        SnappyText("Display2", SnappyTextVariant.Display2)
        SnappyText("Display 3", SnappyTextVariant.Display3)
        SnappyText("Heading 1", SnappyTextVariant.Heading1)
        SnappyText("Heading 2", SnappyTextVariant.Heading2)
        SnappyText("Heading 3", SnappyTextVariant.Heading3)
        SnappyText("Body 1", SnappyTextVariant.Body1)
        SnappyText("Body 2", SnappyTextVariant.Body2)
        SnappyText("Body 3", SnappyTextVariant.Body3)
        SnappyText("Label 1", SnappyTextVariant.Label1)
        SnappyText("Label 2", SnappyTextVariant.Label2)
        SnappyText("Label 3", SnappyTextVariant.Label3)
        SnappyText("Label 4", SnappyTextVariant.Label4)
        SnappyText("Caption 1", SnappyTextVariant.Caption1)
        SnappyText("Caption 2", SnappyTextVariant.Caption2)
        SnappyText("Snippet", SnappyTextVariant.Snippet)
    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview() {
    SnappyTheme {
        SnappyTextGallery(
            modifier = Modifier.background(SnappyTheme.colors.background_backgroundprimary.value)
        )
    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewParagraph() {
    SnappyTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(SnappyTheme.spacing.xs),
            modifier = Modifier
                .background(SnappyTheme.colors.background_backgroundprimary.value)
                .padding(SnappyTheme.spacing.m)
        ) {
            SnappyText(
                "Lorem Ipsum",
                SnappyTextVariant.Heading1
            )
            SnappyText(
                text = buildAnnotatedString {
                    append("Lorem ipsum dolor sit amet, ")
                    withStyle(
                        style = SpanStyle(
                            color = SnappyTheme.colors.error_onerror_onerrorprimary.value,
                            background = SnappyTheme.colors.error_error_errorprimary.value,
                        )
                    ) {
                        append("consectetur adipiscing elit")
                    }
                    append(", sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")
                },
                snappyTextVariant = SnappyTextVariant.Body1,
            )
        }
    }
}