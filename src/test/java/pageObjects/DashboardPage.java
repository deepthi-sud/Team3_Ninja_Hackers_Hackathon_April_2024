package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.DriverFactory;

public class DashboardPage {
	
	public  static WebDriver driver=DriverFactory.getdriver();
	
	By mngpgm=By.xpath("//div[@class='box']");
	By titleElement=By.xpath("//span[contains(text(), 'LMS')]");
	By navigationElement=By.xpath("//mat-toolbar//button[contains(@class,'mat-focus-indicator')]");
	
	public String getCurrentUrl() {
		
		return driver.getCurrentUrl();
	}
	
	public String getHeader() {
		String header=driver.findElement(mngpgm).getText();
		return header;
	}

	public String getTitle() {
		String title=driver.findElement(titleElement).getText();
		return title;
	}
	
	//Getting the text from navigation bar into a list
	public ArrayList<String> getNavElements() {
		List<WebElement> elements=driver.findElements(navigationElement);
		List<String> list = new ArrayList<String>();
		
		for (WebElement element:elements) {
		    list.add(element.getText());
           }
		return (ArrayList<String>) list;
				
	}
}