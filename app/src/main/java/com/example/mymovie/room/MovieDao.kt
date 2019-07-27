package com.nok.mymovie.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.nok.mymovie.model.Movie
import io.reactivex.Single

@Dao
interface MovieDao {

    @Query("SELECT * FROM contact")
    fun getMovies(): Single<List<Movie>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(movie: Movie)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(users: List<Movie>)
}