package br.com.wfgmovieapp.features.popular.domain.source

import br.com.wfgmovieapp.core.data.remote.response.MovieResponse
import br.com.wfgmovieapp.core.paging.MoviePagingSource

interface MoviePopularRemoteDataSource {
    fun getPopularMoviePagingSOurce(): MoviePagingSource
    suspend fun getPopularMovies(page: Int): MovieResponse
}