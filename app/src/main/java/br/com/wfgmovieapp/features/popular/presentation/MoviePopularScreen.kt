package br.com.wfgmovieapp.features.popular.presentation

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.paging.compose.collectAsLazyPagingItems
import br.com.wfgmovieapp.R
import br.com.wfgmovieapp.core.util.UtilFunctions
import br.com.wfgmovieapp.features.popular.presentation.components.MovieContent
import br.com.wfgmovieapp.features.popular.presentation.state.MoviePopularState
import br.com.wfgmovieapp.ui.theme.black
import br.com.wfgmovieapp.ui.theme.white

@Composable
fun MoviePopularScreen(
    uiState: MoviePopularState,
    navigateToDetailMovie: (Int) -> Unit
) {
    val movies = uiState.movies.collectAsLazyPagingItems()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.popular_movies),
                        color = white
                    )
                },
                backgroundColor = black
            )
        },
        content = { paddingVelues ->
            MovieContent(
                pagingMovies = movies,
                paddingValue = paddingVelues,
                onClick = { movieId ->
                    UtilFunctions.logInfo("MOVIE_ID", movieId.toString())
                    navigateToDetailMovie(movieId)
                }
            )
        }
    )
}