package br.com.wfgmovieapp.features.popular.presentation.state

import androidx.paging.PagingData
import br.com.wfgmovieapp.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

data class MoviePopularState(
    val movies: Flow<PagingData<Movie>> = emptyFlow()
)