package com.nok.mymovie.injection.module

import com.nok.mymovie.api.MoviesApi
import com.nok.mymovie.util.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.Reusable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@Suppress("unused")
object ApiModule {
    /**
     * Provides the Contacts service implementation.
     * @param retrofit the Retrofit object used to instantiate the service
     * @return the Contacts service implementation.
     */
    @Provides
    @Reusable
    @JvmStatic
    internal fun provideContactsApi(retrofit: Retrofit): MoviesApi {
        return retrofit.create(MoviesApi::class.java)
    }

    /**
     * Provides the Retrofit object.
     * @return the Retrofit object
     */
    @Provides
    @Reusable
    @JvmStatic
    internal fun provideRetrofitInterface(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .build()
    }
}