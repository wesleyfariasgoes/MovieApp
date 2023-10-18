package br.com.wfgmovieapp.features.popular.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.wfgmovieapp.core.domain.model.Movie
import br.com.wfgmovieapp.features.popular.domain.repository.MoviePopularRepository
import br.com.wfgmovieapp.features.popular.domain.source.MoviePopularRemoteDataSource
import kotlinx.coroutines.flow.Flow

class MoviePopularRepositoryImpl constructor(
    private val remoteDataSource: MoviePopularRemoteDataSource
): MoviePopularRepository {
    override fun getPopularMovies(pagingConfig: PagingConfig): Flow<PagingData<Movie>> {
        return Pager(
            config = pagingConfig,
            pagingSourceFactory = {
                remoteDataSource.getPopularMoviePagingSOurce()
            }
        ).flow
    }
}