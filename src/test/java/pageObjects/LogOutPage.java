package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverFactory;

public class LogOutPage {
	public  static WebDriver driver=DriverFactory.getdriver();
	@FindBy (xpath="//button[@id='logout']")WebElement logOutBtn;

	public LogOutPage() {

		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void clickLogOutBtn() {
		logOutBtn.click();

	}
}
