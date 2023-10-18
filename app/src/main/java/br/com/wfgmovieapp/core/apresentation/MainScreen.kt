package br.com.wfgmovieapp.core.apresentation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import br.com.wfgmovieapp.core.apresentation.navigation.BottomNavigationBar
import br.com.wfgmovieapp.core.apresentation.navigation.NavigationGraph

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        },
        content =  {
            NavigationGraph(navController = navController)
        }
    )
}