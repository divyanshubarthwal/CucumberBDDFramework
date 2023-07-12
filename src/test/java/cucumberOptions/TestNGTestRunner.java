package cucumberOptions;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/java/features" ,/*executing all feature files*/
		glue="StepDefinitions")

public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
// 1. cucumber Junit test runner 2. cucumber TestNG test runner