package com.nok.mymovie.movielist

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.nok.mymovie.base.BaseVM
import com.nok.mymovie.model.Movie

class MovieListVM(app: Application) : BaseVM<MovieListAction>(app) {

    private val movieList: MutableLiveData<List<Movie>> = MutableLiveData()

    override val action: MovieListAction = MovieListAction()

    fun getMovieList(): LiveData<List<Movie>> = movieList

    fun loadData() {
        action.getTrendingMovies(
            {
                movieList.value = it.results
            },
            {
                movieList.value = listOf()
                Log.d("MyMovie", it.localizedMessage)
            }
        )
    }

}