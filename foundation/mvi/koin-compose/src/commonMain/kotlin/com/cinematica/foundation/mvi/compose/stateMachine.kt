package com.cinematica.foundation.mvi.compose

import androidx.compose.runtime.Composable
import com.cinematica.foundation.mvi.StateMachine
import com.cinematica.foundation.mvi.UiEffect
import com.cinematica.foundation.mvi.UiEvent
import com.cinematica.foundation.mvi.UiState
import org.koin.core.parameter.ParametersDefinition


/**
 * Creates and returns an instance of the specified state machine using the provided factory.
 *
 * @param TSM The reified type of the state machine.
 * @param TState The type of the state in the state machine.
 * @param TEvent The type of the events in the state machine.
 * @param TEffect The type of the effects in the state machine.
 * @return The created instance of the state machine.
 */
@Composable
expect inline fun <TState : UiState, TEvent : UiEvent, TEffect : UiEffect, reified TSM : StateMachine<TState, TEvent, TEffect>> stateMachine(
    noinline parameters: ParametersDefinition? = null,
): TSM