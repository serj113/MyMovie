package com.example.mymovie.base

import com.example.mymovie.api.MoviesApi
import javax.inject.Inject

abstract class BaseAction {

    @Inject
    lateinit var API: MoviesApi

}