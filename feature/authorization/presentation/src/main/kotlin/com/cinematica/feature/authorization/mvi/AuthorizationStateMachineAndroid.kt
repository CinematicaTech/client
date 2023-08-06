package com.cinematica.feature.authorization.presentation.mvi

import androidx.compose.runtime.Immutable
import com.cinematica.foundation.mvi.android.AndroidAbstractStateMachine
import com.cinematica.foundation.mvi.UiEffect
import com.cinematica.foundation.mvi.UiEvent
import com.cinematica.foundation.mvi.UiState
import com.cinematica.feature.authorization.presentation.mvi.AuthorizationStateMachineAndroid.State
import com.cinematica.feature.authorization.presentation.mvi.AuthorizationStateMachineAndroid.Event
import com.cinematica.feature.authorization.presentation.mvi.AuthorizationStateMachineAndroid.Effect

class AuthorizationStateMachineAndroid(
    reducer: AuthorizationReducer,
    middleware: AuthorizationMiddleware
): AndroidAbstractStateMachine<State, Event, Effect>(reducer, middlewares = listOf(middleware)) {

    override fun initDefaultState(): State = State()

    @Immutable
    data class State(
        val isLoading: Boolean = false,
    ) : UiState

    sealed class Event : UiEvent {
        data class EmailChange(val email: String) : Event()

        data object OnStartClick : Event()
    }

    sealed class Effect : UiEffect {
        data class Failure(val throwable: Throwable) : Effect()

        data object NavigateToWatching : Effect()
    }
}