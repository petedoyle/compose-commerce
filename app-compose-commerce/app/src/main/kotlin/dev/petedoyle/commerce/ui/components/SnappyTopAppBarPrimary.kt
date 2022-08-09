package dev.petedoyle.commerce.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.petedoyle.commerce.design.compose.theme.SnappyTheme
import dev.petedoyle.commerce.R
import com.google.accompanist.insets.ui.TopAppBar

@Composable
fun SnappyTopAppBarPrimary(
    shoppingCartBadgeEnabled: Boolean,
    onShoppingCartClicked: () -> Unit,
) {
    TopAppBar(
        contentPadding = WindowInsets.statusBars.asPaddingValues(),
        title = {
            Image(
                painter = painterResource(id = R.drawable.logo_top_bar),
                contentDescription = stringResource(R.string.logo_content_description),
                colorFilter = ColorFilter.tint(SnappyTheme.colors.primary_primary.value),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 36.dp) // hack to center the logo
            )
        },
        navigationIcon = null,
        actions = {
            IconButton(
                onClick = { onShoppingCartClicked() },
            ) {
                SnappyTopAppBarShoppingCartIcon(badgeEnabled = shoppingCartBadgeEnabled)
            }
        },
        elevation = dimensionResource(R.dimen.toolbar_elevation),
        backgroundColor = SnappyTheme.colors.background_backgroundprimary.value,
    )
}

@Preview(name = "Light", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(name = "Dark", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview() {
    SnappyTheme {
        SnappyTopAppBarPrimary(
            shoppingCartBadgeEnabled = true,
            onShoppingCartClicked = {},
        )
    }
}