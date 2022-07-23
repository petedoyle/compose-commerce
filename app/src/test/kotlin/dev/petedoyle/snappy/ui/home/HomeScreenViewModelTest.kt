package dev.petedoyle.snappy.ui.home

import app.cash.turbine.test
import dev.petedoyle.snappy.common.api.bigcommerce.BigCommerceManagementApi
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.Category
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.MetaCollectionFull
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductFull
import dev.petedoyle.snappy.common.api.bigcommerce.models.CategoryCollectionResponse
import dev.petedoyle.snappy.common.api.bigcommerce.models.ProductCollectionResponse
import dev.petedoyle.common.test.TestBase
import dev.petedoyle.snappy.cart.CartStore
import dev.petedoyle.snappy.cart.LocalCartStore
import com.nhaarman.expect.expect
import com.slack.eithernet.ApiResult
import com.slack.eithernet.ExperimentalEitherNetApi
import com.slack.eithernet.test.enqueue
import com.slack.eithernet.test.newEitherNetController
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductImageFull
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
@ExperimentalEitherNetApi
class HomeScreenViewModelTest : TestBase() {
    private lateinit var viewModel: HomeScreenViewModel

    private val cartStore: CartStore = LocalCartStore()
    private val fakeApiController = newEitherNetController<BigCommerceManagementApi>()

    @Before
    fun setup() {
        // For loading from init {}
        fakeApiController.enqueue(
            BigCommerceManagementApi::listFeaturedProducts, ApiResult.success(
                ProductCollectionResponse(
                    data = listOf(
                        ProductFull(
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
                        ),
                    )
                )
            )
        )

        fakeApiController.enqueue(
            BigCommerceManagementApi::listCategories, ApiResult.success(
                CategoryCollectionResponse(
                    data = listOf(
                        Category(
                            parentId = 0,
                            name = "Garden",
                        )
                    ),
                    meta = MetaCollectionFull()
                )
            )
        )

        viewModel = HomeScreenViewModel(
            managementApi = fakeApiController.api,
            cartStore = cartStore,
            dispatcherProvider = coroutinesTestRule.testDispatcherProvider,
        )
    }

    @Test
    fun `Clicking a product should navigate to the product detail screen`() = runTest {
        viewModel.effectFlow.test {
            // When
            viewModel.onAction(ProductClicked(productId = 111))

            // Then
            expect(awaitItem()).toBe(NavigateToProductDetail(111))
        }
    }

    @Test
    fun `Clicking the shopping cart icon should navigate to the cart screen`() = runTest {
        viewModel.effectFlow.test {
            // When
            viewModel.onAction(ShoppingCartClicked)

            // Then
            expect(awaitItem()).toBe(NavigateToCart)
        }
    }
}