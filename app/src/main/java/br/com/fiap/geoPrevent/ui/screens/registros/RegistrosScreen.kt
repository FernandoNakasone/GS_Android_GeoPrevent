package br.com.fiap.geoPrevent.ui.screens.registros

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.geoPrevent.model.Regiao
import br.com.fiap.geoPrevent.repository.getRegistrosByRegiao
import br.com.fiap.geoPrevent.ui.components.GeoPreventTopBar
import br.com.fiap.geoPrevent.ui.components.RegistroCard

@Composable
fun RegistroScreen(
    regiao: Regiao,
    onBackClick: () -> Unit,
){

    val registros = remember(regiao.id) { getRegistrosByRegiao(regiao.id) }

    Scaffold (
        topBar = {
            GeoPreventTopBar(
                title = "Registros",
                showBackButton = true,
                onBackClick = onBackClick
            )
        }
    ){
            innerPadding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
        ) {

            item {
                Text(regiao.nome, fontSize = 24.sp, fontWeight = FontWeight.Bold)
            }

            items(registros) { registro ->
                RegistroCard(
                    regiao = regiao,
                    registro =  registro
                )
            }
        }

    }
}