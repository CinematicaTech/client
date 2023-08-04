package com.cinematica.foundation.mvi

/**
 * Middleware is an interface that represents a component in the Model-View-Intent (MVI) architecture
 * responsible for intercepting effects and performing side effects based on those effects.
 *
 * @param TState The type representing the UI state.
 * @param TEffect The type representing effects for the UI.
 */
public interface Middleware<TState : UiState, TEffect : UiEffect> {
    /**
     * Handles the given effect and performs any necessary side effects.
     *
     * @param effect The effect to handle.
     * @param store The state store containing the current state.
     */
    public fun onEffect(effect: TEffect, store: StateStore<TState>): TState
}
