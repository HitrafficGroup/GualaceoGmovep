package com.example.gualaceotarifadorcompose

sealed class Navigation(
    val route: String
){
    object  ReporteManual: Navigation("reporte_manual")
    object  Reportes: Navigation("reportes")
    object  HomeView: Navigation("home")
}
