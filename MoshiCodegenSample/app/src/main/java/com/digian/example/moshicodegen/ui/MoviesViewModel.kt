package com.digian.example.moshicodegen.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.digian.example.moshicodegen.data.PopularMoviesRepository
import com.digian.example.moshicodegen.data.PopularMoviesRepositoryImpl
import androidx.lifecycle.LiveData
import com.digian.example.moshicodegen.data.Movie


/**
 * Created by Alex Forrester on 23/04/2019.
 *
 * Simple ViewModel with no custom Dependency Injection
 */
open class MoviesViewModel(application: Application) : AndroidViewModel(application) {

    private val popularMoviesRepository: PopularMoviesRepository = getRepository()

    fun getMovies() : LiveData<List<Movie>> {
        return popularMoviesRepository.getMovies()
    }

    internal open fun getRepository() : PopularMoviesRepository {
        return PopularMoviesRepositoryImpl(getApplication())
    }
}