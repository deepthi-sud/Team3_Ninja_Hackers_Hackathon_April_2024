package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.DriverFactory;

public class ManageProgramDelete {
	public static WebDriver driver = DriverFactory.getdriver();

	By deleteButton = By.xpath("//button[@id='deleteProgram']");
	By confirmWindow = By.xpath("//p-confirmdialog//div[contains(@class,'p-dialog-content')]");
	By noButton = By
			.xpath("//div[contains(@class,'p-dialog-footer')]/button[contains(@class,'p-confirm-dialog-reject')]");
	By yesButton = By
			.xpath("//div[contains(@class,'p-dialog-footer')]/button[contains(@class,'p-confirm-dialog-accept')]");

	By dialogueMessage = By
			.xpath("//div[contains(@class,'p-dialog-content')]//span[contains(@class,'p-confirm-dialog-message')]");
	By toastSummary = By.xpath("//div[contains(@class, 'p-toast-summary')]");
	By toastDetail = By.xpath("//div[contains(@class, 'p-toast-detail')]");

	String alert;
	By totalRecords = By.xpath("//div[@class='p-datatable-footer ng-star-inserted']");
	By closeButton = By.xpath("//button[contains(@class, 'p-dialog-header-close')]");

	By checkBox = By.xpath("//p-table[@datakey='programId']//tbody/tr/td[1]//div[@role='checkbox']");
	By checkBox1 = By.xpath("//p-table[@datakey='programId']//tbody/tr[2]/td[1]//div[@role='checkbox']");
	By multipleDeleteButton = By
			.xpath("//div[@class='box']//button[@class='p-button-danger p-button p-component p-button-icon-only']");
	By firstRowRecord = By.xpath("//tbody[@class='p-datatable-tbody']/tr/td[2]");
	By secondRowRecord = By.xpath("//tbody[@class='p-datatable-tbody']/tr[2]/td[2]");

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
		Boolean result = false;

		result = driver.findElements(confirmWindow).size() > 0;

		System.out.println("Is in confirm window : " + result);
		return result;
	}

	public void clickYesButton() {
		driver.findElement(yesButton).click();
	}

	public String checkToastMessage() {

		System.out.println("waiting for toast to appear...");
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(500));
		WebElement td = wait.until(ExpectedConditions.presenceOfElementLocated(toastDetail));

		WebElement ts = driver.findElement(toastSummary);

		String alertMessage = ts.getText() + " " + td.getText();

		System.out.println("Toast message..." + alertMessage);

		return alertMessage;

	}

	// deleting-04
	public void clickNoButton() {
		driver.findElement(noButton).click();
	}

	public String checkTotalRecords() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String text = driver.findElement(totalRecords).getText();
		return text;
	}

	// deleting-05
	public void clickCloseButton() {
		driver.findElement(closeButton).click();

	}

	// multipledeletion-06
	public void checkCheckBox() {
		driver.findElement(checkBox).click();
	}

	public boolean deleteButtonIsVisible() {
		boolean result = driver.findElement(multipleDeleteButton).isDisplayed();
		return result;
	}

	// multipledeletion-07
	public String getDeleteRecordText() {
		String message = driver.findElement(firstRowRecord).getText();
		return message;

	}

	public Boolean isNotInConfirmWindow() {

		try {
			driver.switchTo().alert();
			return false;
		} // try
		catch (NoAlertPresentException Ex) {
			return true;
		}

	}

	// multipledeletion-07
	public void clickCheckBox2() {
		driver.findElement(checkBox1);
	}

	public String getDeleteSecondRecordText() {
		String message = driver.findElement(secondRowRecord).getText();
		return message;

	}

	public void clickMultipleDeleteRecordButton() {
		driver.findElement(multipleDeleteButton).click();
	}

	public void clickMultipleCheckBox() {
		driver.findElement(checkBox).click();
		driver.findElement(checkBox1).click();
	}

}
