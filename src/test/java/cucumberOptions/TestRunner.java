package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/java/features" ,/*executing all feature files*/
	glue="StepDefinitions",tags="@RegTest1",dryRun=true,monochrome=true,stepNotifications=true,
	plugin= {"pretty","html:target/cucumber.html","json:target/cuckes.json","junit:target/cfile.xml"}) //define step definiton file , no need of location , give package name

public class TestRunner {

}
