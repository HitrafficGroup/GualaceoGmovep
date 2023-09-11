package com.example.gualaceotarifadorcompose

import androidx.compose.material3.ExperimentalMaterial3Api
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gualaceotarifadorcompose.ui.theme.GualaceoTarifadorComposeTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ReporteManual(){

    LazyColumn (modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(10.dp),
    ){
        item {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "logo Gualaceo",
                modifier= Modifier
                    .fillMaxSize()
                    .height(290.dp)
            )
            Box(modifier = Modifier.height(30.dp))
            Row(horizontalArrangement = Arrangement.Center,modifier = Modifier.fillMaxSize()) {
                Button(onClick = { }) {
                    Text("Registro Automatico")

                }
            }
            Row(horizontalArrangement = Arrangement.Center,modifier = Modifier.fillMaxSize()) {
                Button(onClick = { }) {
                    Text("Registro Manual")

                }
            }
            Row(horizontalArrangement = Arrangement.Center,modifier = Modifier.fillMaxSize()) {
                Button(onClick = { }) {
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

