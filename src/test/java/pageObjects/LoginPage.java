package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverFactory;

public class LoginPage {


	public  static WebDriver driver=DriverFactory.getdriver();
	String lmsUrl=ConfigReader.getUrl();
	
	By username=By.id("username");
	By password=By.id("password");
	By loginBtn=By.xpath("//button[@type='submit']");
	
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public void getLoginPage() {
		driver.get(lmsUrl);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void setLogin() {
		String	uname="sdetorganizers@gmail.com";
		String pwd="UIHackathon@02";
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();

	}
}
