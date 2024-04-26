package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.Constants;
import utilities.ConfigReader;
import utilities.DriverFactory;

public class LoginPage {


	public  static WebDriver driver=DriverFactory.getdriver();
	String lmsUrl=ConfigReader.getUrl();
	
	By username=By.id("username");
	By password=By.id("password");
	By loginBtn=By.xpath("//button[@type='submit']");
	
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
}
