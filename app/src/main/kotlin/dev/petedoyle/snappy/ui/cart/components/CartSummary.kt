package dev.petedoyle.snappy.ui.cart.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import dev.petedoyle.snappy.design.compose.theme.SnappyTheme
import dev.petedoyle.snappy.R
import dev.petedoyle.snappy.cart.CartState
import dev.petedoyle.snappy.cart.shipping
import dev.petedoyle.snappy.cart.subtotal
import dev.petedoyle.snappy.cart.taxes
import dev.petedoyle.snappy.cart.total
import com.google.accompanist.placeholder.PlaceholderHighlight
import com.google.accompanist.placeholder.material.placeholder
import com.google.accompanist.placeholder.material.shimmer

@Composable
fun CartSummary(
    state: CartState,
    loading: Boolean,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        CartSummaryRow(
            loading = loading,
            label = "Subtotal",
            value = stringResource(R.string.price_format, state.subtotal()),
            style = SnappyTheme.typography.body3,
        )

        CartSummaryRow(
            loading = loading,
            label = "Shipping",
            value = stringResource(R.string.price_format, state.shipping()),
            style = SnappyTheme.typography.body3,
        )

        CartSummaryRow(
            loading = loading,
            label = "Taxes",
            value = stringResource(R.string.price_format, state.taxes()),
            style = SnappyTheme.typography.body3,
        )

        CartSummaryRow(
            loading = loading,
            label = "Total",
            value = stringResource(R.string.price_format, state.total()),
            style = SnappyTheme.typography.label2,
        )
    }
}

@Composable
private fun CartSummaryRow(
    loading: Boolean,
    label: String,
    value: String,
    style: TextStyle,
) {
    Row(Modifier.padding(top = SnappyTheme.spacing.m)) {
        Text(
            text = label,
            color = SnappyTheme.colors.onbackground_onbackground.value,
            style = style,
        )

        Spacer(Modifier.weight(1f))

        Text(
            text = value,
            color = SnappyTheme.colors.onbackground_onbackground.value,
            style = style,
            modifier = Modifier.placeholder(
                visible = loading,
                highlight = PlaceholderHighlight.shimmer(),
            ),
        )
    }
}

@Preview(name = "Light", uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true)
@Preview(name = "Dark", uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
private fun Preview() {
    SnappyTheme {
        CartSummary(
            state = CartState(),
            loading = false
        )
    }
}