package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import utilities.DriverFactory;

public class DashboardPage {
	
	public  static WebDriver driver=DriverFactory.getdriver();
	
	//@FindBy (xpath="//div[@class='box']")WebElement mngPgm;
	//WebElement mngPgm = driver.findElement(By.xpath("//div[@class='box']"));
	By mngpgm=By.xpath("//div[@class='box']");
	
	public String getCurrentUrl() {
		
		return driver.getCurrentUrl();
	}
	
	public String getHeader() {
		String header=driver.findElement(mngpgm).getText();
		return header;
	}
}