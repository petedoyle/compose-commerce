package dev.petedoyle.snappy.ui.cart

import android.content.res.Configuration
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductFull
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductImageFull
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductVariantFull
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductVariantOptionValueFull
import dev.petedoyle.snappy.design.compose.components.buttons.SnappyCheckoutButton
import dev.petedoyle.snappy.design.compose.theme.SnappyTheme
import dev.petedoyle.snappy.R
import dev.petedoyle.snappy.cart.CartLineItem
import dev.petedoyle.snappy.cart.CartState
import dev.petedoyle.snappy.ui.cart.components.CartLineItemRow
import dev.petedoyle.snappy.ui.cart.components.CartSummary
import dev.petedoyle.snappy.ui.components.SnappyTopAppBarSecondary
import com.google.accompanist.insets.navigationBarsPadding
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun CartScreen(
    viewModel: CartScreenViewModel,
    navController: NavHostController
) {
    val uiState = viewModel.stateFlow.collectAsState().value

    // Apply edge-to-edge
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = MaterialTheme.colors.isLight
    SideEffect {
        systemUiController.setSystemBarsColor(
            color = Color.Transparent,
            darkIcons = useDarkIcons
        )
    }

    // Handle ViewModelEffects
    val darkTheme = isSystemInDarkTheme()
    LaunchedEffect(viewModel, darkTheme) {
        viewModel.effectFlow.collect { effect ->
            when (effect) {
                NavigateBackEffect -> navController.popBackStack()
                is LaunchCheckoutEffect -> {
                    if (effect.cartState.items.isNotEmpty()) {
                         if (effect.cartState.items.isNotEmpty()) {
                             // TODO launch checkout
                        }
                    }
                }
            }
        }
    }

    CartScreen(
        uiState = uiState,
        onShoppingCartClicked = { viewModel.onAction(ShoppingCartClicked) },
        onBackClicked = { viewModel.onAction(BackClicked) },
        onCheckoutButtonClicked = { viewModel.onAction(QuickCheckoutClicked) },
        onRemoveLineItemClicked = { viewModel.onAction(RemoveCartLineItemClicked(it)) },
        onChangeLineItemQuantityClicked = { item, newQuantity ->
            viewModel.onAction(UpdateLineItemQuantityClicked(item, newQuantity))
        },
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CartScreen(
    uiState: CartScreenState,
    onBackClicked: () -> Unit,
    onShoppingCartClicked: () -> Unit,
    onCheckoutButtonClicked: () -> Unit,
    onRemoveLineItemClicked: (item: CartLineItem) -> Unit,
    onChangeLineItemQuantityClicked: (item: CartLineItem, newQuantity: Int) -> Unit,
) {
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        topBar = {
            SnappyTopAppBarSecondary(
                title = stringResource(R.string.cart_title),
                toolbarShoppingCartBadgeEnabled = uiState.cartState.items.isNotEmpty(),
                onBackClicked = { onBackClicked() },
                onShoppingCartClicked = { onShoppingCartClicked() }
            )
        },
        scaffoldState = scaffoldState,
        backgroundColor = SnappyTheme.colors.background_backgroundsecondary.value,
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .background(SnappyTheme.colors.background_backgroundprimary.value)
                .padding(
                    bottom = SnappyTheme.spacing.xs,
                )
        ) {
            if (uiState.cartState.items.isEmpty()) {
                EmptyState(Modifier.weight(1f))
            } else {
                LazyColumn(
                    Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    item {
                        Spacer(modifier = Modifier.padding(top = SnappyTheme.spacing.xl))
                    }

                    items(uiState.cartState.items.size, key = { it }) { index ->
                        CartLineItemRow(
                            item = uiState.cartState.items[index],
                            onRemoveLineItemClicked,
                            onChangeLineItemQuantityClicked,
                            Modifier
                                .padding(horizontal = SnappyTheme.spacing.m)
                                .animateItemPlacement()
                        )
                    }

                    item {
                        Divider(
                            color = SnappyTheme.colors.border_primary_borderprimary.value,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = SnappyTheme.spacing.m)
                        )
                    }

                    item {
                        CartSummary(
                            state = uiState.cartState,
                            loading = uiState.recalculatingCartTotals,
                            modifier = Modifier.padding(
                                start = SnappyTheme.spacing.m,
                                top = SnappyTheme.spacing.xl,
                                end = SnappyTheme.spacing.m,
                                bottom = SnappyTheme.spacing.xxxxl,
                            )
                        )
                    }
                }
            }

            Box(
                Modifier
                    .fillMaxWidth()
                    .height(SnappyTheme.spacing.m)
                    .background(SnappyTheme.colors.background_backgroundsecondary.value)
            )

            SnappyCheckoutButton(
                onClick = onCheckoutButtonClicked,
                enabled = uiState.cartState.items.isNotEmpty(),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(SnappyTheme.spacing.m)
                    .navigationBarsPadding(),
            )
        }
    }
}

@Composable
private fun EmptyState(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxWidth()
            .padding(top = SnappyTheme.spacing.xxxxl),
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ico_cart_40),
            contentDescription = null,
            tint = SnappyTheme.colors.onbackground_onbackground.value,
        )
        Text(
            text = stringResource(R.string.cart_empty),
            style = SnappyTheme.typography.heading3,
            textAlign = TextAlign.Center,
            color = SnappyTheme.colors.onbackground_onbackground.value,
            modifier = Modifier.padding(top = SnappyTheme.spacing.xxl)
        )
    }
}

@Preview(name = "Empty state", uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true)
@Preview(name = "Empty state", uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
private fun PreviewEmptyState() {
    SnappyTheme {
        CartScreen(
            uiState = CartScreenState(CartState(items = listOf())),
            onBackClicked = {},
            onShoppingCartClicked = {},
            onCheckoutButtonClicked = {},
            onRemoveLineItemClicked = {},
            onChangeLineItemQuantityClicked = { _, _ -> },
        )
    }
}

@Preview(name = "With items", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(name = "With items", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewWithLineItems() {
    SnappyTheme {
        CartScreen(
            uiState = CartScreenState(
                CartState(
                    items = listOf(

                        // Able Brewing System
                        CartLineItem(
                            quantity = 1,
                            product = ProductFull(
                                id = 86,
                                name = "Able Brewing System",
                                type = ProductFull.Type.physical,
                                weight = 1.0f,
                                price = 225.00f,
                                images = listOf(
                                    ProductImageFull(
                                        urlThumbnail = "https://cdn11.bigcommerce.com/s-c22nuunnpp/products/86/images/283/ablebrewingsystem1.1652641773.220.290.jpg?c=1"
                                    )
                                ),
                                categories = listOf(1, 2, 3),
                            ),
                            variant = ProductVariantFull(
                                id = 66,
                                productId = 86,
                                price = 225.00,
                                inventoryLevel = 200,
                                optionValues = listOf()
                            ),
                        )
                    )
                )
            ),
            onBackClicked = {},
            onShoppingCartClicked = {},
            onCheckoutButtonClicked = {},
            onRemoveLineItemClicked = {},
            onChangeLineItemQuantityClicked = { _, _ -> },
        )
    }
}
