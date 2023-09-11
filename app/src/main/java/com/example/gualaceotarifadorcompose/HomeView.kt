package com.example.gualaceotarifadorcompose

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button

import androidx.compose.material3.Scaffold

import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gualaceotarifadorcompose.ui.theme.GualaceoTarifadorComposeTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(
    toRegistroManual:()-> Unit,
    toReportes:()->Unit
){
    Scaffold(
        content = { Content(RegistroManual={toRegistroManual()},Reportes={toReportes()}) }
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Toolbar(){
    TopAppBar(title = { Text(text = "Menu Principal")} ,Modifier.background(colorResource(id = R.color.purple_200))
    )
}

@Composable
fun Content(
    RegistroManual:()-> Unit,
    Reportes:()->Unit){
    LazyColumn (modifier = Modifier
        .fillMaxSize()
        .background(Color.White)

    ){
        item {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "logo Gualaceo",
                modifier= Modifier
                    .fillMaxSize()
                    .height(290.dp)
            )
            Box(modifier = Modifier.height(30.dp))
            Row(horizontalArrangement = Arrangement.Center,modifier = Modifier.fillMaxSize()) {
                Button(onClick = {}, modifier = Modifier.focusable(false)) {
                    Text("Registro Automatico")
                }
            }
            Row(horizontalArrangement = Arrangement.Center,modifier = Modifier.fillMaxSize()) {
                Button(onClick = {RegistroManual() }) {
                    Text("Registro Manual")

                }
            }
            Row(horizontalArrangement = Arrangement.Center,modifier = Modifier.fillMaxSize()) {
                Button(onClick = { Reportes()}) {
                    Text("Reportes Creados")
                }
            }
            Box(modifier = Modifier.height(50.dp))
            Row(horizontalArrangement = Arrangement.Center,modifier = Modifier.fillMaxSize()) {
                Text(text = "V1.0")
            }
        }
    }
}