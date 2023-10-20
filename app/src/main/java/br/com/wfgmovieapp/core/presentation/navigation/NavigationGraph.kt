package br.com.wfgmovieapp.core.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.wfgmovieapp.features.popular.presentation.MoviePopularScreen
import br.com.wfgmovieapp.features.popular.presentation.MoviePopularViewModel
import br.com.wfgmovieapp.features.popular.presentation.MovieSearchScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.MoviePopular.route
    ) {
        composable(BottomNavItem.MoviePopular.route){
            val viewModel: MoviePopularViewModel = hiltViewModel()
            val uiState = viewModel.uiState

            MoviePopularScreen(
                uiState = uiState,
                navigateToDetailMovie = {
                }
            )
        }
        composable(BottomNavItem.MovieSearch.route){
            MovieSearchScreen(
                navigateToDetailMovie = {
                }
            )
        }
        composable(BottomNavItem.MovieFavorite.route){}
    }
}