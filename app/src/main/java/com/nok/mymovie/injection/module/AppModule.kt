package com.nok.mymovie.injection.module

import android.app.Application
import com.nok.mymovie.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
@Suppress("unused")
class AppModule(private var app: App) {

    @Provides
    @Singleton
    internal fun providesContext(): Application {
        return app
    }
}