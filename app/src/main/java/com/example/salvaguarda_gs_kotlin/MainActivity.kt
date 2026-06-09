package com.example.salvaguarda_gs_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.salvaguarda_gs_kotlin.navigation.AppNavigation
import com.example.salvaguarda_gs_kotlin.ui.theme.SalvaGuardaGSKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SalvaGuardaGSKotlinTheme {
                AppNavigation()
            }
        }
    }
}