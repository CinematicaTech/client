package com.cinematica.foundation.time

import kotlinx.datetime.Instant

class SystemUTCTimeProvider : TimeProvider {
    override fun provide(): Instant {
        return Instant.fromEpochMilliseconds(System.currentTimeMillis())
    }
}