package br.com.fiap.geoPrevent.model

import androidx.annotation.DrawableRes
import br.com.fiap.geoPrevent.R

data class Regiao (
    val id: Int,
    val nome: String,
    val estado: String,
    val area: Double,
    @DrawableRes var mapa: Int = R.drawable.ic_launcher_background,
    val nivelRisco: Int,
    val dataUltimoDesastre: String,
    val registros: List<Registro>
)