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

import com.example.salvaguarda_gs_kotlin.navigation.AppRoutes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthorityScreen(
    navController: NavController
) {

    var username by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var errorMessage by remember {
        mutableStateOf("")
    }

    Scaffold(
        containerColor = Color(0xFF0A192F),
        topBar = {

            TopAppBar(

                title = {
                    Text(
                        "Área Restrita",
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
                .padding(16.dp),

            verticalArrangement = Arrangement.Center

        ) {
            Card(
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier.padding(16.dp)
                ) {

                    Text(
                        text = "Acesso de Autoridades",
                        style = MaterialTheme.typography.titleMedium
                    )

                    Spacer(
                        modifier = Modifier.height(8.dp)
                    )

                    Text(
                        text = "Credenciais para demonstração:"
                    )

                    Text(
                        text = "Usuário: admin"
                    )

                    Text(
                        text = "Senha: 1234"
                    )
                }
            }

            Spacer(
                modifier = Modifier.height(24.dp)
            )

            OutlinedTextField(

                value = username,

                onValueChange = {
                    username = it
                },

                label = {
                    Text("Usuário")
                },

                modifier = Modifier.fillMaxWidth()
            )

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            OutlinedTextField(

                value = password,

                onValueChange = {
                    password = it
                },

                label = {
                    Text("Senha")
                },

                modifier = Modifier.fillMaxWidth()
            )

            Spacer(
                modifier = Modifier.height(24.dp)
            )

            Button(

                onClick = {

                    if (
                        username == "admin" &&
                        password == "1234"
                    ) {

                        navController.navigate(
                            AppRoutes.AUTHORITY_DASHBOARD
                        )

                    } else {

                        errorMessage =
                            "Usuário ou senha inválidos"
                    }
                },

                modifier = Modifier.fillMaxWidth()

            ) {

                Text("Entrar")
            }

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            Text(errorMessage)
        }
    }
}