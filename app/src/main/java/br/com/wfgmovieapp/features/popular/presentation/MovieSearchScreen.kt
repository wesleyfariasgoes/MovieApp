package br.com.wfgmovieapp.features.popular.presentation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.paging.compose.collectAsLazyPagingItems
import br.com.wfgmovieapp.R
import br.com.wfgmovieapp.features.popular.presentation.state.MoviePopularState
import br.com.wfgmovieapp.ui.theme.black
import br.com.wfgmovieapp.ui.theme.yellow

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MovieSearchScreen(
    navigateToDetailMovie: (Int) -> Unit
) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.search_movies),
                        color = black
                    )
                },
                backgroundColor = yellow
            )
        },
        content = {paddingValues ->

        }
    )
}