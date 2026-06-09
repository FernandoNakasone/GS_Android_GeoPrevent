package br.com.fiap.geoPrevent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.fiap.geoPrevent.navigation.AppNavigation
import br.com.fiap.geoPrevent.ui.theme.GeoPreventTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GeoPreventTheme {
                    AppNavigation()
            }
        }
    }
}