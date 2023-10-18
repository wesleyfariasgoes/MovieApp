package br.com.wfgmovieapp.features.popular.data.mapper

import br.com.wfgmovieapp.core.data.remote.model.MovieResult
import br.com.wfgmovieapp.core.domain.model.Movie
import br.com.wfgmovieapp.core.util.toPosUrl

fun List<MovieResult>.toMovie() = map {movieResult ->
    Movie(
        id = movieResult.id,
        title = movieResult.title,
        voteAverage = movieResult.voteAverage,
        imageUrl = movieResult.posterPath?.toPosUrl() ?:""
    )
}