package com.cinematica.preview.feature.statemachine

import com.cinematica.foundation.mvi.Reducer
import com.cinematica.foundation.mvi.StateMachine
import com.cinematica.foundation.mvi.UiEffect
import com.cinematica.foundation.mvi.UiEvent
import com.cinematica.foundation.mvi.UiState

internal fun <TState : UiState, TEvent : UiEvent, TEffect : UiEffect> fakeStateMachine(
    state: TState,
): StateMachine<TState, TEvent, TEffect> {
    val reducer = object : Reducer<TState, TEvent, TEffect> {
        override fun reduce(state: TState, event: TEvent, sendEffect: (TEffect) -> Unit): TState {
            return state
        }
    }

    return object : StateMachine<TState, TEvent, TEffect>(reducer, listOf()) {
        override fun initDefaultState(): TState {
            return state
        }
    }
}