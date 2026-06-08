package br.com.fiap.orbitguard.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.orbitguard.model.Regiao

@Composable
fun RegiaoMiniCard(
    regiao: Regiao,
    onClick: () -> Unit
){
    Card(
        shape = CircleShape,
        modifier = Modifier.size(100.dp)
            .clickable {
                onClick()
            },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(regiao.mapa),
                contentDescription = "Mapa de ${regiao.nome}",
                modifier = Modifier.size(50.dp),
                contentScale = ContentScale.Fit
            )
            Text(regiao.nome, textAlign = TextAlign.Center, fontSize = 8.sp,)
        }
    }
}