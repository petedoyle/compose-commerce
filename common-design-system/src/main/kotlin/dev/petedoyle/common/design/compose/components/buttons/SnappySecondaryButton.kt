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
import dev.petedoyle.common.design.compose.theme.SnappyTheme

@Composable
fun SnappySecondaryButton(
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
            backgroundColor = SnappyTheme.colors.secondary_secondary.value,
            contentColor = SnappyTheme.colors.onsecondary_onsecondary.value,
            disabledBackgroundColor = SnappyTheme.colors.secondary_secondarydisabled.value,
            disabledContentColor = SnappyTheme.colors.onsecondary_onsecondarydisabled.value,
        ),
        modifier = modifier
            .defaultMinSize(minHeight = 48.dp)
            .border(
                1.dp,
                SnappyTheme.colors.onsecondary_onsecondary.value,
                SnappyTheme.shapes.borderRounded,
            ),
        shape = SnappyTheme.shapes.borderRounded,
    ) {
        Text(
            text = text,
            color = when (enabled) {
                true -> SnappyTheme.colors.onsecondary_onsecondary.value
                else -> SnappyTheme.colors.onsecondary_onsecondarydisabled.value
            },
            style = SnappyTheme.typography.label1,
        )
    }
}

@Preview(name = "Light", uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true)
@Preview(name = "Dark", uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
private fun Preview() {
    SnappyTheme {
        SnappySecondaryButton(
            text = "Secondary",
            onClick = {},
        )
    }
}