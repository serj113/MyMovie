package com.example.mymovie.api

import com.example.mymovie.model.Response
import io.reactivex.Observable
import retrofit2.http.GET

interface MoviesApi {
    /**
     * Get the list of the contacts from the API
     */
    @GET("contacts")
    fun getPosts(): Observable<Response>
}