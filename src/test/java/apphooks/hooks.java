package apphooks;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;



import utilities.ConfigReader;
import utilities.DriverFactory;
import utilities.LoggerLoad;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;


public class hooks {
	private static WebDriver driver;
	private static DriverFactory driverfactory;
	private static ConfigReader configReader;
	private static Properties properties;
	static Scenario scenario;

	@BeforeAll
	public static void before() throws Throwable {

		configReader = new ConfigReader();
		Properties prop;

		prop = configReader.loadConfig();


		driver = DriverFactory.initializeDrivers(prop.getProperty("browser"));
		driver=DriverFactory.getdriver();

		driver.get(prop.getProperty("url"));
		//Constants.URL=properties.getProperty("url");
		//Constants.user_name=properties.getProperty("USERNAME");
		//driver.set(driver);

		//		Reading browser name from Config.properties File
		//LoggerLoad.info("Loading Config file");
		//ConfigReader.loadConfig();
		//String browser = ConfigReader.getBrowserType();

		//Initializing Driver using Driver Factory
		// driver = DriverFactory.initializeDrivers(browser);

		//LoggerLoad.info("Initializing driver for : "+browser);

	}


	@BeforeMethod
	public void scenario(Scenario scenario) {
//				LoggerLoad.info("-----------------------------------------------------------------------------------------------");
//				LoggerLoad.info(scenario.getSourceTagNames() +" : "+scenario.getName());
//				LoggerLoad.info("-----------------------------------------------------------------------------------------------");
//				
	}

	@AfterStep
	public void a(Scenario scenario){
		  if(scenario.isFailed())
	        {
			LoggerLoad.error("Steps Failed , Taking Screenshot");
	        final byte[] screenshot=    ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	        scenario.attach(screenshot, "image/png", "My screenshot");
	        }
		    
	}

	@AfterAll
	public static void after() {
		
		LoggerLoad.info("Closing Driver");
	    DriverFactory.closeallDriver();
	}

}