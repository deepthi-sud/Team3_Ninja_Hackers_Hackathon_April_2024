package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverFactory;

public class LoginPage {

	
	    public  static WebDriver driver=DriverFactory.getdriver();
		String lmsUrl=ConfigReader.getUrl();
		
		public LoginPage() {

			PageFactory.initElements(driver, this);
		}

		public void getLoginPage() {
			driver.get(lmsUrl);
		}
		
		public String getTitle() {
			 return driver.getTitle();
		}
		
}
