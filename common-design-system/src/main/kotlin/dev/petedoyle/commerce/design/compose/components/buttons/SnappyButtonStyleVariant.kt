package dev.petedoyle.commerce.design.compose.components.buttons

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import dev.petedoyle.commerce.design.compose.theme.SnappyTheme

sealed class SnappyButtonStyleVariant {
    @get:Composable
    abstract val primaryColor: Color

    @get:Composable
    abstract val primaryColorDisabled: Color

    @get:Composable
    abstract val contentColor: Color

    @get:Composable
    abstract val contentColorDisabled: Color

    @get:Composable
    abstract val outlineColor: Color?

    @get:Composable
    abstract val outlineColorDisabled: Color?

    override fun equals(other: Any?): Boolean = this === other
    override fun hashCode(): Int = System.identityHashCode(this)

    class Primary : SnappyButtonStyleVariant() {
        override val primaryColor: Color
            @Composable
            get() = SnappyTheme.colors.primary_primary.value

        override val primaryColorDisabled: Color
            @Composable
            get() = SnappyTheme.colors.primary_primarydisabled.value

        override val contentColor: Color
            @Composable
            get() = SnappyTheme.colors.onprimary_onprimary.value

        override val contentColorDisabled: Color
            @Composable
            get() = SnappyTheme.colors.onprimary_onprimarydisabled.value

        override val outlineColor: Color?
            @Composable
            get() = null

        override val outlineColorDisabled: Color?
            @Composable
            get() = null
    }

    class Secondary : SnappyButtonStyleVariant() {
        override val primaryColor: Color
            @Composable
            get() = SnappyTheme.colors.secondary_secondary.value

        override val primaryColorDisabled: Color
            @Composable
            get() = SnappyTheme.colors.secondary_secondarydisabled.value

        override val contentColor: Color
            @Composable
            get() = SnappyTheme.colors.onsecondary_onsecondary.value

        override val contentColorDisabled: Color
            @Composable
            get() = SnappyTheme.colors.onsecondary_onsecondarydisabled.value


        override val outlineColor: Color?
            @Composable
            get() = SnappyTheme.colors.border_secondary_bordersecondary.value

        override val outlineColorDisabled: Color?
            @Composable
            get() = SnappyTheme.colors.border_primary_borderprimarydisabled.value
    }

    class DestructivePrimary : SnappyButtonStyleVariant() {
        override val primaryColor: Color
            @Composable
            get() = SnappyTheme.colors.error_error_errorprimary.value

        override val primaryColorDisabled: Color
            @Composable
            get() = SnappyTheme.colors.error_states_errorprimary_errorprimarydisabled.value

        override val contentColor: Color
            @Composable
            get() = SnappyTheme.colors.error_onerror_onerrorprimary.value

        override val contentColorDisabled: Color
            @Composable
            get() = SnappyTheme.colors.error_onerror_onerrordisabled.value

        override val outlineColor: Color?
            @Composable
            get() = null

        override val outlineColorDisabled: Color?
            @Composable
            get() = null
    }

    class DestructiveSecondary : SnappyButtonStyleVariant() {
        override val primaryColor: Color
            @Composable
            get() = SnappyTheme.colors.error_error_errorsecondary.value

        override val primaryColorDisabled: Color
            @Composable
            get() = SnappyTheme.colors.primary_primarydisabled.value

        override val contentColor: Color
            @Composable
            get() = SnappyTheme.colors.error_onerror_onerrorsecondary.value

        override val contentColorDisabled: Color
            @Composable
            get() = SnappyTheme.colors.error_onerror_onerrorsecondary.value

        override val outlineColor: Color?
            @Composable
            get() = SnappyTheme.colors.border_error_bordererror.value

        override val outlineColorDisabled: Color?
            @Composable
            get() = SnappyTheme.colors.border_error_bordererrordisabled.value
    }
}