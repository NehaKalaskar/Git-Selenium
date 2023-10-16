package CucmberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/feartures",
		glue="StepDefination")
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
