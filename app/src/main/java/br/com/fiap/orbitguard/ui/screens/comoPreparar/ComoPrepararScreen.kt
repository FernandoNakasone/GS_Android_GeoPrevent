package br.com.fiap.orbitguard.ui.screens.comoPreparar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.fiap.orbitguard.ui.components.OrbitguardTopBar
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ComoPrepararScreen(
    onBackClick: () -> Unit
) {
    var agua by remember { mutableStateOf(false) }
    var alimentos by remember { mutableStateOf(false) }
    var lanterna by remember { mutableStateOf(false) }
    var kitSocorros by remember { mutableStateOf(false) }
    var medicamentos by remember { mutableStateOf(false) }
    var radio by remember { mutableStateOf(false) }
    var powerbank by remember { mutableStateOf(false) }
    var fosforos by remember { mutableStateOf(false) }
    var canivete by remember { mutableStateOf(false) }
    var roupas by remember { mutableStateOf(false) }

    val items = 10

    val itemsChecked = listOf(
        agua,
        alimentos,
        lanterna,
        kitSocorros,
        medicamentos,
        radio,
        powerbank,
        fosforos,
        canivete,
        roupas
    ).count { it }

    val porcentagemChecked = itemsChecked.toFloat() / items;
    Scaffold(
        topBar = {
            OrbitguardTopBar(
                title = "Como se preparar?",
                showBackButton = true,
                onBackClick = onBackClick
            )
        }
    ) { innerPadding ->



        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp)
        ) {

            item {
                Text(
                    "Checklist de preparação:",
                    fontSize = 26.sp
                )

                Spacer(modifier = Modifier.height(30.dp))
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { agua = !agua },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = agua,
                        onCheckedChange = { agua = it }
                    )
                    Text("Água armazenada", fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { alimentos = !alimentos },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = alimentos,
                        onCheckedChange = { alimentos = it }
                    )
                    Text("Alimentos não perecíveis", fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { lanterna = !lanterna },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = lanterna,
                        onCheckedChange = { lanterna = it }
                    )
                    Text("Lanterna disponível", fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { kitSocorros = !kitSocorros },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = kitSocorros,
                        onCheckedChange = { kitSocorros = it }
                    )
                    Text("Kit de primeiros socorros", fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { medicamentos = !medicamentos },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = medicamentos,
                        onCheckedChange = { medicamentos = it }
                    )
                    Text("Medicamentos", fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { radio = !radio },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = radio,
                        onCheckedChange = { radio = it }
                    )
                    Text("Rádio portátil", fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { powerbank = !powerbank },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = powerbank,
                        onCheckedChange = { powerbank = it }
                    )
                    Text("Powerbank para celulares", fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { fosforos = !fosforos },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = fosforos,
                        onCheckedChange = { fosforos = it }
                    )
                    Text("Fósforos", fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { canivete = !canivete },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = canivete,
                        onCheckedChange = { canivete = it }
                    )
                    Text("Canivete multiuso", fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { roupas = !roupas },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = roupas,
                        onCheckedChange = { roupas = it }
                    )
                    Text("Roupas limpas", fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
            item {
                Text(
                    "Porcentagem de preparação: ${(porcentagemChecked * 100).toInt()}%",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                LinearProgressIndicator(
                    progress = { porcentagemChecked },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}