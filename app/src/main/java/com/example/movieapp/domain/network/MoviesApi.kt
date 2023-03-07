package com.example.movieapp.domain.network

import com.example.movieapp.domain.model.response.PopularMoviesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApi {
    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String): Response<PopularMoviesResponse>;
}