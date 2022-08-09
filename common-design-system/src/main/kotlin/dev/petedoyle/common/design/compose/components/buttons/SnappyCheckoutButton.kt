package dev.petedoyle.common.design.compose.components.buttons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import dev.petedoyle.commerce.design.compose.R
import dev.petedoyle.common.design.compose.theme.SnappyTheme

@Composable
fun SnappyCheckoutButton(
    modifier: Modifier = Modifier,
    sizeVariant: SnappyButtonSizeVariant = SnappyButtonSizeVariant.Default(),
    styleVariant: SnappyButtonStyleVariant = SnappyButtonStyleVariant.Primary(),
    onClick: () -> Unit = {},
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    SnappyButton(
        text = stringResource(id = R.string.snappy_checkout),
        modifier = modifier,
        sizeVariant = sizeVariant,
        styleVariant = styleVariant,
        iconRes = R.drawable.ico_lock_24,
        onClick = onClick,
        enabled = enabled,
        loading = loading,
    )
}

@Preview(name = "Light", uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    backgroundColor = 0xFF000000
)
@Composable
private fun Preview() {
    SnappyTheme {
        SnappyCheckoutButton(onClick = {})
    }
}