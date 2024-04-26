package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverFactory;

public class LogOutPage {
	public  static WebDriver driver=DriverFactory.getdriver();
	By logOutBtn=By.xpath("//button[@id='logout']") ;

	public LogOutPage() {

		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void clickLogOutBtn() {
		driver.findElement(logOutBtn).click();

	}
}