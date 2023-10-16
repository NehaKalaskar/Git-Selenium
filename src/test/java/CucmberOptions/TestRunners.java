package CucmberOptions;
//feature file
//stepDefination file

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feartures",
		glue="StepDefination", stepNotifications = true)

public class TestRunners {

}
