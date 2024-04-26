package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import utilities.ConfigReader;
import utilities.DriverFactory;


////div[normalize-space()='Manage Program']
////div[normalize-space()='Manage Program']
////div[contains(text(),' Manage Program')]
public class ProgramPage extends LoginPage{
	
	WebDriver driver=DriverFactory.getdriver();
	String browser = ConfigReader.getBrowserType();
	String url = ConfigReader.getDashUrl();
		
	Wait<WebDriver> wait =
	        new FluentWait<>(driver)
	            .withTimeout(Duration.ofSeconds(1))
	            .pollingEvery(Duration.ofMillis(300))
	            .ignoring(ElementNotInteractableException.class);
	
	//@FindBy (xpath="//div[@class='box']")WebElement mngPgm;
		
		
		By header= By.xpath("//div[@class='box']");
		By heading = By.className("box");
		//By program = By.xpath("//span[text() = 'Program']");
		By prog = By.linkText("/program");
		By paginatetxt = By.xpath("//span[contains(text(),'Showing x to y of z entries')]");
		By footertxt = By.xpath("//div[text()=' In total there are z programs. ']");
        By deleteIcon = By.cssSelector("//button[class='p-button-danger p-button p-component p-button-icon-only'] "
        		+ "span[class='p-button-icon pi pi-trash']");
		
		public String getHeader() throws InterruptedException {
			 //driver.wait();
			 return driver.findElement(header).getText();
		}
		
		public String getTitle() {
			 return driver.getTitle();
		}
		
		public void getMainPage() {
			
			driver.get(url);
		}
		public void doClick() throws InterruptedException {
			driver.wait();
			driver.findElement(prog).click();
			
		}
		public void isDisabled() {
			driver.findElement(deleteIcon).isDisplayed();
		}
		public String getText() throws InterruptedException {
			//driver.wait();
			return driver.findElement(paginatetxt).getText();
		}
		public String getFootertxt() throws InterruptedException {
			driver.wait();
			return driver.findElement(footertxt).getText();
		}
		public void refresh() {
			driver.navigate().refresh();
		}
		public String getHeader1() {
			String header1=driver.findElement(header).getText();
			return header1;
		}

}
