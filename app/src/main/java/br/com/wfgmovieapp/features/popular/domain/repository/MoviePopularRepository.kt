package br.com.wfgmovieapp.features.popular.domain.repository

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.wfgmovieapp.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MoviePopularRepository {
    fun getPopularMovies(pagingConfig: PagingConfig): Flow<PagingData<Movie>>
}