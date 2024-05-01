package pageObjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.ConfigReader;
import utilities.DriverFactory;
import utilities.ExcelReader;

public class LoginPage {

	
	    public  static WebDriver driver=DriverFactory.getdriver();
//		String lmsUrl=ConfigReader.getUrl();
	    By username=By.id("username");
		By password=By.id("password");
		By loginBtn=By.xpath("//button[@type='submit']");
		By logoutLink = By.xpath("//span[text()='Logout']");
		
		String lmsUrl=ConfigReader.getUrl();
		String lmsInvalidUrl=ConfigReader.getInvalidUrl();
		
		@FindBy (id="username") 
		static WebElement user;
		@FindBy (id="password")
		static WebElement pass;
		@FindBy (xpath="//button[@type='submit']")
		WebElement login;
		
		@FindBy (xpath="//*[@class='ng-untouched ng-pristine ng-invalid']/p") 
		static WebElement loginLMSApplication;
		@FindBy (xpath="//*[@for='username']")
		static WebElement loginLMSApplicationUserNameText;
		@FindBy (xpath="//*[@for='password']")
		static WebElement loginLMSApplicationPasswordText;
		@FindBy (xpath="//*[@src='assets/img/LMS-logo.jpg']")
		static WebElement logo;
		@FindBy (xpath="//*[@class='ng-untouched ng-pristine ng-invalid']//input")
		static List<WebElement> textBoxes;
		@FindBy (xpath="//*[@formcontrolname='userLoginEmailId']/../span/label")
		static WebElement loginUserLabelInput;
		@FindBy (xpath="//*[@formcontrolname='password']/../span/label")
		static WebElement loginPasswordLabelInput;
		@FindBy (xpath="//*[@class='mat-card-content']")
		static WebElement loginForm;
		@FindBy (id="errormessage")
		static WebElement errorInvalidCredentials;
		
		
		public void getLoginPage() {
			driver.get(Constants.URL);
		}
		
		public String getTitle() {
			 return driver.getTitle();
		}
	
		
		public Boolean verifyLogin() {
			WebElement logout = driver.findElement(logoutLink);
			Boolean result = false;
			if (logoutLink != null) {
				result = true;
			}
			return result;
		}


		
	
		
		
		
		
		public LoginPage() {

			PageFactory.initElements(driver, this);
		}

		
		public void getInvalidLoginPage() {
			driver.get(lmsInvalidUrl);
		}
		
	

		public void setLogin() throws InvalidFormatException, IOException  {
			
		
			 List<Map<String, String>> excelRows=ExcelReader.getData(ConfigReader.getExcelFilepPath(),"login");
			 String	uname=excelRows.get(0).get("validUserName");
			 String pwd=excelRows.get(0).get("validPassword");
			 user.sendKeys(uname);
			pass.sendKeys(pwd);
		}
		public void setInvalidLogin() throws InvalidFormatException, IOException  {
			 List<Map<String, String>> excelRows=ExcelReader.getData(ConfigReader.getExcelFilepPath(),"login");
			 String	uname=excelRows.get(0).get("invalidUsername");
			 String pwd=excelRows.get(0).get("invalidPassword");
			 	
			 user.sendKeys(uname);
			pass.sendKeys(pwd);
		}
		public void setUserNameNoPassword() throws InvalidFormatException, IOException  {
			List<Map<String, String>> excelRows=ExcelReader.getData(ConfigReader.getExcelFilepPath(),"login");
			String	uname=excelRows.get(0).get("validUserName");
			user.sendKeys(uname);
		}
		public void setPasswordNoUserName() throws InvalidFormatException, IOException  {
			
			 List<Map<String, String>> excelRows=ExcelReader.getData(ConfigReader.getExcelFilepPath(),"login");
			 String pwd=excelRows.get(0).get("validPassword");
			 pass.sendKeys(pwd);
		}
		public void clickLoginBtn() {
			login.click();

		}
		public void keyboardClickLoginBtn() {
			login.sendKeys(Keys.ENTER);
		}
		public void mouseClickLoginBtn() {
			Actions action = new Actions(driver);
			action.sendKeys(login).build().perform();
		}
		public String getTextLoginToapp() {
			return loginLMSApplication.getText();
		}
		public String getTextUserName() {
			return loginLMSApplicationUserNameText.getText();
		}
		public String getTextPassword() {
			return loginLMSApplicationPasswordText.getText();
		}
		public String getLabelUserName() {
			return loginLMSApplicationUserNameText.getText();
		}
		public String getLabelUserNameAstrick() {
			return loginLMSApplicationPasswordText.getText();
		}
		public void verifyLogoLocation() {
			assertEquals(logo.getLocation().getX(), 170);
			assertEquals(logo.getLocation().getY(), 60);
			System.out.println("Logo Location is verified Successfully");
		}
		public void verifyLogo() {
			assertEquals(logo.isDisplayed(), true);
			System.out.println("Logo with LMS - Learning Management System is verified Successfully"+"\n");
			System.out.println("Logo with Company Name - Numpy Ninja is verified Successfully");
			
		}
		public void verifyTwoInputBox() {
			
			assertEquals(textBoxes.size(), 2);
			System.out.println("Text Boxes are verified as "+textBoxes.size());
				
		}
		
