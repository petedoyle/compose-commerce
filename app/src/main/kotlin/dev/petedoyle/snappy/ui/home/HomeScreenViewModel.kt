package dev.petedoyle.snappy.ui.home

import androidx.lifecycle.viewModelScope
import dev.petedoyle.snappy.common.api.bigcommerce.BigCommerceManagementApi
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.Category
import dev.petedoyle.snappy.common.api.bigcommerce.catalog.v3.model.ProductFull
import dev.petedoyle.snappy.common.coroutines.DispatcherProvider
import dev.petedoyle.snappy.common.mvi2.ViewModelBase
import dev.petedoyle.snappy.common.mvi2.ViewModelState
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

data class HomeScreenState(
    val cartState: CartState = CartState(),
    val products: List<ProductFull> = listOf(),
    val categories: List<Category> = listOf(),
    val error: String? = null,
) : ViewModelState

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val managementApi: BigCommerceManagementApi,
    private val cartStore: CartStore,
    dispatcherProvider: DispatcherProvider,
) : ViewModelBase<HomeScreenState, HomeScreenActions, HomeScreenEffects>(
    HomeScreenState(),
    dispatcherProvider,
) {

    init {
        load()
    }

    private fun load() {
        viewModelScope.launch(dispatcherProvider.io()) {
            awaitAll(
                async { loadFeaturedProducts() },
                async { loadCategories() }
            )
        }

        observeCartState()
    }

    private suspend fun loadFeaturedProducts() {
        when (val result = managementApi.listFeaturedProducts()) {
            is Success -> setState { copy(products = result.value.data.orEmpty()) }
            is Failure -> when (result) {
                is NetworkFailure -> emitEffect(NetworkError)
                is UnknownFailure -> emitEffect(NetworkError)
                is HttpFailure -> emitEffect(NetworkError)
                is ApiFailure -> emitEffect(NetworkError)
            }
        }
    }

    private suspend fun loadCategories() {
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

    private fun observeCartState() {
        viewModelScope.launch(dispatcherProvider.io()) {
            cartStore.stateFlow.collect { cartState ->
                setState { copy(cartState = cartState) }
            }
        }
    }

    override fun onAction(action: HomeScreenActions) {
        when (action) {
            is ProductClicked -> emitEffect(NavigateToProductDetail(action.productId))
            ShoppingCartClicked -> emitEffect(NavigateToCart)
        }
    }
}
