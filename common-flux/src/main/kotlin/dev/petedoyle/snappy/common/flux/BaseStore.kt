package dev.petedoyle.snappy.common.flux

import androidx.annotation.VisibleForTesting
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

abstract class BaseStore<S, A : StoreActions>(initialState: S) : Store<S, A> {
    private val _stateFlow = MutableStateFlow(initialState)
    override val stateFlow: StateFlow<S>
        get() = _stateFlow

    private val dispatchMutex = Mutex()

    override suspend fun dispatch(action: A) {
        dispatchMutex.withLock {
            val newState = reduce(_stateFlow.value, action)
            setState { newState }
        }
    }

    abstract suspend fun reduce(state: S, action: A): S

    @VisibleForTesting(otherwise = VisibleForTesting.PROTECTED)
    override fun setState(lambda: S.() -> S) {
        _stateFlow.value = lambda(_stateFlow.value)
    }
}