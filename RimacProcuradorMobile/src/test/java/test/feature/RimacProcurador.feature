# cp01: Rimac Procurador
@tag
Feature: RimacProcurador

  @RealizarLogin
  Scenario Outline: Ingresar Aplicacion
    Given accedo al sistema Rimac Procurador con ubicacion "ubicacion" cerca al cliente
    When ingreso usuario "<usuario>" y password "<password>"
    And selecciono opcion Ingresar

    ##   Then muestra casos asignados
    Examples: 
      | usuario | password |

  ##    | procuradorautoapp5@gmail.com | Test2020# |
  ##  | procuradorautoapp5@gmail.com | Test2020# |
  @ContactarCliente
  Scenario Outline: Contactar cliente
    Given accedo al sistema Rimac Procurador con ubicacion "<ubicacion>" cerca al cliente
    When ingreso usuario "<usuario>" y password "<password>"
    And selecciono opcion Ingresar
    And selecciono opcion Ver Mapa
    And ingreso el ultimo digito de la placa "<placa>"
    And selecciono opcion Confirmar
    And selecciono Aceptar
    Then se debe mostrar mensaje "<mensaje>" satisfactorio

    Examples: 
      | ubicacion                | usuario                      | password  | placa  | mensaje                           |
 ##   | -12.0965159, -77.0278309 | procuradorautoapp4@gmail.com | Test2020# | ABA163 | El proceso termin� correctamente. |
      | -12.0965159, -77.0278309 | procuradorautoapp3@gmail.com | Test2020# | ABA155 | El proceso termin� correctamente. |
