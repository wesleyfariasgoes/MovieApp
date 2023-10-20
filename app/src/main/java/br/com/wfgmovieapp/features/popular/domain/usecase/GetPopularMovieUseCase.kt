package br.com.wfgmovieapp.features.popular.domain.usecase

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.wfgmovieapp.core.domain.model.Movie
import br.com.wfgmovieapp.features.popular.domain.repository.MoviePopularRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface GetPopularMovieUseCase {
    operator fun invoke() : Flow<PagingData<Movie>>
}

class GetPopularMovieUseCaseImpl @Inject constructor(
    private val repository: MoviePopularRepository
) : GetPopularMovieUseCase {
    override fun invoke(): Flow<PagingData<Movie>> {
        return repository.getPopularMovies(
            pagingConfig = PagingConfig(
                pageSize = 20,
                initialLoadSize = 20
            )
        )
    }
}