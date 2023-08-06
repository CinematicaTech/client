package com.cinematica.foundation.mvi

import kotlinx.coroutines.flow.StateFlow

/**
 * An interface representing a state store.
 *
 * @param TState The type of the state.
 */
interface StateStore<TState> {
    /**
     * The state flow representing the current state.
     */
    val state: StateFlow<TState>
}
