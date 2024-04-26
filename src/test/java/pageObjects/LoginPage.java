package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverFactory;

public class LoginPage {


	public  static WebDriver driver=DriverFactory.getdriver();
	String lmsUrl=ConfigReader.getUrl();
	
	@FindBy (id="username") static WebElement username;
	@FindBy (id="password")static WebElement password;
	@FindBy (xpath="//button[@type='submit']")WebElement loginBtn;
	
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
		username.sendKeys(uname);
		password.sendKeys(pwd);
	}

	public void clickLoginBtn() {
		loginBtn.click();

	}
}