		public String verifyUserLabelTextbox() {
			String user=loginUserLabelInput.getText().split(" ")[0];
			return user;
		}
		public String verifyUserLabelAstrikTextbox() {
			String userAstrik=loginUserLabelInput.getText().split(" ")[1];
			return userAstrik;
		}
		public String verifyPasswordLabelTextbox() {
			String user=loginPasswordLabelInput.getText().split(" ")[0];
			return user;
		}
		public String verifyPasswordLabelAstrikTextbox() {
			String userAstrik=loginPasswordLabelInput.getText().split(" ")[1];
			return userAstrik;
		}
		public void verifyLoginFormLocation() {
			assertEquals(loginForm.getLocation().getX(), 560);
			assertEquals(loginForm.getLocation().getY(), 354);
			System.out.println("Login Form Location is verified as Centre of the page Successfully");
		}
		public Boolean loginButtonDisplayed() {
			Boolean value= login.isDisplayed();
			return value;
		}
		public void verifyLoginButtonLocation() {
			assertEquals(login.getLocation().getX(), 700);
			assertEquals(login.getLocation().getY(), 499);
			System.out.println("Login Button Location is verified as Centre of the page Successfully");
		}
		
		public void verifyUserNameTextColorAsGray() {
			String textColor = loginLMSApplicationUserNameText.getCssValue("background-color");
		
			assertEquals(textColor, "rgba(0, 0, 0, 0)");
			System.out.println("User Name Label color has been verified as Gray Successfully");
		}
		public void verifyPasswordTextColorAsGray() {
			String textColor = loginLMSApplicationPasswordText.getCssValue("background-color");
		
			assertEquals(textColor, "rgba(0, 0, 0, 0)");
			System.out.println("Password Label color has been verified as Gray Successfully");
		}
		public void verifyInvalidUsernameAndPasswordError() {
			String invalidUsernameAndPasswordError = errorInvalidCredentials.getText();
		
			assertEquals(invalidUsernameAndPasswordError, "Invalid username and password Please try again");
			System.out.println("Invalid Username and Password Error verified Sucessfully as "+invalidUsernameAndPasswordError);
		}
		public void verifyUserNameColorAsRed() {
			String textColor = loginLMSApplicationUserNameText.getCssValue("background-color");
		
			assertEquals(textColor, "rgba(0, 0, 0, 0)");
			System.out.println("Password Label color has been verified as Red Successfully");
		}
		
		public void verifyPasswordColorAsRed() {
			String textColor = loginLMSApplicationPasswordText.getCssValue("background-color");
		
			assertEquals(textColor, "rgba(0, 0, 0, 0)");
			System.out.println("Password Label color has been verified as Red Successfully");
		}
		

		
}
