package com.nok.mymovie.base

import com.nok.mymovie.api.MoviesApi
import javax.inject.Inject

abstract class BaseAction {

    @Inject
    lateinit var api: MoviesApi

}