package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;

import utilities.DriverFactory;

public class ManageProgramDelete {
	public static WebDriver driver = DriverFactory.getdriver();

	By deleteButton = By.xpath("//button[@id='deleteProgram']");
	By confirmWindow = By.xpath("//div[contains(@class,'p-confirm-dialog')]");
	By noButton = By
			.xpath("//div[contains(@class,'p-dialog-footer')]/button[contains(@class,'p-confirm-dialog-reject')]");
	By yesButton = By
			.xpath("//div[contains(@class,'p-dialog-footer')]/button[contains(@class,'p-confirm-dialog-accept')]");
	By closeButton = By.xpath(
			"//button[@class='ng-tns-c133-70 p-dialog-header-icon p-dialog-header-close p-link ng-star-inserted']");
	private Boolean finalResult;
	By dialogueMessage = By
			.xpath("//div[contains(@class,'p-dialog-content')]//span[contains(@class,'p-confirm-dialog-message')]");
	//By toastSummary = By.xpath("//div[contains(@class, 'p-toast-summary')]") ;
	//By toastDetail  = By.xpath("//div[contains(@class, 'p-toast-Detail')]") ;
	By toastSummary = By.className("p-toast-summary");
	By toastDetail  = By.className("'p-toast-Detail");
	String alert;

	public void clickDeleteButton() {
		driver.findElement(deleteButton).click();
	}

	public Boolean checkAlert() {

		Boolean finalResult = false;
		Boolean result = driver.findElement(confirmWindow).isDisplayed();
		Boolean result1 = driver.findElement(noButton).isDisplayed();
		Boolean result2 = driver.findElement(yesButton).isDisplayed();
		System.out.println("Result : " + result + "Result 1 : " + result1 + " Result2 : " + result2);
		if (result && result1 && result2) {
			finalResult = true;
		}

		return finalResult;
	}

	// deleting-02

	public String checkMessage() {

		String message = driver.findElement(dialogueMessage).getText();
		System.out.println(message);
		return message;
	}

	// deleting-03
	public Boolean isInConfirmWindow() {
		Boolean result;
		result = driver.findElement(confirmWindow).isDisplayed();
		return result;
	}

	public void clickYesButton() {
		driver.findElement(yesButton).click();
	}

	public String checkAlertMessage() {
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		WebElement td = driver.findElement(toastDetail);
		WebElement ts = driver.findElement(toastSummary);
		
		String alertMessage = ts.getText() + " " + td.getText();
		
		return alertMessage;

	}

}
