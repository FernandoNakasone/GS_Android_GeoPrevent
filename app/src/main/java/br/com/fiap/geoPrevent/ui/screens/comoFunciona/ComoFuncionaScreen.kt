package br.com.fiap.geoPrevent.ui.screens.comoFunciona

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.geoPrevent.R
import br.com.fiap.geoPrevent.ui.components.GeoPreventTopBar
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.layout.ContentScale

@Composable
fun ComoFuncionaScreen(
    onBackClick: () -> Unit
){
    var nivelRisco by remember { mutableIntStateOf(0)}
    Scaffold (
        topBar = {
            GeoPreventTopBar(
                title = "Como Funciona?",
                showBackButton = true,
                onBackClick = onBackClick
            )
        }
    ){
            innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(
                "Cada região tem seu risco analisado em tempo real por meio dos satélites Jason-3 e Jason-CS.",
                fontSize = 18.sp,
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                "Por meio da página de monitoramento, é possível visualizar dados sobre cada região, além de exibir cores de acordo com o risco atual da mesma.",
                fontSize = 18.sp,
            )

            Spacer(modifier = Modifier.height(40.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
            ) {

                Image(
                    painter = painterResource(R.drawable.niteroi),
                    contentDescription = "Mapa de Niterói",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Fit
                )

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(defineCor(nivelRisco))
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                "Simulador de risco: $nivelRisco",
                fontSize = 24.sp,
            )

            Slider(
                value = nivelRisco.toFloat(),
                onValueChange = {nivelRisco = it.toInt()},
                valueRange = 0.toFloat() .. 10.toFloat(),
                modifier = Modifier.fillMaxWidth()
            )

        }
    }
}

fun defineCor(nivelRisco: Int): Color {
    if (nivelRisco <= 2) {
        return Color(0, 255, 0, 128)
    }
    if (nivelRisco <= 5) {
        return Color(255, 255, 0, 128)
    }
    if (nivelRisco <= 8) {
        return Color(255, 152, 0, 128)
    }
    return Color(244, 67, 54, 179)
}