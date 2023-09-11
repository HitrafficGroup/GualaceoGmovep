package com.example.gualaceotarifadorcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationHost(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Navigation.HomeView.route ){
        composable(Navigation.HomeView.route){
            HomeView(
                toRegistroManual = {
                    navController.navigate(Navigation.ReporteManual.route)
                },
                toReportes = {
                    navController.navigate(Navigation.Reportes.route)
                }
            )
        }
        composable(Navigation.Reportes.route){
            Reportes()
        }
        composable(Navigation.ReporteManual.route){
            ReporteManual()
        }
    }

}