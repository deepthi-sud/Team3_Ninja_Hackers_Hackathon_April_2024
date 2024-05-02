package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;
import utilities.DriverFactory;

public class UserSort {
	public static WebDriver driver = DriverFactory.getdriver();
	By userButton                  = By.xpath("//button[@id='user']");
	By defaultUserIDSortIcon       = By.xpath("//p-sorticon[@field='userId']/i[contains(@class,'p-sortable-column-icon')]");
	By defaultUserNameSortIcon     = By.xpath("//p-sorticon[@field='userFirstName']/i[contains(@class,'p-sortable-column-icon')]");
	By defaultUserLocationSortIcon = By.xpath("//p-sorticon[@field='userLocation']/i[contains(@class,'p-sortable-column-icon')]");
	By defultUserPhoneNoSortIcon   = By.xpath("//p-sorticon[@field='userPhoneNumber']/i[contains(@class,'p-sortable-column-icon')]");

	String defaultIDSortClass    = "pi-sort-alt";
	String ascendingIDSortClass  = "pi-sort-amount-up-alt";
	String descendingIDSortClass = "pi-sort-amount-down";

	public void clickuserButton() {
		driver.findElement(userButton).click();
	}

	public void clickUserIdSortIcon() {
		driver.findElement(defaultUserIDSortIcon).click();
	}

	public Boolean checkUserIdInAscending() {

		WebElement sort = driver.findElement(defaultUserIDSortIcon);
		Boolean result = hasClass(sort, ascendingIDSortClass);
		System.out.println("has Ascending class : " + result);
		return result;
	}

	public Boolean checkUserIdInDescending() {

		WebElement sort = driver.findElement(defaultUserIDSortIcon);
		Boolean result = hasClass(sort, descendingIDSortClass);
		System.out.println("has Ascending class : " + result);
		return result;
	}

	public boolean hasClass(WebElement element, String searchClass) {
		String classes = element.getAttribute("class");
		System.out.println("Classes available : " + classes);
		for (String c : classes.split(" ")) {
			if (c.equals(searchClass)) {
				return true;
			}
		}

		return false;
	}

	// sort-02
	public void clickNameSortIcon() {
		driver.findElement(defaultUserNameSortIcon).click();
	}

	public Boolean checkUserNameInAscending() {

		WebElement sort = driver.findElement(defaultUserNameSortIcon);
		Boolean result = hasClass(sort, ascendingIDSortClass);
		System.out.println("has Ascending class : " + result);
		return result;
	}

//sort-03
	public void clickUserLocationSortIcon() {
		driver.findElement(defaultUserLocationSortIcon).click();
	}

	public Boolean checkUserLocationInAscending() {

		WebElement sort = driver.findElement(defaultUserLocationSortIcon);
		Boolean result = hasClass(sort, ascendingIDSortClass);
		System.out.println("has Ascending class : " + result);
		return result;
	}

	// sort-04
	public void clickUserPhoneNoSortIcon() {
		driver.findElement(defultUserPhoneNoSortIcon).click();
	}

	public Boolean checkUserPhoneNoInAscending() {

		WebElement sort = driver.findElement(defultUserPhoneNoSortIcon);
		Boolean result = hasClass(sort, ascendingIDSortClass);
		System.out.println("has Ascending class : " + result);
		return result;
	}

}
