package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.DriverFactory;

public class ManageProgramPageValidation {
	public static WebDriver driver = DriverFactory.getdriver();
	By batchButton = By.xpath("//button[@id='batch']");
	By batchPageTitle = By.xpath("//div[@class='box']");
	By userButton = By.xpath("//button[@id='user']");
	By userPageTitle = By.xpath("//div[@class='box']");
	By logOutButton = By.xpath(("//button[@id='logout']"));
	By loginButton = By.xpath("//button[@id='login']");
	By nextPageButton = By.xpath("//button[@class='p-paginator-next p-paginator-element p-link p-ripple']");
	By nextPageDisabledButton = By.xpath("//button[@class='p-paginator-next p-paginator-element p-link p-ripple p-disabled']");
	By lastPageButton = By.xpath("//button[@class='p-paginator-last p-paginator-element p-link p-ripple ng-star-inserted']");
	By firstPageButton = By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button");
	By secondPageButton = By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button[2]");
	By previousDisableButton = By.xpath("//button[@class='p-paginator-first p-paginator-element p-link p-ripple ng-star-inserted p-disabled']");

	public void clickBatchLink()
	{
		driver.findElement(batchButton).click();
	}
	
	public String isInBatchPage()
	{
	
		String title = driver.findElement(batchPageTitle).getText();
		return title;
	}
	//pagevalidation-02
	public void clickUserLink()
	{
	    driver.findElement(userButton).click();
	}
	public String isInUserpage()
	{ 
	   String title = driver.findElement(userPageTitle).getText();
	   return title;
	}
	public void clickLogoutLink()
	{
		driver.findElement(logOutButton).click();;
	}
	public Boolean isInLogInPage()
	{
		 Boolean result = false;
		if( driver.findElement(loginButton).isDisplayed())
			result =  true;
		return result;
		
		
	}
	
	
	//paginator-04
	
	public void clickNextButton()
	{
		driver.findElement(nextPageButton).click();
		
	}
	public  boolean isNextButtonActive()
	{
		boolean result = false;
		String message = driver.findElement(nextPageButton).getText();
		System.out.println(message);
		if ( message != "disabled")
		{
			result = true;
		}
		return result;
	}

	//paginator-05
	public void clickLastPageButton()
	{
		driver.findElement(lastPageButton).click();
	}
    public Boolean  isNextPageButtonDisabled()
    {
    	boolean result = false;
		WebElement element = driver.findElement(nextPageDisabledButton);
		
		if ( element != null )
		{
			result = true;
		}
		return result;
	}
    
    //paginator-06
    
    public void clickFirstPageButton()
    {
    	driver.findElement(firstPageButton).click();
    }
    public boolean isEnableNextPageButton()
    {
    	boolean result = driver.findElement(nextPageButton).isDisplayed();
		return result;
    	
    }
    public void isOnLastPage()
    {
    	
		driver.findElement(lastPageButton).click();
    	
    }
    
   // paginator-07
    
    public void isOnSecondPageLink()
    {
    	driver.findElement(secondPageButton).click();
    }
    public Boolean  isPreviousPageButtonDisabled()
    {
    	boolean result = false;
		WebElement element = driver.findElement(previousDisableButton);
		
		if ( element != null )
		{
			result = true;
		}
		return result;
	}
    
    
    }


