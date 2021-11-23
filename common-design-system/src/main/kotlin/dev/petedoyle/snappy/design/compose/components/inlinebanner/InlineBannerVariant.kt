package dev.petedoyle.snappy.design.compose.components.inlinebanner

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import dev.petedoyle.snappy.design.compose.R
import dev.petedoyle.snappy.design.compose.theme.SnappyTheme

sealed class InlineBannerVariant {
    @Composable
    abstract fun iconTint(): Color

    @Composable
    abstract fun iconContentDescription(): Int

    object Info : InlineBannerVariant() {
        @Composable
        override fun iconTint() = SnappyTheme.colors.accent_accent.value

        @Composable
        override fun iconContentDescription() = R.string.inline_banner_info_content_description
    }

    object Error : InlineBannerVariant() {
        @Composable
        override fun iconTint() = SnappyTheme.colors.onbackground_onbackgrounderror.value

        @Composable
        override fun iconContentDescription() = R.string.inline_banner_error_content_description
    }

    object Success : InlineBannerVariant() {
        @Composable
        override fun iconTint() = SnappyTheme.colors.onbackground_onbackgroundsuccess.value

        @Composable
        override fun iconContentDescription() = R.string.inline_banner_success_content_description
    }
}

internal class InlineBannerVariantProvider : PreviewParameterProvider<InlineBannerVariant> {
    override val values = sequenceOf(
        InlineBannerVariant.Info,
        InlineBannerVariant.Error,
        InlineBannerVariant.Success,
    )
    override val count: Int = values.count()
}