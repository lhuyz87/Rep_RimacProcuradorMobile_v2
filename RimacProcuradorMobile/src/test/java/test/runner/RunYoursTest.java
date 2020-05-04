package test.runner;

import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@org.testng.annotations.Test
//@CucumberOptions(features = { "src/test/java/test/feature" }, tags = {"@RealizarLogin"}, glue = { "" })

@CucumberOptions(features = { "src/test/java/test/feature" }, plugin= {"json:target/cucumber.json","html:target/size/cucumber-pretty"} ,tags = {"@RealizarLogin"}, glue = { "" })


public class RunYoursTest 
{
// This class will be empty 
}