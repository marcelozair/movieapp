package com.example.movieapp.data.network

import com.example.movieapp.core.RetrofitHelper
import com.example.movieapp.data.model.PopularMoviesResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MoviesService {

    private val retrofit = RetrofitHelper.getRetrofit();

    suspend fun getPopularMoviesService(): PopularMoviesResponse? {
        return withContext(Dispatchers.IO) {
            val response =
                retrofit.create(MoviesApi::class.java).getPopularMovies(RetrofitHelper.API_KEY);
            response.body() ?: null;
        }
    }

}