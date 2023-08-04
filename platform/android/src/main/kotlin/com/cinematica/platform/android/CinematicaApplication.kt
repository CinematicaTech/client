package com.cinematica.platform.android

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import kotlinx.coroutines.channels.Channel

class CinematicaApplication : Application() {

    companion object {
        internal val AUTH_FAILED_CHANNEL: Channel<Unit> = Channel()
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)

//        startKoin {
//            val platformModule = module {
//                single<TimeMatesRequestsEngine> {
//                    GrpcTimeMatesRequestsEngine(
//                        grpcEngineBuilder = AndroidGrpcEngineBuilder(applicationContext)
//                    )
//                }
//
//                single<OnAuthorizationFailedHandler> {
//                    OnAuthorizationFailedHandler { exception ->
//                        exception.printStackTrace()
//                        AUTH_FAILED_CHANNEL.trySend(Unit)
//                    }
//                }
//
//                single<SqlDriver>(qualifier = qualifier("authorization")) {
//                    AndroidSqliteDriver(TimeMatesAuthorizations.Schema, applicationContext)
//                }
//            }
//
//            modules(
//                platformModule,
//                AuthorizationDataModule().module,
//                ConfirmAuthorizationModule().module,
//                StartAuthorizationModule().module,
//                AfterStartModule().module,
//                NewAccountInfoModule().module,
//                ConfigureAccountModule().module,
//            )
        }
}