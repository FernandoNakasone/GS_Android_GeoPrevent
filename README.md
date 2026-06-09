## Fluxo

O aplicativo inicia na tela SplashScreen após isso é automaticamente redirecionada para tela IntroScreen onde possui duas opções uma de voltar que não faz nada e uma de avançar que leva para HomeScreen,
a tela HomeScreen é a tela central aonde você pode acessar 3 outras telas,
a ComoFuncionaScreen que explica como o aplicativo fucniona,
a ComoPrepararScreen que tem uma checklist de items que você precisa ter pra caso algum desastre acontecer você esteja preparado para diminuir os danos, 
e a MonitorarScreen que é uma tela que apresenta todas as regiões cadastradas e quando você clica na região aparece um Card com as informações dela,
nesse card tem um botão de "Registros", esse botão leva para tela onde aparecerá todas os registro da região selecionada

<br>

SplashScreen -> IntroScreen (duas opções) -> botão "voltar"  não faz nada<br>
                              ->  botão "Avançar" -> HomeScreen  
<br>
HomeScreen(três opções) -> botão "Como funciona" -> ComoFuncionaScreen <br>
                        -> botão "Monitorar agora" -> MonitorarScreen <br>
                        -> botão "Como se preparar?" ComoPrepararScreen <br>

MonitorarScreen(duas opções) -> botão "Registros" -> RegistrosScreen <br>
                             -> botão "<-" -> HomeScreen <br>

ComoFuncionaScreen,ComoPrepararScreen,RegistrosScreen também podem retornar para a tela anterior <br>

RegistrosScreen -> MonitorarScreen <br>
ComoFuncionaScreen -> HomeScreen <br>
ComoPrepararScreen -> HomeScreen <br>

## SplashScreen

<br>

<img width = "420px" height = "900px" src="app/src/main/res/drawable/telas/splash.jpeg">

<br>

## IntroScreen

<br>

<img width = "420px" height = "900px" src="app/src/main/res/drawable/telas/intro.jpeg">

<br>

## HomeScreen

<br>

<img width = "420px" height = "900px" src="app/src/main/res/drawable/telas/home.jpeg">

<br>

## ComoFuncionaScreen

<br>

<img width = "420px" height = "900px" src="app/src/main/res/drawable/telas/como_funciona_verde.jpeg">
<img width = "420px" height = "900px" src="app/src/main/res/drawable/telas/como_funciona_amarelo.jpeg">
<img width = "420px" height = "900px" src="app/src/main/res/drawable/telas/como_funciona_laranja.jpeg">
<img width = "420px" height = "900px" src="app/src/main/res/drawable/telas/como_funciona_vermelho.jpeg">

<br>

## ComoPreparaScreen

<br>

<img width = "420px" height = "900px" src="app/src/main/res/drawable/telas/como_se_preparar1.jpeg">
<img width = "420px" height = "900px" src="app/src/main/res/drawable/telas/como_se_preparar2.jpeg">

<br>

## MonitoramentoScreen

<br>

<img width = "420px" height = "900px" src="app/src/main/res/drawable/telas/monitoramento1.jpeg>
<img width = "420px" height = "900px" src="app/src/main/res/drawable/telas/monitoramento2.jpeg">
<img width = "420px" height = "900px" src="app/src/main/res/drawable/telas/monitoramento+card.jpeg">

<br>

## RegistrosScreen

<br>

<img width = "420px" height = "900px" src="app/src/main/res/drawable/telas/registros.jpeg">

<br>

