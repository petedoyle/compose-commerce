package dev.petedoyle.common.mvi.test

import dev.petedoyle.common.mvi.ViewModelState
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.drop

/**
 * Drops the first emission from a `StateFlow<ViewModelState>`,
 * which is the initial / default state from [ViewModelBase].
 *
 * Useful for tests that need to verify ViewModelState after
 * taking an action.
 */
inline fun <reified S : ViewModelState> StateFlow<S>.dropInitialState(count: Int = 1) = drop(count)