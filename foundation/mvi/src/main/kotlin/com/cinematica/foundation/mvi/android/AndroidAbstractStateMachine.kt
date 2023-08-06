package com.cinematica.foundation.mvi.android

import com.cinematica.foundation.mvi.Middleware
import com.cinematica.foundation.mvi.Reducer
import com.cinematica.foundation.mvi.StateMachine
import com.cinematica.foundation.mvi.UiEffect
import com.cinematica.foundation.mvi.UiEvent
import com.cinematica.foundation.mvi.UiState
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.cinematica.foundation.viewmodel.android.ViewModel

/**
 * Abstract class that should be typically used for implementing [StateMachine].
 */
abstract class AndroidAbstractStateMachine<TState : UiState, TEvent : UiEvent, TEffect : UiEffect>(
    private val reducer: Reducer<TState, TEvent, TEffect>,
    private val middlewares: List<Middleware<TState, TEffect>> = emptyList(),
) : ViewModel(), StateMachine<TState, TEvent, TEffect> {

    protected abstract fun initDefaultState(): TState

    private val _state: MutableStateFlow<TState> by lazy { MutableStateFlow(initDefaultState()) }
    private val _effects: Channel<TEffect> = Channel(Channel.UNLIMITED)

    /**
     * Represents the current state of the UI.
     */
    final override val state: StateFlow<TState> by ::_state

    /**
     * Represents the channel for emitting UI effects.
     */
    final override val effects: ReceiveChannel<TEffect> by ::_effects

    /**
     * Processes an event from UI.
     *
     * @param event The event to be processed.
     */
    final override fun dispatchEvent(event: TEvent) {
        val sendEffect: (TEffect) -> Unit = { effect ->
            middlewares.forEach { middleware -> setState(middleware.onEffect(effect, this)) }
            _effects.trySend(effect)
        }

        setState(reducer.reduce(state.value, event, sendEffect))
    }

    private fun setState(state: TState) {
        _state.tryEmit(state)
    }
}
