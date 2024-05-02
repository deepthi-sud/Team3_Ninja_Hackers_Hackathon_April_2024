package runner;

import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue={"stepdefinitions","apphooks"},
plugin = {"pretty",
		"html:Reports/Cucumber-Reports/Reports.html"},
//tags="@AddBatch",
monochrome = false
)

public class TestRunner extends AbstractTestNGCucumberTests  {

}
