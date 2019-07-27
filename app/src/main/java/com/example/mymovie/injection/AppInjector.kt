package com.nok.mymovie.injection

import com.nok.mymovie.injection.module.ApiModule
import com.nok.mymovie.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(ApiModule::class), (AppModule::class)])
interface AppInjector {

    @Component.Builder
    interface Builder {

        fun appModule(appModule: AppModule): Builder

        fun apiModule(apiModule: ApiModule): Builder

        fun build(): AppInjector
    }
}