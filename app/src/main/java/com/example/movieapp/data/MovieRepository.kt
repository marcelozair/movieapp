package com.example.movieapp.data

import com.example.movieapp.data.model.PopularMoviesResponse
import com.example.movieapp.data.network.MoviesService

class MovieRepository {

    private val moviesService = MoviesService();

    suspend fun getPopularMovies() : PopularMoviesResponse? {
        val response = moviesService.getPopularMoviesService();
        return response
    }
}