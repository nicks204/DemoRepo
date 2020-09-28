package validations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"pretty", "html:target/cucumber-html"},
		features = "src/test/java/validations",
		tags = {"@Sanity"},
		glue = { "validations" }
		)

public class TestRunner {

}
