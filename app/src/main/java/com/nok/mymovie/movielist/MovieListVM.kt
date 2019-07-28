package com.nok.mymovie.movielist

import com.nok.mymovie.App
import com.nok.mymovie.base.BaseVM

class MovieListVM(app: App) : BaseVM<MovieListAction>(app) {

    override val action: MovieListAction = MovieListAction()

}