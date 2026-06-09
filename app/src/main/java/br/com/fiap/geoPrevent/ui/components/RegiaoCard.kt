package br.com.fiap.geoPrevent.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.geoPrevent.model.Regiao
import br.com.fiap.geoPrevent.ui.screens.comoFunciona.defineCor

@Composable
fun RegiaoCard(
    regiao: Regiao,
    onMaisDetalhesClick: () -> Unit
){
    Card(
        modifier = Modifier.fillMaxSize(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(220.dp)
                ) {
                Image(
                    painter = painterResource(regiao.mapa),
                    contentDescription = "Mapa de Niterói",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Fit
                )
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(defineCor(regiao.nivelRisco))
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))



                Text("Região: ${regiao.nome}",  fontSize = 20.sp,)
                Text("Estado: ${regiao.estado}",  fontSize = 20.sp,)
                Text("Risco: ${regiao.nivelRisco}",  fontSize = 20.sp,)
                Text("Data ultimo desastre: ${regiao.dataUltimoDesastre}", fontSize = 20.sp,
                )

                Spacer(modifier = Modifier.height(40.dp))


                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onMaisDetalhesClick
                ) {
                    Text(
                        "Registros",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

        }
    }
}