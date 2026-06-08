package br.com.fiap.orbitguard.repository

import br.com.fiap.orbitguard.R
import br.com.fiap.orbitguard.model.Regiao

fun getAllRegioes(): List<Regiao> {
    return listOf(

        Regiao(
            id = 1,
            nome = "Peruíbe",
            estado = "SP",
            area = 326.20,
            mapa = R.drawable.peruibe,
            nivelRisco = 7,
            dataUltimoDesastre = "02/06/2026",
            registros = listOf(
                registro1,
                registro6,
                registro7
            )
        ),

        Regiao(
            id = 2,
            nome = "Campinas",
            estado = "SP",
            area = 794.57,
            mapa = R.drawable.campinas,
            nivelRisco = 2,
            dataUltimoDesastre = "19/06/2026",
            registros = listOf(
                registro2,
                registro8
            )
        ),

        Regiao(
            id = 3,
            nome = "Pindamonhangaba",
            estado = "SP",
            area = 731.35,
            mapa = R.drawable.pindamonhangaba,
            nivelRisco = 4,
            dataUltimoDesastre = "16/04/2026",
            registros = listOf(
                registro3,
                registro4
            )
        ),

        Regiao(
            id = 4,
            nome = "Boa Esperança",
            estado = "ES",
            area = 428.50,
            mapa = R.drawable.boa_esperanca,
            nivelRisco = 8,
            dataUltimoDesastre = "25/07/2025",
            registros = listOf(
                registro5
            )
        ),

        Regiao(
            id = 5,
            nome = "Pouso Alegre",
            estado = "MG",
            area = 542.80,
            mapa = R.drawable.pouso_alegre,
            nivelRisco = 5,
            dataUltimoDesastre = "11/05/2024",
            registros = listOf(
                registro9
            )
        ),

        Regiao(
            id = 6,
            nome = "Niterói",
            estado = "RJ",
            area = 133.76,
            mapa = R.drawable.niteroi,
            nivelRisco = 10,
            dataUltimoDesastre = "18/12/2025",
            registros = listOf(
                registro10
            )
        )
    )
}

