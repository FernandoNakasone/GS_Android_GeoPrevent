package br.com.fiap.orbitguard.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import br.com.fiap.orbitguard.repository.getAllRegioes
import br.com.fiap.orbitguard.ui.screens.comoFunciona.ComoFuncionaScreen
import br.com.fiap.orbitguard.ui.screens.home.HomeScreen
import br.com.fiap.orbitguard.ui.screens.intro.IntroScreen
import br.com.fiap.orbitguard.ui.screens.splash.SplashScreen
import br.com.fiap.orbitguard.ui.screens.comoPreparar.ComoPrepararScreen
import br.com.fiap.orbitguard.ui.screens.monitorar.MonitorarScreen
import br.com.fiap.orbitguard.ui.screens.registros.RegistroScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = SplashRoute
    ){
        composable<SplashRoute>{
            SplashScreen(
                onNavigateToIntro = {
                    navController.navigate(IntroRoute) {
                        popUpTo<SplashRoute>{
                            inclusive = true
                        }
                    }
                },
            )
        }

        composable<IntroRoute> {
            IntroScreen(
                onAdvanceClick = {
                    navController.navigate(HomeRoute)
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable<HomeRoute>{
            HomeScreen(
                onComoFuncionaClick = {
                    navController.navigate(ComoFuncionaRoute)
                },
                onMonitorarAgoraClick = {
                    navController.navigate(MonitorarRoute)
                },
                onComoPrepararClick = {
                    navController.navigate(ComoPrepararRoute)
                }
            )
        }

        composable<ComoFuncionaRoute>{
            ComoFuncionaScreen(
                onBackClick = {
                        navController.popBackStack()
                },
            )
        }

        composable<ComoPrepararRoute>{
            ComoPrepararScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable<MonitorarRoute> {
            MonitorarScreen(
                onBackClick = {
                    navController.popBackStack()
                },
                onMaisDetalhesClick = { regiaoId ->
                    navController.navigate(MaisDetalhesRoute(regiaoId))
                }
            )
        }

        composable<MaisDetalhesRoute> { backStackEntry ->
            val args = backStackEntry.toRoute<MaisDetalhesRoute>()
            val regiao = getAllRegioes().find {
                it.id == args.regiaoId
            }

            if (regiao != null) {
                RegistroScreen(
                    regiao = regiao,
                    onBackClick = {
                        navController.popBackStack()
                    }
                )
            }
        }

    }

}