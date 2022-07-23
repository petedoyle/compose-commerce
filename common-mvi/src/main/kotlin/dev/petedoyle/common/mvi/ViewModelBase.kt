package dev.petedoyle.common.mvi

import androidx.annotation.VisibleForTesting
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.petedoyle.snappy.common.coroutines.DispatcherProvider
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 * Base view model that implements unidirectional data flow via MVI. External interaction comes in
 * from the view layer by sending [ViewAction]s to [onAction], and new state is emitted (as
 * appropriate for the case) via [stateFlow]. One-shot events can be sent to the UI layer by
 * subscribing to [effectFlow] and emitting a [ViewModelEffect] using [emitEffect].
 */
abstract class ViewModelBase<S : ViewModelState, A : ViewAction, E : ViewModelEffect>(
    initialState: S,
    protected val dispatcherProvider: DispatcherProvider,
) : ViewModel() {
    private val _stateFlow = MutableStateFlow(initialState)
    private val _effectFlow = MutableSharedFlow<E>()

    val stateFlow: StateFlow<S> = _stateFlow
    val effectFlow: Flow<E> = _effectFlow

    @VisibleForTesting(otherwise = VisibleForTesting.PROTECTED)
    fun setState(lambda: S.() -> S) {
        _stateFlow.value = lambda(_stateFlow.value)
    }

    abstract fun onAction(action: A): Unit

    fun emitEffect(effect: E) {
        viewModelScope.launch(dispatcherProvider.main()) {
            _effectFlow.emit(effect)
        }
    }
}

/**
 * Marker interface for actions sent (typically from the UI) to a [ViewModelBase].
 */
interface ViewAction

/**
 * Marker interface for effects emitted by the ViewModel.
 */
interface ViewModelEffect

/**
 * Marker interface for [ViewModelBase] state.
 */
interface ViewModelState
