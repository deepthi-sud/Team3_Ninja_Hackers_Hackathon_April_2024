package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.Constants;
import utilities.ConfigReader;
import utilities.DriverFactory;

public class BatchPage {
	
	 public  static WebDriver driver=DriverFactory.getdriver();
	//	String lmsUrl=ConfigReader.getUrl();
	

	By Username= By.id("username");
	By Password= By.id("password");
	By LoginBtn=By.xpath("//span[text()='Login']");
	By BatchClick=By.xpath("//span[text()='Batch']");
	
	
	
	public void LMSLogin() {
		driver.findElement(Username).sendKeys("sdetorganizers@gmail.com");

		driver.findElement(Password).sendKeys("UIHackathon@02");
		driver.findElement(LoginBtn).click();
	}


	
	/*
	 * public void Enterusername() {
	 * driver.findElement(Username).sendKeys("sdetorganizers@gmail.com"); }
	 * 
	 * public void Enterpassword() {
	 * driver.findElement(Password).sendKeys("UIHackathon@02"); }
	 * 
	 * public void LoginBtn() { driver.findElement(LoginBtn).click(); }
	 */
	 
	  public void BatchClicklink() { driver.findElement(BatchClick).click(); }
	 

}