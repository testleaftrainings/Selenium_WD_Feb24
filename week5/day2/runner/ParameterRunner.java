package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/features/CommonTestSteps.feature",
				 glue ="stepDefinition")
public class ParameterRunner extends AbstractTestNGCucumberTests {

}
