package com.example.movieapp.domain.repositories

import com.example.movieapp.domain.model.response.PopularMoviesResponse
import com.example.movieapp.domain.network.MoviesService

class MovieRepository {

    private val moviesService = MoviesService();

    suspend fun getPopularMovies() : PopularMoviesResponse? {
        val response = moviesService.getPopularMoviesService();
        return response
    }
}