package com.nok.mymovie

import android.app.Application
import com.nok.mymovie.injection.AppInjector
import com.nok.mymovie.injection.DaggerAppInjector
import com.nok.mymovie.injection.module.ApiModule

class App: Application() {

    private lateinit var appInjector: AppInjector

    override fun onCreate() {
        super.onCreate()
        appInjector = initDagger(this)
    }

    private fun initDagger(app: App): AppInjector =
        DaggerAppInjector.builder()
            .apiModule(ApiModule)
            .build()

    fun getInjector(): AppInjector {
        return appInjector
    }
}