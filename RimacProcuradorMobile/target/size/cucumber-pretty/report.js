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
  "name": "Ingresar Aplicacion",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RealizarLogin"
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
        "password"
      ]
    },
    {
      "cells": [
        "-12.0965159, -77.0278309",
        "procuradorautoapp5@gmail.com",
        "Test2020#"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Ingresar Aplicacion",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@RealizarLogin"
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
  "name": "ingreso usuario \"procuradorautoapp5@gmail.com\" y password \"Test2020#\"",
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