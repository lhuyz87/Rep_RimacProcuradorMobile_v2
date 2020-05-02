package test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import rimac.test.util.ExcelUtilPropio;

@RunWith(RunPersonalizar.class)


@CucumberOptions(features = { "src/test/java/test/feature" }, tags = {"@ContactarCliente"}, glue = { "" })
//@CucumberOptions(features = { "src/test/resources/features/" }, tags = {"@RegistrarPlacaEnUso"}, glue = { "rimac.test.definition" })

public class Run {

//	@RunBefore
//	public static void previo() {
////		ExcelUtilPropio.getInstancia().escribirFeatures();
//	}
}
