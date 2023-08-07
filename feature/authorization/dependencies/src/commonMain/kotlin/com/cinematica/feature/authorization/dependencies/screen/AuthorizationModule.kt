package com.cinematica.feature.authorization.dependencies.screen

import com.cinematica.feature.authorization.mvi.AuthorizationMiddleware
import com.cinematica.feature.authorization.mvi.AuthorizationStateMachine
import com.cinematica.feature.authorization.presentation.mvi.AuthorizationReducer
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.core.annotation.Factory
import org.koin.core.annotation.Module
import org.koin.core.annotation.Singleton

@Module(includes = [AuthorizationModule::class])
class AuthorizationModule {

    @Singleton
    fun middleware(): AuthorizationMiddleware = AuthorizationMiddleware()

    @Factory
    fun reducer(): AuthorizationReducer {
        return AuthorizationReducer(
            coroutineScope = CoroutineScope(Dispatchers.Default)
        )
    }

    @Factory
    fun stateMachine(
        reducer: AuthorizationReducer,
        middleware: AuthorizationMiddleware,
    ): AuthorizationStateMachine {
        return AuthorizationStateMachine(
            reducer = reducer,
            middleware = middleware,
        )
    }
}