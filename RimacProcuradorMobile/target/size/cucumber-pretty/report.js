$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/test/feature/RimacProcurador.feature");
formatter.feature({
  "name": "RimacProcurador",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Finalizar Atencion",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FinalizarAtencion"
    }
  ]
});
formatter.step({
  "name": "accedo al sistema Rimac Procurador con ubicacion \"\u003cubicacion\u003e\" cerca al cliente",
  "keyword": "Given "
});
formatter.step({
  "name": "ingreso usuario \"\u003cusuario\u003e\" y password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "selecciono opcion Ingresar",
  "keyword": "And "
});
formatter.step({
  "name": "selecciono opcion Ver Mapa",
  "keyword": "And "
});
formatter.step({
  "name": "ingreso el ultimo digito de la placa \"\u003cplaca\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "selecciono opcion Confirmar",
  "keyword": "And "
});
formatter.step({
  "name": "selecciono Aceptar",
  "keyword": "And "
});
formatter.step({
  "name": "selecciono tipo de atencion \"\u003ctipo atencion\u003e\" y tipo de siniestro \"\u003ctipo siniestro\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "selecciono finalizar atencion",
  "keyword": "And "
});
formatter.step({
  "name": "se debe mostrar la pagina principal",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ubicacion",
        "usuario",
        "password",
        "placa",
        "tipo atencion",
        "tipo siniestro",
        "mensaje"
      ]
    },
    {
      "cells": [
        "-12.0965159, -77.0278309",
        "procuradorautoapp1@gmail.com",
        "Test2020#",
        "ABA189",
        "Speed",
        "Robo parcial",
        "El proceso termin� correctamente."
      ]
    }
  ]
});
formatter.scenario({
  "name": "Finalizar Atencion",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@FinalizarAtencion"
    }
  ]
});
formatter.step({
  "name": "accedo al sistema Rimac Procurador con ubicacion \"-12.0965159, -77.0278309\" cerca al cliente",
  "keyword": "Given "
});
formatter.match({
  "location": "LoguinSteps.ingresamosRimacProcurador(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso usuario \"procuradorautoapp1@gmail.com\" y password \"Test2020#\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoguinSteps.ingresarCrendeciales(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono opcion Ingresar",
  "keyword": "And "
});
formatter.match({
  "location": "LoguinSteps.seleccionarIngresar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono opcion Ver Mapa",
  "keyword": "And "
});
formatter.match({
  "location": "ContactarClienteSteps.seleccionarMapa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso el ultimo digito de la placa \"ABA189\"",
  "keyword": "And "
});
formatter.match({
  "location": "ContactarClienteSteps.ingresarUltimoDigito(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono opcion Confirmar",
  "keyword": "And "
});
formatter.match({
  "location": "ContactarClienteSteps.seleccionarContactar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono Aceptar",
  "keyword": "And "
});
formatter.match({
  "location": "ContactarClienteSteps.seleccionarAceptar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono tipo de atencion \"Speed\" y tipo de siniestro \"Robo parcial\"",
  "keyword": "And "
});
formatter.match({
  "location": "RealizarAtencionSteps.selConfirmarTipoAtencion(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono finalizar atencion",
  "keyword": "And "
});
formatter.match({
  "location": "RealizarAtencionSteps.seleFinalizarAtencion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se debe mostrar la pagina principal",
  "keyword": "Then "
});
formatter.match({
  "location": "RealizarAtencionSteps.validarFinalizarCaso()"
});
formatter.result({
  "status": "passed"
});
});