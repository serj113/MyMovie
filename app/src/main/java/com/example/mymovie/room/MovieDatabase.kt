package com.nok.setia.contacts.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nok.mymovie.model.Movie
import com.nok.mymovie.room.MovieDao

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class MovieDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
}