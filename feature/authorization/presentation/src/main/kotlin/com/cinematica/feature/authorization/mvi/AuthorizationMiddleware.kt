package com.cinematica.feature.authorization.presentation.mvi

import com.cinematica.foundation.mvi.Middleware
import com.cinematica.feature.authorization.presentation.mvi.AuthorizationStateMachineAndroid.State
import com.cinematica.feature.authorization.presentation.mvi.AuthorizationStateMachineAndroid.Effect
import com.cinematica.foundation.mvi.StateStore

class AuthorizationMiddleware : Middleware<State, Effect> {

    /**
     * Handles the specified effect and updates the state if necessary.
     *
     * This function is called when an effect is dispatched within the Start Authorization feature.
     * It receives the effect, the current state store, and a function to update the state.
     * The purpose of this function is to react to specific effects and modify the state accordingly.
     * In this case, when an [Effect.Failure] or [Effect.TooManyAttempts] is received,
     * it sets the loading state in the UI to false by updating the state.
     *
     * @param effect The effect to be handled.
     * @param store The state store containing the current state.
     */
    override fun onEffect(effect: Effect, store: StateStore<State>): State {
        return when (effect) {
            else -> store.state.value
        }
    }
}