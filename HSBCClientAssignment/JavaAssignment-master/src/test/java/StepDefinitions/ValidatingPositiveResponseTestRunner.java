package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="",
		glue={"/cucumberjava/src/test/java/StepDefinitions/ValidatingPositiveResponse.java"}

		)
public class ValidatingPositiveResponseTestRunner {
	

}
