package com.nok.mymovie.api

import com.nok.mymovie.model.Response
import com.nok.mymovie.util.API_KEY
import io.reactivex.Observable
import retrofit2.http.GET

interface MoviesApi {
    /**
     * Get the list of the contacts from the API
     */
    @GET("trending/movie/week?api_key=$API_KEY")
    fun getTrendingMovies(): Observable<Response>
}