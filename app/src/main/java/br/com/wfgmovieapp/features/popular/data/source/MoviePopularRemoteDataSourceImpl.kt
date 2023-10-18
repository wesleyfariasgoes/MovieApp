package br.com.wfgmovieapp.features.popular.data.source

import br.com.wfgmovieapp.features.popular.domain.source.MoviePopularRemoteDataSource
import br.com.wfgmovieapp.core.data.remote.MovieService
import br.com.wfgmovieapp.core.data.remote.response.MovieResponse
import br.com.wfgmovieapp.core.paging.MoviePagingSource

class MoviePopularRemoteDataSourceImpl constructor(
    private val service: MovieService
): MoviePopularRemoteDataSource {

    override fun getPopularMoviePagingSOurce(): MoviePagingSource {
        return MoviePagingSource(this)
    }

    override suspend fun getPopularMovies(page: Int): MovieResponse {
        return service.getPopularMovies(page = page)
    }
}