package dev.petedoyle.common.design.compose.components.buttons

import android.content.res.Configuration
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.petedoyle.common.design.compose.theme.FractalTheme

@Composable
fun FractalSecondaryButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    enabled: Boolean = true,
) {
    Button(
        elevation = ButtonDefaults.elevation(0.dp, 0.dp, 0.dp, 0.dp, 0.dp),
        onClick = { onClick() },
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = FractalTheme.colors.secondary_secondary.value,
            contentColor = FractalTheme.colors.onsecondary_onsecondary.value,
            disabledBackgroundColor = FractalTheme.colors.secondary_secondarydisabled.value,
            disabledContentColor = FractalTheme.colors.onsecondary_onsecondarydisabled.value,
        ),
        modifier = modifier
            .defaultMinSize(minHeight = 48.dp)
            .border(
                1.dp,
                FractalTheme.colors.onsecondary_onsecondary.value,
                FractalTheme.shapes.borderRounded,
            ),
        shape = FractalTheme.shapes.borderRounded,
    ) {
        Text(
            text = text,
            color = when (enabled) {
                true -> FractalTheme.colors.onsecondary_onsecondary.value
                else -> FractalTheme.colors.onsecondary_onsecondarydisabled.value
            },
            style = FractalTheme.typography.label1,
        )
    }
}

@Preview(name = "Light", uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true)
@Preview(name = "Dark", uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
private fun Preview() {
    FractalTheme {
        FractalSecondaryButton(
            text = "Secondary",
            onClick = {},
        )
    }
}