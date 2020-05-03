package test.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "src/test/java/test/feature" }, tags = {"@ContactarCliente"}, glue = { "" })


public class RunYoursTest 
{
// This class will be empty 
}