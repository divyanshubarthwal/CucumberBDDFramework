package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/java/features" ,/*executing all feature files*/
	glue="StepDefinitions",stepNotifications=true) //define step definiton file , no need of location , give package name

public class TestRunner {

}
