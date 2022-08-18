package dev.petedoyle.common.flux

import androidx.annotation.VisibleForTesting
import kotlinx.coroutines.flow.StateFlow

interface StoreActions

interface Store<S, A : StoreActions> {
    val stateFlow: StateFlow<S>
    suspend fun dispatch(action: A)

    @VisibleForTesting(otherwise = VisibleForTesting.PROTECTED)
    fun setState(lambda: S.() -> S)
}
