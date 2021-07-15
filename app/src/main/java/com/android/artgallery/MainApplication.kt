package com.android.artgallery

import dagger.hilt.android.HiltAndroidApp
import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

@HiltAndroidApp
class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this)
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}