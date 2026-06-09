package com.example.salvaguarda_gs_kotlin.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.LaunchedEffect

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack

import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController

import com.example.salvaguarda_gs_kotlin.model.ChatMessage

@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
@Composable
fun ChatbotScreen(
    navController: NavController
) {

    val messages = remember {

        mutableStateListOf(

            ChatMessage(
                text = "Olá! Como posso ajudar?",
                isUser = false
            )
        )
    }

    val listState = rememberLazyListState()

    LaunchedEffect(messages.size) {

        if (messages.isNotEmpty()) {

            listState.animateScrollToItem(
                messages.lastIndex
            )
        }
    }

    Scaffold(
        containerColor = Color(0xFF0A192F),
        topBar = {

            TopAppBar(

                title = {
                    Text(
                        "ChatBot",
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

            LazyColumn(

                state = listState,

                modifier = Modifier.weight(1f)

            ) {

                items(messages) { message ->

                    Row(

                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),

                        horizontalArrangement =
                            if (message.isUser)
                                Arrangement.End
                            else
                                Arrangement.Start

                    ) {

                        Card(

                            modifier = Modifier.fillMaxWidth(0.75f)

                        ) {

                            Text(

                                text = message.text,

                                modifier = Modifier.padding(12.dp)

                            )
                        }
                    }
                }
            }

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            Button(

                onClick = {

                    messages.add(
                        ChatMessage(
                            text = "Enchente",
                            isUser = true
                        )
                    )

                    messages.add(
                        ChatMessage(
                            text =
                                """
                            Em caso de enchente:

                            • Procure áreas elevadas.
                            • Evite ruas alagadas.
                            • Desligue a energia elétrica.
                            • Acompanhe os alertas oficiais.
                            """.trimIndent(),
                            isUser = false
                        )
                    )
                },

                modifier = Modifier.fillMaxWidth()

            ) {

                Text("Enchente")
            }

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            Button(

                onClick = {

                    messages.add(
                        ChatMessage(
                            text = "Queimada",
                            isUser = true
                        )
                    )

                    messages.add(
                        ChatMessage(
                            text =
                                """
                            Em caso de queimada:

                            • Afaste-se da área afetada.
                            • Evite inalar fumaça.
                            • Mantenha portas e janelas fechadas.
                            • Siga as orientações das autoridades.
                            """.trimIndent(),
                            isUser = false
                        )
                    )
                },

                modifier = Modifier.fillMaxWidth()

            ) {

                Text("Queimada")
            }

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            Button(

                onClick = {

                    messages.add(
                        ChatMessage(
                            text = "Autoridades",
                            isUser = true
                        )
                    )

                    messages.add(
                        ChatMessage(
                            text =
                                """
                            Contatos importantes:

                            Defesa Civil: 199
                            Bombeiros: 193
                            SAMU: 192
                            Polícia Militar: 190
                            """.trimIndent(),
                            isUser = false
                        )
                    )
                },

                modifier = Modifier.fillMaxWidth()

            ) {

                Text("Autoridades")
            }
        }
    }
}