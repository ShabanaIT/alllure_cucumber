package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


// Ctrl+Shift+O  to auto import

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src/test/resources/Features" },
		glue = { "step_definitions","Hooks"},
	plugin = { "pretty", "html:target/cucumber-reports" }
)

public class Runner {
	
}
