package dev.petedoyle.snappy.ui.cart

import androidx.lifecycle.viewModelScope
import dev.petedoyle.common.coroutines.DispatcherProvider
import dev.petedoyle.common.mvi.ViewModelBase
import dev.petedoyle.common.mvi.ViewModelState
import dev.petedoyle.snappy.cart.CartState
import dev.petedoyle.snappy.cart.CartStore
import dev.petedoyle.snappy.cart.RemoveLineItem
import dev.petedoyle.snappy.cart.UpdateLineItemQuantity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

data class CartScreenState(
    val cartState: CartState = CartState(),
    val recalculatingCartTotals: Boolean = false,
) : ViewModelState

@HiltViewModel
class CartScreenViewModel @Inject constructor(
    private val cartStore: CartStore,
    dispatcherProvider: DispatcherProvider,
) : ViewModelBase<CartScreenState, CartScreenActions, CartScreenEffects>(
    CartScreenState(),
    dispatcherProvider,
) {

    init {
        load()
    }

    private fun load() {
        observeCartState()
    }

    private fun observeCartState() {
        viewModelScope.launch(dispatcherProvider.io()) {
            cartStore.stateFlow.collect { cartState ->
                setState { copy(cartState = cartState) }
            }
        }
    }

    override fun onAction(action: CartScreenActions) {
        when (action) {
            BackClicked -> emitEffect(NavigateBackEffect)
            QuickCheckoutClicked -> handleQuickCheckoutClicked()
            is RemoveCartLineItemClicked -> handleRemoveCartLineItemClicked(action)
            ShoppingCartClicked -> {
                // Do nothing- we're already on the cart screen
            }
            is UpdateLineItemQuantityClicked -> handleUpdateLineItemQuantity(action)
        }
    }

    private fun handleQuickCheckoutClicked() = emitEffect(LaunchCheckoutEffect(cartStore.stateFlow.value))

    private fun handleRemoveCartLineItemClicked(action: RemoveCartLineItemClicked) {
        viewModelScope.launch(dispatcherProvider.io()) {
            setState { copy(recalculatingCartTotals = true) }
            runCatching {
                cartStore.dispatch(RemoveLineItem(action.item))
            }.also {
                setState { copy(recalculatingCartTotals = false) }
            }
        }
    }

    private fun handleUpdateLineItemQuantity(action: UpdateLineItemQuantityClicked) {
        viewModelScope.launch(dispatcherProvider.io()) {
            setState { copy(recalculatingCartTotals = true) }
            runCatching {
                cartStore.dispatch(UpdateLineItemQuantity(action.item, action.newQuantity))
            }.also {
                setState { copy(recalculatingCartTotals = false) }
            }
        }
    }
}