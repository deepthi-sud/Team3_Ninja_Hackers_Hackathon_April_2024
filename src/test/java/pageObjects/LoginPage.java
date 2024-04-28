package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.ConfigReader;
import utilities.DriverFactory;

public class LoginPage {

	
	    public  static WebDriver driver=DriverFactory.getdriver();
//		String lmsUrl=ConfigReader.getUrl();
	    By username=By.id("username");
		By password=By.id("password");
		By loginBtn=By.xpath("//button[@type='submit']");
		By logoutLink = By.xpath("//span[text()='Logout']");
		
		public void getLoginPage() {
			driver.get(Constants.URL);
		}
		
		public String getTitle() {
			 return driver.getTitle();
		}
		public void setLogin() {
			
			driver.findElement(username).sendKeys(Constants.user_name);
			driver.findElement(password).sendKeys(Constants.pass_word);
		}

		public void clickLoginBtn() {
			driver.findElement(loginBtn).click();

		}
		
		public Boolean verifyLogin() {
			WebElement logout = driver.findElement(logoutLink);
			Boolean result = false;
			if (logoutLink != null) {
				result = true;
			}
			return result;
		}
		
}
