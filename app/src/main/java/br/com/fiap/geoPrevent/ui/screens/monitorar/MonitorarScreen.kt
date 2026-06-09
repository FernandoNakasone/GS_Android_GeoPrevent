package br.com.fiap.geoPrevent.ui.screens.monitorar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.fiap.geoPrevent.model.Regiao
import br.com.fiap.geoPrevent.repository.getAllRegioes
import br.com.fiap.geoPrevent.ui.components.GeoPreventTopBar
import br.com.fiap.geoPrevent.ui.components.RegiaoCard
import br.com.fiap.geoPrevent.ui.components.RegiaoMiniCard

@Composable
fun MonitorarScreen(
    onBackClick: () -> Unit,
    onMaisDetalhesClick: (Int) -> Unit

) {
    val regiaoState by remember { mutableStateOf(getAllRegioes()) }
    var regiaoSelecionada by remember { mutableStateOf<Regiao?>(null) }
    val regiao = regiaoSelecionada

    Scaffold(
        topBar = {
            GeoPreventTopBar(
                title = "Monitoramento",
                showBackButton = true,
                onBackClick = onBackClick
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(regiaoState) { regiao ->
                    RegiaoMiniCard(
                        regiao = regiao,
                        onClick = {
                            regiaoSelecionada = regiao
                        }
                    )
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            if(regiao != null){
                RegiaoCard(
                    regiao = regiao,
                    onMaisDetalhesClick = {
                        onMaisDetalhesClick(regiao.id)
                    }
                )
            }

        }

    }
}