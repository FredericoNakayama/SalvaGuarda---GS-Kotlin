package com.example.salvaguarda_gs_kotlin.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavController

import com.example.salvaguarda_gs_kotlin.R
import com.example.salvaguarda_gs_kotlin.navigation.AppRoutes

@Composable
fun HomeScreen(navController: NavController) {

    Scaffold(
        containerColor = Color(0xFF0A192F)
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Image(
                        painter = painterResource(
                            id = R.drawable.salvaguardalogo
                        ),

                        contentDescription = "Logo SalvaGuarda",

                        modifier = Modifier.size(70.dp)
                    )

                    Spacer(
                        modifier = Modifier.width(12.dp)
                    )

                    Text(
                        text = "SalvaGuarda",

                        color = Color.White,

                        style =
                            MaterialTheme.typography.headlineMedium
                    )
                }

                Spacer(
                    modifier = Modifier.height(8.dp)
                )

                Text(
                    text =
                        "O SalvaGuarda transforma dados de satélites em alertas rápidos e acessíveis de desastres climáticos, oferecendo um chatbot de emergência offline para orientar a população e acelerar resgates.",

                    color = Color.White,

                    fontSize = 14.sp
                )
            }

            Spacer(
                modifier = Modifier.height(20.dp)
            )

            Card(
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier.padding(16.dp)
                ) {

                    Text(
                        text = "Monitoramento em Tempo Real",
                        fontSize = 20.sp
                    )

                    Spacer(
                        modifier = Modifier.height(8.dp)
                    )

                    Text(
                        text =
                            "Nenhum alerta crítico na sua região."
                    )

                    Spacer(
                        modifier = Modifier.height(8.dp)
                    )

                    Text(
                        text =
                            "Última atualização: 18:45"
                    )
                }
            }

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            Card(
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier.padding(16.dp)
                ) {

                    Text(
                        text = "Central de Monitoramento",
                        fontSize = 18.sp
                    )

                    Spacer(
                        modifier = Modifier.height(8.dp)
                    )

                    Text("🛰 Satélites ativos: 8")

                    Text("📍 Regiões monitoradas: 127")

                    Text("🌧 Alertas emitidos hoje: 12")

                    Text("🚨 Alertas críticos: 1")
                }
            }

            Spacer(
                modifier = Modifier.weight(1f)
            )

            Button(
                onClick = {
                    navController.navigate(
                        AppRoutes.ALERTS
                    )
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Alertas")
            }

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            Button(
                onClick = {
                    navController.navigate(
                        AppRoutes.CHATBOT
                    )
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("ChatBot")
            }

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            Button(
                onClick = {
                    navController.navigate(
                        AppRoutes.AUTHORITY
                    )
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Autoridades")
            }
        }
    }
}