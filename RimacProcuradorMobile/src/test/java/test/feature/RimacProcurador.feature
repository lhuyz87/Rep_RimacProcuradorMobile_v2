# cp01: Rimac Procurador
@tag
Feature: RimacProcurador

  @RealizarLogin
  Scenario Outline: Ingresar Aplicacion
    Given accedo al sistema Rimac Procurador con ubicacion "<ubicacion>" cerca al cliente
    When ingreso usuario "<usuario>" y password "<password>"
    And selecciono opcion Ingresar
    Then se debe mostrar la pagina principal

    Examples: 
      | ubicacion                | usuario                      | password  |
      | -12.0965159, -77.0278309 | procuradorautoapp5@gmail.com | Test2020# |

  ##| procuradorautoapp5@gmail.com | Test2020# |
  @Test @ContactarCliente
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
      | -12.0965159, -77.0278309 | procuradorautoapp4@gmail.com | Test2020# | ABA163 | El proceso termin� correctamente. |
      | -12.0965159, -77.0278309 | procuradorautoapp3@gmail.com | Test2020# | ABA155 | El proceso termin� correctamente. |

  @FinalizarAtencion
  Scenario Outline: Finalizar Atencion
    Given accedo al sistema Rimac Procurador con ubicacion "<ubicacion>" cerca al cliente
    When ingreso usuario "<usuario>" y password "<password>"
    And selecciono opcion Ingresar
    And selecciono opcion Ver Mapa
    And ingreso el ultimo digito de la placa "<placa>"
    And selecciono opcion Confirmar
    And selecciono Aceptar
    And selecciono tipo de atencion "<tipo atencion>" y tipo de siniestro "<tipo siniestro>"
    And selecciono finalizar atencion
    Then se debe mostrar la pagina principal

    Examples: 
      | ubicacion                | usuario                      | password  | placa  | tipo atencion         | tipo siniestro | mensaje                           |
      | -12.0965159, -77.0278309 | procuradorautoapp1@gmail.com | Test2020# | ABA189 | Speed                 | Robo parcial   | El proceso termin� correctamente. |
  #    | -12.1709419, -77.0009815 | procuradorautoapp2@gmail.com | Test2020# | ABA190 | Speed                 | Choque         | El proceso termin� correctamente. |
  #    | -12.1110620, -77.0315913 | procuradorautoapp3@gmail.com | Test2020# | ABA191 | Denuncia Policial     | Choque         | El proceso termin� correctamente. |
  #    | -12.1709419, -77.0009815 | procuradorautoapp5@gmail.com | Test2020# | ABA193 | Constataci�n de da�os | NA             | El proceso termin� correctamente. |
  #    | -12.0965159, -77.0278309 | procuradorautoapp4@gmail.com | Test2020# | ABA194 | Desistimiento         | NA             | El proceso termin� correctamente. |
  #  | -12.1110620, -77.0315913 | procuradorautoapp5@gmail.com | Test2020# | ABA178 | Speed                 | Robo parcial   | El proceso termin� correctamente. |
