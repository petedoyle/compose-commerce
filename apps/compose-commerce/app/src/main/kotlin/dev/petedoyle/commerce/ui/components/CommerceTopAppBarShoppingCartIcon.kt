package dev.petedoyle.commerce.ui.components

import android.content.res.Configuration
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.petedoyle.common.design.compose.theme.FractalTheme
import dev.petedoyle.commerce.R

@Composable
fun CommerceTopAppBarShoppingCartIcon(
    badgeEnabled: Boolean,
    modifier: Modifier = Modifier
) {
    Box(modifier) {
        Icon(
            painter = painterResource(id = R.drawable.ico_cart_24),
            contentDescription = stringResource(R.string.icon_shopping_cart_content_description),
            tint = FractalTheme.colors.onbackground_onbackground.value,
        )

        AnimatedVisibility(
            visible = badgeEnabled,
            modifier = Modifier.align(Alignment.TopEnd)
        ) {
            Box(
                modifier = Modifier
                    .size(8.dp)
                    .clip(CircleShape)
                    .background( // TODO spec is pink800 but looks white in dark mode
                        FractalTheme.colors.primitives_pink_pink500.value,
                        CircleShape
                    )
                    .border(1.dp, FractalTheme.colors.background_backgroundprimary.value, CircleShape)
            )
        }
    }
}

@Preview(name = "Light", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(name = "Dark", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview() {
    FractalTheme {
        CommerceTopAppBarShoppingCartIcon(badgeEnabled = true)
    }
}