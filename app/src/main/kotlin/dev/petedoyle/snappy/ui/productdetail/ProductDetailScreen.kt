package dev.petedoyle.snappy.ui.productdetail

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.text.HtmlCompat
import androidx.navigation.NavHostController
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductFull
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductVariantFull
import dev.petedoyle.snappy.design.compose.components.buttons.SnappyCheckoutButton
import dev.petedoyle.snappy.design.compose.components.buttons.SnappySecondaryButton
import dev.petedoyle.snappy.design.compose.components.inlinebanner.InlineBanner
import dev.petedoyle.snappy.design.compose.components.inlinebanner.InlineBannerVariant
import dev.petedoyle.snappy.design.compose.theme.ASPECT_RATIO_SQUARE
import dev.petedoyle.snappy.design.compose.theme.SnappyTheme
import dev.petedoyle.snappy.design.compose.theme.IMAGE_CROSSFADE_MS
import dev.petedoyle.snappy.BC_INVENTORY_TRACKING_NONE
import dev.petedoyle.snappy.BC_INVENTORY_TRACKING_PRODUCT
import dev.petedoyle.snappy.R
import dev.petedoyle.snappy.ui.Screen
import dev.petedoyle.snappy.ui.components.SnappyTopAppBarSecondary
import dev.petedoyle.snappy.ui.productdetail.components.ProductOptionsSelector
import dev.petedoyle.snappy.ui.productdetail.components.rememberProductOptionsSelectorState
import coil.compose.rememberImagePainter
import coil.size.Scale
import com.google.accompanist.insets.navigationBarsHeight
import com.google.accompanist.placeholder.PlaceholderHighlight
import com.google.accompanist.placeholder.material.placeholder
import com.google.accompanist.placeholder.material.shimmer
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductImageFull

@Composable
fun ProductDetailScreen(
    viewModel: ProductDetailScreenViewModel,
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
    val context = LocalContext.current
    LaunchedEffect(viewModel) {
        viewModel.effectFlow.collect { effect ->
            when (effect) {
                NavigateBack -> navController.popBackStack()
                NavigateToCart -> {
                    navController.popBackStack()
                    navController.navigate(Screen.Cart.route)
                }
                is LaunchCheckoutEffect -> {
                }
                NetworkError -> Toast.makeText(context, "Network Error", Toast.LENGTH_SHORT).show()
            }
        }
    }

    ProductDetailScreen(
        uiState = uiState,
        onBackClicked = { viewModel.onAction(BackClicked) },
        onShoppingCartClicked = { viewModel.onAction(ShoppingCartClicked) },
        onProductVariantSelected = { viewModel.onAction(ProductVariantSelected(it)) },
        onCheckoutButtonClicked = { viewModel.onAction(CheckoutClicked) },
        onAddToCartClicked = { viewModel.onAction(AddToCartClicked) },
    )
}

