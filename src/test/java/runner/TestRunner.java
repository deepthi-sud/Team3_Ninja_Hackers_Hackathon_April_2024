package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue={"stepdefinitions","apphooks"},
plugin = {"pretty",
"html:Reports/Cucumber-Reports/Reports.html"}
//monochrome = true
		)

public class TestRunner extends AbstractTestNGCucumberTests  {

}
