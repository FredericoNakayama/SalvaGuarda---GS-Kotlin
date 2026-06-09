package com.example.salvaguarda_gs_kotlin.screens

import androidx.compose.foundation.layout.*

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack

import androidx.compose.material3.*

import androidx.compose.runtime.*

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthorityDashboardScreen(
    navController: NavController
) {

    var alertSent by remember {
        mutableStateOf(false)
    }

    Scaffold(
        containerColor = Color(0xFF0A192F),
        topBar = {

            TopAppBar(

                title = {
                    Text(
                        "Painel da Autoridade",
                        color = Color.White
                    )
                },

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF0A192F)
                ),

                navigationIcon = {

                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }
                    ) {

                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Voltar",
                            tint = Color.White
                        )
                    }
                }
            )
        }

    ) { padding ->

        Column(

            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp)

        ) {

            Card(
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier.padding(16.dp)
                ) {

                    Text("🛰 Satélites ativos: 8")

                    Spacer(
                        modifier = Modifier.height(8.dp)
                    )

                    Text("🌧 Alertas emitidos hoje: 12")

                    Spacer(
                        modifier = Modifier.height(8.dp)
                    )

                    Text("📍 Regiões monitoradas: 127")
                }
            }

            Spacer(
                modifier = Modifier.height(24.dp)
            )

            Button(

                onClick = {
                    alertSent = true
                },

                modifier = Modifier.fillMaxWidth()

            ) {

                Text("Emitir Alerta")
            }

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            if (alertSent) {

                Text(
                    "Novo alerta enviado com sucesso."
                )
            }
        }
    }
}

