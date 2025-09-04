package br.com.wfgmovieapp.features.search.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.wfgmovieapp.core.domain.model.MovieSearch
import br.com.wfgmovieapp.features.search.domain.repository.MovieSearchRepository
import br.com.wfgmovieapp.features.search.domain.source.MovieSearchRemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MovieSearchRepositoryImpl @Inject constructor(
    private val remoteDataSource: MovieSearchRemoteDataSource
): MovieSearchRepository {
    override fun getSearchMovies(
        query: String,
        pagingConfig: PagingConfig
    ): Flow<PagingData<MovieSearch>> {
        return Pager(
            config = pagingConfig,
            pagingSourceFactory = {remoteDataSource.getSearchMoviePagingSource(query = query)}
        ).flow
    }
}