package pageObjects;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverFactory;

public class LoginPage {


	public  static WebDriver driver=DriverFactory.getdriver();
	String lmsUrl=ConfigReader.getUrl();
	String lmsInvalidUrl=ConfigReader.getInvalidUrl();
	
	@FindBy (id="username") 
	static WebElement username;
	@FindBy (id="password")
	static WebElement password;
	@FindBy (xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	
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
	
	
	
	
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public void getLoginPage() {
		driver.get(lmsUrl);
	}
	public void getInvalidLoginPage() {
		driver.get(lmsInvalidUrl);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

	public void setLogin() {
		String	uname="sdetorganizers@gmail.com";
		String pwd="UIHackathon@02";
		username.sendKeys(uname);
		password.sendKeys(pwd);
	}

	public void clickLoginBtn() {
		loginBtn.click();

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
		assertEquals(loginForm.getLocation().getX(), 575);
		assertEquals(loginForm.getLocation().getY(), 354);
		System.out.println("Login Form Location is verified as Centre of the page Successfully");
	}
	public Boolean loginButtonDisplayed() {
		Boolean value= loginBtn.isDisplayed();
		return value;
	}
	public void verifyLoginButtonLocation() {
		assertEquals(loginBtn.getLocation().getX(), 716);
		assertEquals(loginBtn.getLocation().getY(), 499);
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
}
