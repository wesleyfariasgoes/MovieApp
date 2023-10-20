package br.com.wfgmovieapp.features.popular.di

import br.com.wfgmovieapp.core.data.remote.MovieService
import br.com.wfgmovieapp.features.popular.data.repository.MoviePopularRepositoryImpl
import br.com.wfgmovieapp.features.popular.data.source.MoviePopularRemoteDataSourceImpl
import br.com.wfgmovieapp.features.popular.domain.repository.MoviePopularRepository
import br.com.wfgmovieapp.features.popular.domain.source.MoviePopularRemoteDataSource
import br.com.wfgmovieapp.features.popular.domain.usecase.GetPopularMovieUseCase
import br.com.wfgmovieapp.features.popular.domain.usecase.GetPopularMovieUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MoviePopularFeatureModule {

    @Provides
    @Singleton
    fun provideMovieDataSource(service: MovieService) : MoviePopularRemoteDataSource {
        return MoviePopularRemoteDataSourceImpl(service = service)
    }

    @Provides
    @Singleton
    fun provideMoviePopularRepository(remoteDataSource: MoviePopularRemoteDataSource) : MoviePopularRepository {
        return MoviePopularRepositoryImpl(remoteDataSource = remoteDataSource)
    }

    @Provides
    @Singleton
    fun provideMoviePopularUseCase(moviePopularRepository: MoviePopularRepository) : GetPopularMovieUseCase {
        return GetPopularMovieUseCaseImpl(repository = moviePopularRepository)
    }
}