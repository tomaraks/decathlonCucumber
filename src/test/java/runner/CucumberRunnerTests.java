package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@SmokeTest", features = "src/test/resources/features/", glue = "stepDefinitions",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}