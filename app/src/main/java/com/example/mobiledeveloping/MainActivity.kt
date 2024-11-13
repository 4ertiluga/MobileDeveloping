package com.example.mobiledeveloping

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mobiledeveloping.ui.theme.MobileDevelopingTheme
import com.example.mobiledeveloping.ui_components.BottomNavigationBar
import com.example.mobiledeveloping.ui_components.FactsScreen
import com.example.mobiledeveloping.ui_components.ListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileDevelopingTheme {
               FactsApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FactsApp() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "facts",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("facts") { FactsScreen(viewModel()) }
            composable("list") { ListScreen(viewModel()) }
        }
    }
}