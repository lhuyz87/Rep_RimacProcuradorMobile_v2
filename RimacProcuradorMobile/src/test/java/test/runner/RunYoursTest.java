package test.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Test
@CucumberOptions(features = { "src/test/java/test/feature" }, tags = {"@ContactarCliente"}, glue = { "" })


public class RunYoursTest 
{
// This class will be empty 
}