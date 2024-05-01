package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue={"stepdefinitions","apphooks"},
plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"html:Reports/Cucumber-Reports/Reports.html"},tags="@mainLoginPage"
		)

public class TestRunner extends AbstractTestNGCucumberTests  {

}