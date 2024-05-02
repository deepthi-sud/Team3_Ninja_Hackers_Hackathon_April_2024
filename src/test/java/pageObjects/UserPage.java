package pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import utilities.ConfigReader;
import utilities.DriverFactory;

public class UserPage extends LoginPage {

	WebDriver driver = DriverFactory.getdriver();
	String browser = ConfigReader.getBrowserType();

	Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(1))
			.pollingEvery(Duration.ofMillis(300)).ignoring(ElementNotInteractableException.class);

	// By userBtn =By.linkText("/user");
	// By header = By.xpath("//div[text()=' Manage User']");

	By header = By.xpath("//div[@class='box']");
	By heading = By.className("box");
	// By program = By.xpath("//span[text() = 'Program']");
	By user = By.xpath("//button[contains(@id, 'user')]");
	By paginatetxt = By.xpath("//span[contains(text(),'Showing x to y of z entries')]");
	By footertxt = By.xpath("//div[text()=' In total there are z programs. ']");
	By deleteIcon = By.xpath("//button[contains(@icon, 'pi pi-trash')]");
	By pagenum = By.xpath("//button[@class='p-paginator-next p-paginator-element p-link p-ripple']");
	//By addnewUser = By.xpath("//button[contains(@id, 'new')]");
	By assignStudent = By.xpath("//span[contains(text(),'Assign Student')]");
	By assignStaff = By.xpath("//button[contains(@label, 'Assign Staff')]");
	By searchInput = By.xpath("//input[contains(@id, 'filterGlobal')]");
	By editIcon = By.xpath("//button[contains(@icon, 'pi pi-pencil')]");
	By tableCounnt = By.xpath("//table/tbody/tr");
	By search = By.xpath("//input[@class='p-inputtext p-component']");
	By addnewuser = By.xpath("//span[contains(text(),'Add New User')]");
	By userdetailspage = By.xpath("//span[contains(text(),'User Details')]");
    
	public String getHeader() throws InterruptedException {
		// driver.wait();
		return driver.findElement(header).getText();
	}

	public void manageUser() {
		driver.findElement(heading).isDisplayed();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void getMainPage() {

//		driver.get(url);
	}

	public void doClick() throws InterruptedException {
		// driver.wait();
		Thread.sleep(10000);
		driver.findElement(user).click();

	}

	public void getCount() {
		Assert.assertEquals(driver.findElements(editIcon).size(), 5);
	}

	public void tablerowscount() {
		List<WebElement> rows = driver.findElements(tableCounnt);
		for (int i = 1; i <= rows.size(); i++) {
			driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[6]//button[1]")).isDisplayed();
			driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[6]//button[2]")).isDisplayed();
			driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[1]")).isDisplayed();
		}
	}

	public void isDisabled() {

		boolean a1 = driver.findElement(deleteIcon).isEnabled();
		System.out.print(a1);

	}

	public void isDisplayed() {
		driver.findElement(deleteIcon).isDisplayed();
		driver.findElement(addnewuser).isDisplayed();
		driver.findElement(assignStudent).isDisplayed();
		driver.findElement(assignStaff).isDisplayed();
		driver.findElement(searchInput).isDisplayed();

	}

	public String getText() throws InterruptedException {
		// driver.wait();
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
		String header1 = driver.findElement(header).getText();
		return header1;
	}

	public void pagination() {
		driver.findElement(pagenum).click();
	}

	public void searchInput(String searchString) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(search).sendKeys(searchString);
		Thread.sleep(3000);
	}

	public void validateInput(String validateString) throws InterruptedException {
		Thread.sleep(3000);
		String findResult = driver.findElement(By.xpath("//tbody/tr/td[3]")).getText();
		System.out.print("findResult::"+findResult);
		Assert.assertTrue(findResult.contains(validateString));
	}

	public void searchInvalidInput() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(searchInput).clear();
		driver.findElement(searchInput).sendKeys("tumri");
	}

	public void validateInvalidInput() throws InterruptedException {
		String searchString = "Showing 0 to 0 of 0 entries";
		Thread.sleep(3000);
		String findResult = driver.findElement(By.xpath("//span[contains(text(),'Showing 0 to 0 of 0 entries')]"))
				.getText();
		System.out.println("------@@@@@@@@@findResult@@@@@@@@------------------------->>>>>>>>>>>"+findResult);
		Assert.assertTrue(findResult.contains(searchString));
	}

	public void addNewUserIcon() throws InterruptedException {
		driver.findElement(addnewuser).click();
		driver.findElement(
				By.xpath("//body/app-root[1]/app-user[1]/div[1]/p-dialog[1]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();

	}

	public void userDetailsPage() throws InterruptedException {
		
		WebElement addNewUser = driver.findElement(addnewuser);
		Actions actions = new Actions(driver);
		actions.moveToElement(addNewUser).click().build().perform();
		String searchString = "User Details";
		String findResult = driver.findElement(By.xpath("//span[contains(text(),'User Details')]")).getText();
		Assert.assertEquals(searchString, findResult);
		// Assert.assertTrue(driver.getPageSource().contains("First name"));
		driver.findElement(
				By.xpath("//span[contains(text(),'Cancel')]"))
				.click();
		Thread.sleep(1000);
	}
	
	public void editUserDetailsPage() throws InterruptedException {
		WebElement editButton = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/span[1]/button[1]/span[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(editButton).click().build().perform();
		String searchString = "User Details";
		String findResult = driver.findElement(By.xpath("//span[contains(text(),'User Details')]")).getText();
		Assert.assertEquals(searchString, findResult);
		driver.findElement(
				By.xpath("//span[contains(text(),'Cancel')]"))
				.click();
	}

	public void userDetailsVerificationPage() throws InterruptedException {
		//Thread.sleep(3000);
		// Assert.assertTrue(driver.getPageSource().contains("Middle name"));
		WebElement addUser =  driver.findElement(addnewuser);
		Actions actions = new Actions(driver);
		actions.moveToElement(addUser).click().build().perform();
		//Thread.sleep(1000);
		Assert.assertTrue(driver.getPageSource().contains("First name"));
		Assert.assertTrue(driver.getPageSource().contains("Middle name"));
		Assert.assertTrue(driver.getPageSource().contains("Last name"));
		driver.findElement(
				By.xpath("//body/app-root[1]/app-user[1]/div[1]/p-dialog[1]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(1000);
	}

	public void userDetailsDropDownVerificationPage() throws InterruptedException {
		
		WebElement addNewUser = driver.findElement(addnewuser);
		Actions actions = new Actions(driver);
		actions.moveToElement(addNewUser).click().build().perform();
		
		Assert.assertTrue(driver.getPageSource().contains("User Role"));
		Assert.assertTrue(driver.getPageSource().contains("User Role Status"));
		Assert.assertTrue(driver.getPageSource().contains("User Visa Status"));
		driver.findElement(
				By.xpath("//body/app-root[1]/app-user[1]/div[1]/p-dialog[1]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();
	}

	public void openNewUserIcon() throws InterruptedException {
		
		WebElement openNewUserIcon = driver.findElement(addnewuser);
		Actions actions = new Actions(driver);
		actions.moveToElement(openNewUserIcon).click().build().perform();
	}

	public void fillNewUserFormSubmit(String firstName, String emailId, String linkedInURL, String phoneNum)
			throws InterruptedException {
		WebElement inputByDataPlaceholder = driver.findElement(By.cssSelector("input[data-placeholder='First name']"));
		inputByDataPlaceholder.sendKeys(firstName);
		driver.findElement(By.cssSelector("input[data-placeholder='Middle name']")).sendKeys("allenqqqs");
		driver.findElement(By.cssSelector("input[data-placeholder='Last name']")).sendKeys("ehqqqqas");
		driver.findElement(By.cssSelector("input[data-placeholder='Location']")).sendKeys("ohiowwww");
		driver.findElement(By.cssSelector("input[data-placeholder='Phone no']")).sendKeys(phoneNum);
		driver.findElement(By.cssSelector("input[data-placeholder='LinkedIn Url']")).sendKeys(linkedInURL);
		driver.findElement(By.cssSelector("input[data-placeholder='Email address']")).sendKeys(emailId);
		driver.findElement(By.cssSelector("input[data-placeholder='Under Graduate']")).sendKeys("BCA");
		driver.findElement(By.cssSelector("input[data-placeholder='Post Graduate']")).sendKeys("MCA");
		driver.findElement(By.cssSelector("input[data-placeholder='Time Zone']")).sendKeys("EST");
		driver.findElement(By.cssSelector("input[data-placeholder='User Comments']")).sendKeys("not applicable");

		WebElement listBox = driver.findElement(By.xpath("//span[contains(text(),'Select Role')]"));

		listBox.click();

		WebElement itemToSelect = driver.findElement(By.xpath("//span[contains(text(),'R03')]"));
		itemToSelect.click();

		WebElement listBox2 = driver.findElement(By.xpath("//span[contains(text(),'Select Role Status')]"));

		listBox2.click();

		WebElement itemToSelect2 = driver.findElement(By.xpath("//span[contains(text(),'Active')]"));
		itemToSelect2.click();

		WebElement listBox3 = driver.findElement(By.xpath("//span[contains(text(),'Select Visa Status')]"));
		listBox3.click();

		WebElement itemToSelect3 = driver.findElement(By.xpath("//span[contains(text(),'H4-EAD')]"));
		itemToSelect3.click();


		WebElement submitButton = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
		submitButton.click();
	}

	public void showSuccessMsg() throws InterruptedException {
		System.out.print("user created done");

	}

	public void skipMandatoryUserFormSubmit() throws InterruptedException {
		WebElement inputByDataPlaceholder = driver.findElement(By.cssSelector("input[data-placeholder='First name']"));
		inputByDataPlaceholder.sendKeys("skip");
		
		WebElement submitButton = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
		submitButton.click();
		
		WebElement crossButton = driver.findElement(By.xpath("//body/app-root[1]/app-user[1]/div[1]/p-dialog[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
		crossButton.click();
	}

	public void showErrorMsg() throws InterruptedException {
		System.out.print("user created done");

	}

	public void clickCrossButton() throws InterruptedException {
		WebElement crossButton = driver.findElement(By.xpath("//div[@class='p-dialog-header-icons ng-tns-c132-6']"));
		crossButton.click();
	}

	public void clickCancelButton() throws InterruptedException {
		WebElement crossButton = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
		crossButton.click();
	}

	public void fillInvalidData() throws InterruptedException {
		WebElement inputByDataPlaceholder = driver.findElement(By.cssSelector("input[data-placeholder='First name']"));
		inputByDataPlaceholder.sendKeys("123");
		driver.findElement(By.cssSelector("input[data-placeholder='Middle name']")).sendKeys("3545");
		driver.findElement(By.cssSelector("input[data-placeholder='Last name']")).sendKeys("f4665");
		driver.findElement(By.cssSelector("input[data-placeholder='Location']")).sendKeys("33545");
		driver.findElement(By.cssSelector("input[data-placeholder='Phone no']")).sendKeys("75a9841256");
		driver.findElement(By.cssSelector("input[data-placeholder='LinkedIn Url']"))
				.sendKeys("https://www.link.com/in/steve-creams-835641/");
		driver.findElement(By.cssSelector("input[data-placeholder='Email address']")).sendKeys("steve#.kbp@gmail.com");
		driver.findElement(By.cssSelector("input[data-placeholder='Under Graduate']")).sendKeys("233");
		driver.findElement(By.cssSelector("input[data-placeholder='Post Graduate']")).sendKeys("343");
		driver.findElement(By.cssSelector("input[data-placeholder='Time Zone']")).sendKeys("EST");
		driver.findElement(By.cssSelector("input[data-placeholder='User Comments']")).sendKeys("not applicable");

		WebElement listBox = driver.findElement(By.xpath("//span[contains(text(),'Select Role')]"));
		listBox.click();

		WebElement itemToSelect = driver.findElement(By.xpath("//span[contains(text(),'R03')]"));
		itemToSelect.click();

		WebElement listBox2 = driver.findElement(By.xpath("//span[contains(text(),'Select Role Status')]"));
		listBox2.click();

		WebElement itemToSelect2 = driver.findElement(By.xpath("//span[contains(text(),'Active')]"));
		itemToSelect2.click();

		WebElement listBox3 = driver.findElement(By.xpath("//span[contains(text(),'Select Visa Status')]"));
		listBox3.click();

		WebElement itemToSelect3 = driver.findElement(By.xpath("//span[contains(text(),'H4-EAD')]"));
		itemToSelect3.click();

		WebElement submitButton = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
		submitButton.click();
	}

	public void submitWithEmptyData() throws InterruptedException {

		WebElement submitButton = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
		submitButton.click();
		WebElement crossButton = driver.findElement(By.xpath("//div[@class='p-dialog-header-icons ng-tns-c132-6']"));
		crossButton.click();
	}

	public String generateFirstName() {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;
		Random random = new Random();

		String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		return generatedString;
	}

	public String generateEmail() {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 5;
		Random random = new Random();

		String lastName = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		String firstName = generateFirstName();
		String email = firstName + "." + lastName + "@gmail.com";
		return email;
	}

	public String generateLinkedin() {
		String firstName = generateFirstName();
		String email = "https://www.linkedin.com/in/" + firstName + "-creams-835641/";
		return email;
	}

	public String generatePhoneNumber() {
		String number = String.valueOf((long) (Math.random() * 100000 + 3333300000L));
		return number;
	}
	
	public void editIcon() {
		driver.findElement(editIcon).click();
	}

	public void fillUserInfoForEdit() throws InterruptedException {
		Thread.sleep(3000);
		WebElement editButton = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/span[1]/button[1]/span[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(editButton).click().build().perform();
		driver.findElement(By.cssSelector("input[data-placeholder='Middle name']")).sendKeys("allenqqqs");
		driver.findElement(By.cssSelector("input[data-placeholder='Email address']")).sendKeys("mary.mary@gmail.com");
		driver.findElement(By.cssSelector("input[data-placeholder='User Comments']")).sendKeys("not applicable");
		WebElement submitButton = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
		submitButton.click();
	}

	public void fillInvalidUserInfoForEdit() throws InterruptedException {
		Thread.sleep(3000);
		WebElement editButton = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/span[1]/button[1]/span[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(editButton).click().build().perform();
		driver.findElement(By.cssSelector("input[data-placeholder='Middle name']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[data-placeholder='Phone no']")).sendKeys("abcdefgh");
		driver.findElement(By.cssSelector("input[data-placeholder='LinkedIn Url']"))
		.sendKeys("https://www.link.com/in/steve-creams-835641/");
		WebElement submitButton = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
		submitButton.click();
		
	}

	public void fillMandatoryUserInfoForEdit() throws InterruptedException {
		Thread.sleep(3000);
		WebElement editButton = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/span[1]/button[1]/span[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(editButton).click().build().perform();
		driver.findElement(By.cssSelector("input[data-placeholder='First name']")).clear();
		driver.findElement(By.cssSelector("input[data-placeholder='First name']")).sendKeys("testAMandat");
		driver.findElement(By.cssSelector("input[data-placeholder='Middle name']")).sendKeys("allenqqqs");
		driver.findElement(By.cssSelector("input[data-placeholder='Email address']")).sendKeys("mary.mary@gmail.com");
		driver.findElement(By.cssSelector("input[data-placeholder='User Comments']")).sendKeys("not applicable");
		WebElement submitButton = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
		submitButton.click();
	}

	public void fillOptionalUserInfoForEdit() throws InterruptedException {
		Thread.sleep(3000);
		WebElement editButton = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/span[1]/button[1]/span[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(editButton).click().build().perform();
		driver.findElement(By.cssSelector("input[data-placeholder='First name']")).clear();
		driver.findElement(By.cssSelector("input[data-placeholder='First name']")).sendKeys("testAOptional");
		driver.findElement(By.cssSelector("input[data-placeholder='Middle name']")).sendKeys("allenqqqs");
		driver.findElement(By.cssSelector("input[data-placeholder='Email address']")).sendKeys("dominos.mary@gmail.com");
		driver.findElement(By.cssSelector("input[data-placeholder='User Comments']")).sendKeys("not applicable");
		WebElement submitButton = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
		submitButton.click();
		
	}

	public void fillNumbersNSpecialUserInfoForEdit() throws InterruptedException {
		Thread.sleep(3000);
		WebElement editButton = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/span[1]/button[1]/span[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(editButton).click().build().perform();
		driver.findElement(By.cssSelector("input[data-placeholder='First name']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[data-placeholder='Middle name']")).sendKeys("56777");
		driver.findElement(By.cssSelector("input[data-placeholder='Last name']")).sendKeys("9999@@@@");
		driver.findElement(By.cssSelector("input[data-placeholder='Email address']")).sendKeys("dominos.mary@gmail.com");
		driver.findElement(By.cssSelector("input[data-placeholder='User Comments']")).sendKeys("not applicable");
		WebElement submitButton = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
		submitButton.click();
		
	}

	public void clickCancelButtonOnEdit() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		WebElement editButton = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/span[1]/button[1]/span[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(editButton).click().build().perform();
		driver.findElement(
				By.xpath("//span[contains(text(),'Cancel')]"))
				.click();
	}
}