@Composable
fun ProductDetailScreen(
    uiState: ProductDetailScreenState,
    onBackClicked: () -> Unit,
    onShoppingCartClicked: () -> Unit,
    onProductVariantSelected: (variant: ProductVariantFull) -> Unit,
    onCheckoutButtonClicked: () -> Unit,
    onAddToCartClicked: () -> Unit,
) {
    val scaffoldState = rememberScaffoldState()
    val scrollState = rememberScrollState()

    val product = uiState.product
    val variants = uiState.variants
    val categories = uiState.categories
    val productImageUrl =
        when (uiState.selectedVariant == null || uiState.selectedVariant.imageUrl.isNullOrBlank()) {
            true -> product?.images?.getOrNull(0)?.urlStandard
            else -> uiState.selectedVariant.imageUrl
        }

    val productPrice: Float = when (uiState.selectedVariant != null) {
        true -> uiState.selectedVariant.calculatedPrice?.toFloat() ?: 0.0f
        else -> product?.calculatedPrice ?: 0.0f
    }

    Scaffold(
        topBar = {
            SnappyTopAppBarSecondary(
                title = product?.name.orEmpty(),
                toolbarShoppingCartBadgeEnabled = uiState.cartState.items.isNotEmpty(),
                onBackClicked = { onBackClicked() },
                onShoppingCartClicked = { onShoppingCartClicked() }
            )
        },
        scaffoldState = scaffoldState,
        backgroundColor = SnappyTheme.colors.background_backgroundprimary.value,
    ) {
        Column(Modifier.fillMaxSize()) {
            Column(
                Modifier
                    .weight(1f)
                    .verticalScroll(scrollState)
                    .background(SnappyTheme.colors.background_backgroundprimary.value)
                    .padding(bottom = SnappyTheme.spacing.xs)
            ) {
                Image(
                    painter = rememberImagePainter(
                        data = productImageUrl,
                        builder = {
                            scale(Scale.FILL)
                            crossfade(IMAGE_CROSSFADE_MS)
                        }
                    ),
                    contentDescription = null,
                    modifier = Modifier.aspectRatio(ASPECT_RATIO_SQUARE)
                )
                Text(
                    text = categories
                        .filter { product?.categories.orEmpty().contains(it.id) }
                        .joinToString { it.name },
                    color = SnappyTheme.colors.onbackground_onbackgroundvariant2.value,
                    style = SnappyTheme.typography.label3,
                    modifier = Modifier
                        .padding(
                            top = SnappyTheme.spacing.m,
                            start = SnappyTheme.spacing.m,
                            end = SnappyTheme.spacing.m,
                        )
                        .placeholder(
                            visible = uiState.loading,
                            highlight = PlaceholderHighlight.shimmer(),
                        ),
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                )

                Text(
                    text = product?.name.orEmpty(),
                    color = SnappyTheme.colors.onbackground_onbackground.value,
                    style = SnappyTheme.typography.display3,
                    modifier = Modifier
                        .padding(horizontal = SnappyTheme.spacing.m)
                        .placeholder(
                            visible = uiState.loading,
                            highlight = PlaceholderHighlight.shimmer(),
                        ),
                )

                Text(
                    text = stringResource(R.string.price_format, productPrice),
                    color = SnappyTheme.colors.onbackground_onbackground.value,
                    style = SnappyTheme.typography.heading3,
                    modifier = Modifier
                        .padding(horizontal = SnappyTheme.spacing.m)
                        .placeholder(
                            visible = uiState.loading,
                            highlight = PlaceholderHighlight.shimmer(),
                        ),
                )

                Text(
                    text = HtmlCompat.fromHtml(
                        product?.description.orEmpty(),
                        HtmlCompat.FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM
                    ).toString().trim(),
                    color = SnappyTheme.colors.onbackground_onbackgroundvariant1.value,
                    style = SnappyTheme.typography.body3,
                    modifier = Modifier
                        .padding(
                            top = SnappyTheme.spacing.m,
                            start = SnappyTheme.spacing.m,
                            end = SnappyTheme.spacing.m,
                        )
                        .placeholder(
                            visible = uiState.loading,
                            highlight = PlaceholderHighlight.shimmer(),
                        ),
                )

                val inStock = product?.inventoryTracking?.value == BC_INVENTORY_TRACKING_NONE
                        || (product?.inventoryTracking?.value == BC_INVENTORY_TRACKING_PRODUCT && product.inventoryLevel ?: 0 > 0)
                        || variants.any { it.inventoryLevel ?: 0 > 0 }

                if (!inStock) {
                    OutOfStockBanner()
                }

                if (product != null && uiState.variants.isNotEmpty() && inStock) {
                    val state = rememberProductOptionsSelectorState(
                        product = uiState.product,
                        variants = uiState.variants,
                    )

                    ProductOptionsSelector(
                        state,
                        onVariantSelected = { onProductVariantSelected(it) },
                        Modifier.padding(top = SnappyTheme.spacing.m)
                    )
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
                enabled = uiState.selectedVariant != null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(SnappyTheme.spacing.m),
            )

            SnappySecondaryButton(
                text = stringResource(R.string.add_to_cart),
                onClick = onAddToCartClicked,
                enabled = uiState.selectedVariant != null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = SnappyTheme.spacing.m)
                    .padding(bottom = SnappyTheme.spacing.m),
            )

            Spacer(Modifier.navigationBarsHeight())
        }
    }
}

@Composable
private fun OutOfStockBanner() {
    InlineBanner(
        text = stringResource(R.string.out_of_stock),
        variant = InlineBannerVariant.Error,
        modifier = Modifier.padding(
            horizontal = SnappyTheme.spacing.m,
            vertical = SnappyTheme.spacing.l,
        )
    )
}

@Preview
@Composable
fun PreviewProductDetailScreen() {
    SnappyTheme {
        ProductDetailScreen(
            uiState = ProductDetailScreenState(
                product = ProductFull(
                    id = 86,
                    name = "Able Brewing System",
                    type = ProductFull.Type.physical,
                    weight = 1.0f,
                    calculatedPrice = 225.00f,
                    price = 225.00f,
                    images = listOf(
                        ProductImageFull(
                            urlThumbnail = "https://cdn11.bigcommerce.com/s-c22nuunnpp/products/86/images/283/ablebrewingsystem1.1652641773.220.290.jpg?c=1"
                        )
                    ),
                    categories = listOf(0, 1, 2),
                )
            ),
            onBackClicked = {},
            onShoppingCartClicked = {},
            onProductVariantSelected = {},
            onCheckoutButtonClicked = {},
            onAddToCartClicked = {},
        )
    }
}

