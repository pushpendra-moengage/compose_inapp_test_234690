package com.al.play.composesdk

import android.app.Application
import com.moengage.core.DataCenter
import com.moengage.core.LogLevel
import com.moengage.core.MoEngage
import com.moengage.core.config.LogConfig
import com.moengage.core.config.NotificationConfig

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        val moEngage = MoEngage.Builder(this, "8SIW681S80Z08KSHQFSTIZ8T", DataCenter.DATA_CENTER_1)
            .configureNotificationMetaData(NotificationConfig(R.mipmap.ic_launcher, R.mipmap.ic_launcher))
            .configureLogs(LogConfig(LogLevel.VERBOSE, true))
            .build()//replace X with your data center number
        MoEngage.initialiseDefaultInstance(moEngage)

    }
}