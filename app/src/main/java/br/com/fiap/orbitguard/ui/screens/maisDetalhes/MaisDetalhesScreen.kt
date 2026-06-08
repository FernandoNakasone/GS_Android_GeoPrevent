package br.com.fiap.orbitguard.ui.screens.maisDetalhes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.fiap.orbitguard.model.Regiao
import br.com.fiap.orbitguard.repository.getRegistrosByRegiao
import br.com.fiap.orbitguard.ui.components.OrbitguardTopBar
import br.com.fiap.orbitguard.ui.components.RegistroCard

@Composable
fun MaisDetalhesScreen(
    regiao: Regiao,
    onBackClick: () -> Unit,
){

    val registros = remember(regiao.id) { getRegistrosByRegiao(regiao.id) }

    Scaffold (
        topBar = {
            OrbitguardTopBar(
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
            items(registros) { registro ->
                RegistroCard(
                    regiao = regiao,
                    registro =  registro
                )
            }
        }

    }
}