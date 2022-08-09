package dev.petedoyle.common.design.compose.components.buttons

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import dev.petedoyle.common.design.compose.theme.FractalTheme

sealed class FractalButtonStyleVariant {
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

    class Primary : FractalButtonStyleVariant() {
        override val primaryColor: Color
            @Composable
            get() = FractalTheme.colors.primary_primary.value

        override val primaryColorDisabled: Color
            @Composable
            get() = FractalTheme.colors.primary_primarydisabled.value

        override val contentColor: Color
            @Composable
            get() = FractalTheme.colors.onprimary_onprimary.value

        override val contentColorDisabled: Color
            @Composable
            get() = FractalTheme.colors.onprimary_onprimarydisabled.value

        override val outlineColor: Color?
            @Composable
            get() = null

        override val outlineColorDisabled: Color?
            @Composable
            get() = null
    }

    class Secondary : FractalButtonStyleVariant() {
        override val primaryColor: Color
            @Composable
            get() = FractalTheme.colors.secondary_secondary.value

        override val primaryColorDisabled: Color
            @Composable
            get() = FractalTheme.colors.secondary_secondarydisabled.value

        override val contentColor: Color
            @Composable
            get() = FractalTheme.colors.onsecondary_onsecondary.value

        override val contentColorDisabled: Color
            @Composable
            get() = FractalTheme.colors.onsecondary_onsecondarydisabled.value


        override val outlineColor: Color?
            @Composable
            get() = FractalTheme.colors.border_secondary_bordersecondary.value

        override val outlineColorDisabled: Color?
            @Composable
            get() = FractalTheme.colors.border_primary_borderprimarydisabled.value
    }

    class DestructivePrimary : FractalButtonStyleVariant() {
        override val primaryColor: Color
            @Composable
            get() = FractalTheme.colors.error_error_errorprimary.value

        override val primaryColorDisabled: Color
            @Composable
            get() = FractalTheme.colors.error_states_errorprimary_errorprimarydisabled.value

        override val contentColor: Color
            @Composable
            get() = FractalTheme.colors.error_onerror_onerrorprimary.value

        override val contentColorDisabled: Color
            @Composable
            get() = FractalTheme.colors.error_onerror_onerrordisabled.value

        override val outlineColor: Color?
            @Composable
            get() = null

        override val outlineColorDisabled: Color?
            @Composable
            get() = null
    }

    class DestructiveSecondary : FractalButtonStyleVariant() {
        override val primaryColor: Color
            @Composable
            get() = FractalTheme.colors.error_error_errorsecondary.value

        override val primaryColorDisabled: Color
            @Composable
            get() = FractalTheme.colors.primary_primarydisabled.value

        override val contentColor: Color
            @Composable
            get() = FractalTheme.colors.error_onerror_onerrorsecondary.value

        override val contentColorDisabled: Color
            @Composable
            get() = FractalTheme.colors.error_onerror_onerrorsecondary.value

        override val outlineColor: Color?
            @Composable
            get() = FractalTheme.colors.border_error_bordererror.value

        override val outlineColorDisabled: Color?
            @Composable
            get() = FractalTheme.colors.border_error_bordererrordisabled.value
    }
}