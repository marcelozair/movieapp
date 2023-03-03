package com.example.movieapp.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieapp.data.MovieRepository
import com.example.movieapp.data.model.Movie
import com.example.movieapp.data.model.PopularMoviesResponse
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {

    private val movieRepository = MovieRepository();

    private val _movieList: MutableLiveData<PopularMoviesResponse> = MutableLiveData()
    val movieList: LiveData<PopularMoviesResponse> = _movieList;

    private val _loading: MutableLiveData<Boolean> = MutableLiveData()
    val loading: LiveData<Boolean> = _loading;

    fun onCreate() {
        viewModelScope.launch {
            _loading.postValue(true);
            val popularMoviesResponse = movieRepository.getPopularMovies();
            _movieList.postValue(popularMoviesResponse);
            _loading.postValue(false);
        }
    }
}