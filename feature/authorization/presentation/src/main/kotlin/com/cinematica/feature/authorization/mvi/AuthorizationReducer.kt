package com.cinematica.feature.authorization.presentation.mvi

import com.cinematica.foundation.mvi.Reducer
import com.cinematica.feature.authorization.presentation.mvi.AuthorizationStateMachineAndroid.State
import com.cinematica.feature.authorization.presentation.mvi.AuthorizationStateMachineAndroid.Event
import com.cinematica.feature.authorization.presentation.mvi.AuthorizationStateMachineAndroid.Effect
import kotlinx.coroutines.CoroutineScope

class AuthorizationReducer(
    private val coroutineScope: CoroutineScope,
): Reducer<State, Event, Effect> {
    override fun reduce(state: State, event: Event, sendEffect: (Effect) -> Unit): State {
        TODO("Not yet implemented")
    }
}