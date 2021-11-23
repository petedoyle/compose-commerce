package dev.petedoyle.snappy.design.compose.components.buttons

import android.content.res.Configuration
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.petedoyle.snappy.design.compose.theme.SnappyTheme

@Composable
fun SnappyPrimaryButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    enabled: Boolean = true,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        elevation = ButtonDefaults.elevation(0.dp, 0.dp, 0.dp, 0.dp, 0.dp),
        onClick = { onClick() },
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = SnappyTheme.colors.primary_primary.value,
            contentColor = SnappyTheme.colors.onprimary_onprimary.value,
            disabledBackgroundColor = SnappyTheme.colors.primary_primarydisabled.value,
            disabledContentColor = SnappyTheme.colors.onprimary_onprimarydisabled.value,
        ),
        modifier = modifier.defaultMinSize(minHeight = 48.dp),
        shape = SnappyTheme.shapes.borderRounded,
    ) {
        content()
    }
}

@Preview(name = "Light", uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    backgroundColor = 0xff000000
)
@Composable
private fun Preview() {
    SnappyTheme {
        SnappyPrimaryButton(onClick = {}) {
            Text(
                text = "Primary",
                style = SnappyTheme.typography.label1,
                color = SnappyTheme.colors.onprimary_onprimary.value,
            )

        }
    }
}