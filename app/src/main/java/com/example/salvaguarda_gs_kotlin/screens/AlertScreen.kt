package com.example.salvaguarda_gs_kotlin.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.salvaguarda_gs_kotlin.data.mockAlerts
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.TopAppBarDefaults


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlertsScreen(navController: NavController) {

    var searchText by remember {
        mutableStateOf("")
    }

    val filteredAlerts =
        mockAlerts.filter {

            it.title.contains(
                searchText,
                ignoreCase = true
            )
        }

    Scaffold(

        containerColor = Color(0xFF0A192F),

        topBar = {

            TopAppBar(

                title = {
                    Text(
                        "Alertas",
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

            OutlinedTextField(

                value = searchText,

                onValueChange = {
                    searchText = it
                },

                label = {
                    Text("Pesquisar alerta")
                },

                modifier = Modifier.fillMaxWidth()
            )

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            LazyColumn {

                items(filteredAlerts) { alert ->

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 12.dp)
                    ) {

                        Column(
                            modifier =
                                Modifier.padding(16.dp)
                        ) {

                            Text(
                                text = alert.title,
                                style =
                                    MaterialTheme.typography.titleMedium
                            )

                            Text(
                                text =
                                    "Local: ${alert.location}"
                            )

                            Text(
                                text =
                                    "Risco: ${alert.risk}"
                            )
                        }
                    }
                }
            }
        }
    }
}
