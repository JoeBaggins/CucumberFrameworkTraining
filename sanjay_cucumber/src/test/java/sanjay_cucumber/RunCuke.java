package sanjay_cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = {"src/test/java/sanjay_cucumber.Features"}, glue = {"src/test/java/sanjay_cucumber.Steps"}, monochrome = true, plugin = {
				"pretty", "html:target/cucumber", "json:target/cucumber" }, tags = {"@positiveScenarios"}, strict = true

)

public class RunCuke {

}
