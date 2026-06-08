package br.com.fiap.orbitguard.ui.screens.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.orbitguard.R

@Composable
fun IntroScreen(
    onAdvanceClick: () -> Unit,
    onBackClick: () -> Unit
) {

    Scaffold { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo OrbitGuard"
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                "OrbitGuard",
                fontSize = 36.sp,
                fontWeight = FontWeight.ExtraBold
            )

            Spacer(modifier = Modifier.height(26.dp))

            Text(
                "O OrbitGuard utiliza dados de satélites, inteligência artificial e monitoramento em tempo real para prever riscos ambientais e emitir alertas antecipados. Assim, moradores de áreas vulneráveis podem agir rapidamente para reduzir impactos e proteger vidas.",
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                OutlinedButton(
                    onClick = onBackClick
                ) {
                    Text("Voltar")
                }

                Button(
                    onClick = onAdvanceClick
                ) {
                    Text("Avançar")
                }
            }
        }
    }
}