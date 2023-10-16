package br.com.wfgmovieapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import br.com.movieapp.BuildConfig
import br.com.wfgmovieapp.framework.apresentation.MainScreen
import br.com.wfgmovieapp.ui.theme.MovieAppTheme

class MainActivity : ComponentActivity() {

    val apiKey = BuildConfig.API_KEY
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieAppTheme {
                MainScreen(navController = rememberNavController())
            }
        }
    }
}
