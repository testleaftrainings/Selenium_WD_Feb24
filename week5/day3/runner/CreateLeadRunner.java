package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinition.ProjectSpecificMethod;

@CucumberOptions(features = {"src/test/java/features/CreateLead.feature","src/test/java/features/LoginNeg.feature"},
				glue ="stepDefinition",
				publish = true,
				monochrome = true)
public class CreateLeadRunner extends ProjectSpecificMethod{

}
