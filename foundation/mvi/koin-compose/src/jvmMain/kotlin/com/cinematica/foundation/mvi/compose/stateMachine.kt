package com.cinematica.foundation.mvi.compose

import androidx.compose.runtime.Composable
import com.cinematica.foundation.mvi.StateMachine
import com.cinematica.foundation.mvi.UiEffect
import com.cinematica.foundation.mvi.UiEvent
import com.cinematica.foundation.mvi.UiState
import org.koin.compose.koinInject
import org.koin.core.parameter.ParametersDefinition

@Composable
actual inline fun <TState : UiState, TEvent : UiEvent, TEffect : UiEffect, reified TSM : StateMachine<TState, TEvent, TEffect>> stateMachine(
    noinline parameters: ParametersDefinition?
): TSM = koinInject<TSM>(
    parameters = parameters,
)