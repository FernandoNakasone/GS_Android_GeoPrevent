package br.com.fiap.geoPrevent.navigation

import kotlinx.serialization.Serializable

@Serializable
object SplashRoute

@Serializable
object IntroRoute

@Serializable
object HomeRoute

@Serializable
object ComoFuncionaRoute

@Serializable
object ComoPrepararRoute

@Serializable
object MonitorarRoute

@Serializable
data class MaisDetalhesRoute(
    val regiaoId: Int
)