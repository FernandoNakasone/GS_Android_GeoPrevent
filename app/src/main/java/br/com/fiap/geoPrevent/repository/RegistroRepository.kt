package br.com.fiap.geoPrevent.repository

import br.com.fiap.geoPrevent.model.Registro
import br.com.fiap.geoPrevent.model.Satelite

val registro1 = Registro(
    id = 1,
    tipo = "Alagamento",
    descricao = "Alagamento durante chuva forte",
    intensidade = 8,
    data = "26/05/2026",
    regiaoId = 1,
    satelite = Satelite.JASON3
)

val registro2 = Registro(
    id = 2,
    tipo = "Deslizamento de terra",
    descricao = "Deslizamento durante a noite após dias de chuvas fortes",
    intensidade = 10,
    data = "04/01/2026",
    regiaoId = 2,
    satelite = Satelite.JASON_CS
)

val registro3 = Registro(
    id = 3,
    tipo = "Alagamento",
    descricao = "Alagamento durante chuva",
    intensidade = 5,
    data = "14/03/2026",
    regiaoId = 3,
    satelite = Satelite.JASON3
)

val registro4 = Registro(
    id = 4,
    tipo = "Deslizamento de terra",
    descricao = "Deslizamento de terra após chuva fraca",
    intensidade = 3,
    data = "14/12/2024",
    regiaoId = 3,
    satelite = Satelite.JASON_CS
)

val registro5 = Registro(
    id = 5,
    tipo = "Enchente",
    descricao = "Enchente durante chuva intensa",
    intensidade = 7,
    data = "14/11/2023",
    regiaoId = 4,
    satelite = Satelite.JASON3
)

val registro6 = Registro(
    id = 6,
    tipo = "Deslizamento de terra",
    descricao = "Deslizamento durante a noite após dias de chuvas fortes",
    intensidade = 10,
    data = "04/01/2026",
    regiaoId = 1,
    satelite = Satelite.JASON_CS
)

val registro7 = Registro(
    id = 7,
    tipo = "Enchente",
    descricao = "Enchente durante chuva intensa",
    intensidade = 7,
    data = "14/11/2023",
    regiaoId = 1,
    satelite = Satelite.JASON3
)

val registro8 = Registro(
    id = 8,
    tipo = "Enchente",
    descricao = "Enchente durante chuva intensa",
    intensidade = 7,
    data = "14/11/2023",
    regiaoId = 2,
    satelite = Satelite.JASON3
)

val registro9 = Registro(
    id = 9,
    tipo = "Enchente",
    descricao = "Enchente durante chuva intensa",
    intensidade = 7,
    data = "14/11/2023",
    regiaoId = 5,
    satelite = Satelite.JASON3
)

val registro10 = Registro(
    id = 10,
    tipo = "Enchente",
    descricao = "Enchente durante chuva intensa",
    intensidade = 7,
    data = "14/11/2023",
    regiaoId = 6,
    satelite = Satelite.JASON3
)

fun getAllRegistros(): List<Registro> {
    return listOf(
        registro1,
        registro2,
        registro3,
        registro4,
        registro5,
        registro6,
        registro7,
        registro8,
        registro9,
        registro10
    )
}

fun getRegistrosByRegiao(regiaoId: Int): List<Registro> {
    return getAllRegistros().filter {
        it.regiaoId == regiaoId
    }
}