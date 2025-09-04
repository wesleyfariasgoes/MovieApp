package br.com.wfgmovieapp.features.search.domain.source

import br.com.wfgmovieapp.core.data.remote.response.SearchResponse
import br.com.wfgmovieapp.core.paging.MovieSearchPagingSource

interface MovieSearchRemoteDataSource {
    fun getSearchMoviePagingSource(query: String) : MovieSearchPagingSource
    suspend fun getSearchMovies(page: Int, query: String) : SearchResponse
}