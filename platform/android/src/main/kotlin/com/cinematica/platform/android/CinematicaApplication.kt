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
    }
}