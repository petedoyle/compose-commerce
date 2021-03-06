package dev.petedoyle.commerce.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import dev.petedoyle.commerce.design.compose.theme.SnappyTheme
import dev.petedoyle.commerce.R
import com.google.accompanist.insets.ui.TopAppBar

@Composable
fun SnappyTopAppBarSecondary(
    title: String,
    toolbarShoppingCartBadgeEnabled: Boolean,
    onBackClicked: () -> Unit,
    onShoppingCartClicked: () -> Unit
) {
    TopAppBar(
        elevation = dimensionResource(R.dimen.toolbar_elevation),
        backgroundColor = SnappyTheme.colors.background_backgroundprimary.value,
        contentPadding = WindowInsets.statusBars.asPaddingValues(),
        navigationIcon = {
            IconButton(onClick = { onBackClicked() }) {
                Icon(
                    painter = painterResource(id = R.drawable.ico_chevronleft_24),
                    contentDescription = stringResource(R.string.icon_shopping_cart_content_description),
                    tint = SnappyTheme.colors.onbackground_onbackground.value,
                )
            }
        },
        title = {
            Text(
                text = title,
                style = SnappyTheme.typography.heading3,
                textAlign = TextAlign.Center,
                color = SnappyTheme.colors.onbackground_onbackground.value,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = SnappyTheme.spacing.m),
            )
        },
        actions = {
            IconButton(onClick = { onShoppingCartClicked() }) {
                SnappyTopAppBarShoppingCartIcon(badgeEnabled = toolbarShoppingCartBadgeEnabled)
            }
        }
    )
}

@Preview(name = "Light", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(name = "Dark", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview() {
    SnappyTheme {
        SnappyTopAppBarSecondary(
            title = "Neck Gaiter",
            toolbarShoppingCartBadgeEnabled = true,
            onBackClicked = {},
            onShoppingCartClicked = {},
        )
    }
}