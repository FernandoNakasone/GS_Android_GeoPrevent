package br.com.fiap.geoPrevent.model

data class Registro (
    val id: Int,
    val tipo: String,
    val descricao: String,
    val intensidade: Int,
    val data: String,
    val regiaoId: Int,
    val satelite: Satelite,
    )