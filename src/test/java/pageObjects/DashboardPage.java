package pageObjects;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.net.HttpURLConnection;
import java.net.URL;
import constants.Constants;
import java.time.Duration;
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
	
//	public boolean isPageLoaded(){
//	
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		
////		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
////            wait.until(ExpectedConditions.visibilityOfElementLocated(mngpgm)); 
//		if(driver.getCurrentUrl()==Constants.URL)
//			return true;
//		else
//		return false;
//           
//		
//		}
		

	//Validating Link Response
	public int getLinkResponse() throws Exception {

		@SuppressWarnings("deprecation")
		URL link = new URL(Constants.URL);
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(30000); // Set connection timeout to 30 seconds
		httpURLConnection.connect();
		return httpURLConnection.getResponseCode();
	}

	public String getTitle() {
		String title=driver.findElement(titleElement).getText();
		return title;
	}

	//Checking if LMS title is top left
	public boolean isTitleLocLeft() {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement title=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(titleElement)));
		int getX = title.getLocation().getX();
		int getY=title.getLocation().getY();
		if (getX<20 && getY<20)
			return true;
		else
			return false;
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

	public boolean isNavLocRight() {
		int getX =driver.findElement(navigationElement).getLocation().getX();
		int getY=driver.findElement(navigationElement).getLocation().getY();
		if (getX>1000 && getY<20)
			return true;
		else
			return false;
	} 
}