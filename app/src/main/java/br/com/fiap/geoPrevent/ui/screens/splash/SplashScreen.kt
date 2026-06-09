package br.com.fiap.geoPrevent.ui.screens.splash


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import br.com.fiap.geoPrevent.ui.components.LogoAnimated
import kotlinx.coroutines.delay
import kotlin.Unit;

@Composable
fun SplashScreen(
    onNavigateToIntro: () -> Unit
){
    LaunchedEffect(Unit) {
        delay(6000)
        onNavigateToIntro()
    }
    Scaffold { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            LogoAnimated()
        }
    }

}
