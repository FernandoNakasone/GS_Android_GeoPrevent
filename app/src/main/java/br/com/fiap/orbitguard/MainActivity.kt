package br.com.fiap.orbitguard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.fiap.orbitguard.navigation.AppNavigation
import br.com.fiap.orbitguard.ui.theme.OrbitGuardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OrbitGuardTheme {
                    AppNavigation()
            }
        }
    }
}