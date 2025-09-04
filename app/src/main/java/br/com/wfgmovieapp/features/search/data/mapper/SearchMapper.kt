package br.com.wfgmovieapp.features.search.data.mapper

import br.com.wfgmovieapp.core.data.remote.model.SearchResult
import br.com.wfgmovieapp.core.domain.model.MovieSearch
import br.com.wfgmovieapp.core.util.toPosUrl

fun List<SearchResult>.toMovieSearch() = map { searchResult ->
    MovieSearch(
        id = searchResult.id,
        imageUrl = searchResult.posterPath.toPosUrl(),
        voteAverange = searchResult.voteAverage
    )
}