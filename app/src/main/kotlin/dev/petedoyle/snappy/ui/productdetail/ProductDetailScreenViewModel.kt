package dev.petedoyle.snappy.ui.productdetail

import androidx.lifecycle.viewModelScope
import dev.petedoyle.snappy.common.api.bigcommerce.BigCommerceManagementApi
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.Category
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductFull
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductModifierFull
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductVariantFull
import dev.petedoyle.snappy.common.coroutines.DispatcherProvider
import dev.petedoyle.common.mvi.ViewModelBase
import dev.petedoyle.common.mvi.ViewModelState
import dev.petedoyle.snappy.cart.AddLineItem
import dev.petedoyle.snappy.cart.CartLineItem
import dev.petedoyle.snappy.cart.CartState
import dev.petedoyle.snappy.cart.CartStore
import com.slack.eithernet.ApiResult.Failure
import com.slack.eithernet.ApiResult.Failure.ApiFailure
import com.slack.eithernet.ApiResult.Failure.HttpFailure
import com.slack.eithernet.ApiResult.Failure.NetworkFailure
import com.slack.eithernet.ApiResult.Failure.UnknownFailure
import com.slack.eithernet.ApiResult.Success
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.launch
import javax.inject.Inject

data class ProductDetailScreenState(
    val loading: Boolean = false,
    val cartState: CartState = CartState(),
    val product: ProductFull? = null,
    val categories: List<Category> = listOf(),
    val variants: List<ProductVariantFull> = listOf(),
    val modifiers: List<ProductModifierFull> = listOf(),
    val selectedVariant: ProductVariantFull? = null,
) : ViewModelState

@HiltViewModel
class ProductDetailScreenViewModel @Inject constructor(
    private val managementApi: BigCommerceManagementApi,
    private val cartStore: CartStore,
    dispatcherProvider: DispatcherProvider,
) : ViewModelBase<ProductDetailScreenState, ProductDetailScreenActions, ProductDetailScreenEffects>(
    ProductDetailScreenState(),
    dispatcherProvider,
) {

    fun init(productId: Int) {
        load(productId)
    }

    private fun load(productId: Int) {
        viewModelScope.launch(dispatcherProvider.io()) {
            setState { copy(loading = true) }

            observeCartState()

            awaitAll(
                async { loadProduct(productId) },
                async { loadProductVariants(productId) },
                async { loadProductModifiers(productId) },
            )

            setState { copy(loading = false) }
        }
    }

    private suspend fun loadProductModifiers(productId: Int) {
        when (val response = managementApi.getProductModifiers(productId)) {
            is Success -> setState { copy(modifiers = response.value.data.orEmpty()) }
            is Failure -> when (response) {
                is NetworkFailure -> emitEffect(NetworkError)
                is UnknownFailure -> emitEffect(NetworkError)
                is HttpFailure -> emitEffect(NetworkError)
                is ApiFailure -> emitEffect(NetworkError)
            }
        }
    }

    private suspend fun loadProductVariants(productId: Int) {
        when (val response = managementApi.getProductVariants(productId)) {
            is Success -> setState { copy(variants = response.value.data.orEmpty()) }
            is Failure -> when (response) {
                is NetworkFailure -> emitEffect(NetworkError)
                is UnknownFailure -> emitEffect(NetworkError)
                is HttpFailure -> emitEffect(NetworkError)
                is ApiFailure -> emitEffect(NetworkError)
            }
        }
    }

    private suspend fun loadProduct(productId: Int) {
        when (val response = managementApi.getProduct(productId)) {
            is Success -> setState { copy(product = response.value.data) }
            is Failure -> when (response) {
                is NetworkFailure -> emitEffect(NetworkError)
                is UnknownFailure -> emitEffect(NetworkError)
                is HttpFailure -> emitEffect(NetworkError)
                is ApiFailure -> emitEffect(NetworkError)
            }
        }

        viewModelScope.launch(dispatcherProvider.io()) {
            when (val result = managementApi.listCategories()) {
                is Success -> setState { copy(categories = result.value.data) }
                is Failure -> when (result) {
                    is NetworkFailure -> emitEffect(NetworkError)
                    is UnknownFailure -> emitEffect(NetworkError)
                    is HttpFailure -> emitEffect(NetworkError)
                    is ApiFailure -> emitEffect(NetworkError)
                }
            }
        }
    }

    private fun observeCartState() {
        viewModelScope.launch(dispatcherProvider.io()) {
            cartStore.stateFlow.collect { cartState ->
                setState { copy(cartState = cartState) }
            }
        }
    }

    override fun onAction(action: ProductDetailScreenActions) {
        when (action) {
            AddToCartClicked -> handleAddToCartClicked()
            BackClicked -> handleBackClicked()
            CheckoutClicked -> handleCheckoutClicked()
            is ProductVariantSelected -> handleProductVariantSelected(action)
            ShoppingCartClicked -> handleShoppingCartClicked()
        }
    }

    private fun handleAddToCartClicked() {
        val product = stateFlow.value.product ?: return
        val selectedVariant = stateFlow.value.selectedVariant ?: return

        viewModelScope.launch(dispatcherProvider.io()) {
            cartStore.dispatch(AddLineItem(CartLineItem(1, product, selectedVariant)))
            emitEffect(NavigateToCart)
        }
    }

    private fun handleBackClicked() = emitEffect(NavigateBack)

    private fun handleCheckoutClicked() {
        val product = stateFlow.value.product ?: return
        val selectedVariant = stateFlow.value.selectedVariant ?: return

        viewModelScope.launch(dispatcherProvider.io()) {
            emitEffect(LaunchCheckoutEffect(product, selectedVariant))
        }
    }

    private fun handleProductVariantSelected(action: ProductVariantSelected) =
        setState { copy(selectedVariant = action.variant) }

    private fun handleShoppingCartClicked() = emitEffect(NavigateToCart)
}
