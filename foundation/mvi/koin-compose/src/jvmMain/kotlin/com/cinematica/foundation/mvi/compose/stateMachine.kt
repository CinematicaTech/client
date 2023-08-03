package com.cinematica.foundation.mvi.compose

import androidx.compose.runtime.Composable
import com.cinematica.foundation.mvi.AbstractStateMachine
import com.cinematica.foundation.mvi.UiEffect
import com.cinematica.foundation.mvi.UiEvent
import com.cinematica.foundation.mvi.UiState
import org.koin.compose.koinInject
import org.koin.core.parameter.ParametersDefinition

@Composable
actual inline fun <
    reified TSM : AbstractStateMachine<TState, TEvent, TEffect>,
    TState : UiState,
    TEvent : UiEvent,
    TEffect : UiEffect,
    > stateMachine(noinline parameters: ParametersDefinition?) = koinInject<TSM>(
    parameters = parameters,
)