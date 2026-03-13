package com.github.carolinapacifico.navegacao_telas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.carolinapacifico.navegacao_telas.screens.LoginScreen
import com.github.carolinapacifico.navegacao_telas.screens.MenuScreen
import com.github.carolinapacifico.navegacao_telas.screens.PedidosScreen
import com.github.carolinapacifico.navegacao_telas.screens.PerfilScreen
import com.github.carolinapacifico.navegacao_telas.ui.theme.Navegacao_telasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Navegacao_telasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginScreen(modifier = Modifier.padding(innerPadding))
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "login",
                    ) {
                        composable(route = "login") {
                            LoginScreen(modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "menu") {
                            MenuScreen(modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "pedidos") {
                            PedidosScreen(modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "perfil") {
                            PerfilScreen(modifier = Modifier.padding(innerPadding))
                        }
                    }
                }
            }
        }
    }
}
