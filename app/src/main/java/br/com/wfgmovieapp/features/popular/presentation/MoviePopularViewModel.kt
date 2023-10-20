package br.com.wfgmovieapp.features.popular.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import br.com.wfgmovieapp.features.popular.domain.usecase.GetPopularMovieUseCase
import br.com.wfgmovieapp.features.popular.presentation.state.MoviePopularState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MoviePopularViewModel @Inject constructor(
    getPopularMovieUseCase: GetPopularMovieUseCase
) : ViewModel() {
    var uiState by mutableStateOf(MoviePopularState())
        private set

    init {
        val movies = getPopularMovieUseCase.invoke()
            .cachedIn(viewModelScope)
        uiState = uiState.copy(movies = movies)
    }
}