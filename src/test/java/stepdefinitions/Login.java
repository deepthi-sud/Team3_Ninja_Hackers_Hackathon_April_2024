package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utilities.LoggerLoad;

public class Login {

	LoginPage login=new LoginPage();

	@Given("Admin launch the browser")
	public void admin_launch_the_browser() {


	}

	@When("Admin gives the correct LMS portal URL")
	public void admin_gives_the_correct_lms_portal_url() {
		login.getLoginPage();
	}


@When("Admin gives the invalid LMS portal URL")
public void admin_gives_the_invalid_lms_portal_url() {
	login.getInvalidLoginPage();
}
@Then("Admin should recieve {int} page not found error")
public void admin_should_recieve_page_not_found_error(int error) {
	String homePageTitle=login.getTitle();
	 System.out.print(homePageTitle+"\n");
	 assertEquals("Heroku | Application Error", homePageTitle);
}
@When("Admin enter valid credentials and clicks login button")
public void admin_enter_valid_credentials_and_clicks_login_button() throws InvalidFormatException, IOException {
	login.setLogin();
	login.clickLoginBtn();
}

	@Then("Admin should land on the home page")
	public void admin_should_land_on_the_home_page() {
		String title=login.getTitle();
		System.out.println("Title "+title);
	}

	@Given("Admin is in Home Page")
	public void admin_is_in_home_page() {
		login.getLoginPage();
		LoggerLoad.info("Admin is expected to be on Home page");
		String title=login.getTitle();
		assertEquals(title,"LMS","Admin is not on home page");
	}
	
	@When("Admin enter Invalid credentials and clicks login button")
	public void admin_enter_invalid_credentials_and_clicks_login_button() throws InvalidFormatException, IOException {
		login.setInvalidLogin();
		login.clickLoginBtn();
	}
	@When("Admin enter value only in password and clicks login button")
	public void admin_enter_value_only_in_password_and_clicks_login_button() throws InvalidFormatException, IOException {
		login.setPasswordNoUserName();
		login.clickLoginBtn();
	}
	@When("Admin enter value only in username and clicks login button")
	public void admin_enter_value_only_in_username_and_clicks_login_button() throws InvalidFormatException, IOException {
		login.setUserNameNoPassword();
		login.clickLoginBtn();
	}
	@Then("Admin should land on dashboard page")
	public void admin_should_land_on_dashboard_page() {
		String title=login.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}
	
	@Then("Admin should see correct spellings in all fields")
	public void admin_should_see_correct_spellings_in_all_fields() {
	   
		 String loginLMSApplication=login.getTextLoginToapp();
		 System.out.print(loginLMSApplication+"\n");
		 assertEquals("Please login to LMS application", loginLMSApplication);
		   
		 String userNameText=login.getTextUserName();
		 System.out.print(userNameText+"\n");
		 assertEquals("User *", userNameText);
		   
		 String passwordText=login.getTextPassword();
		 System.out.print(passwordText+"\n");
		 assertEquals("Password *", passwordText);
	}
	@Then("Admin should see logo on the left side")
	public void admin_should_see_logo_on_the_left_side() {
		login.verifyLoginFormLocation();
	}
	@Then("Admin should see LMS Learning Management System")
	public void admin_should_see_lms_learning_management_system() {
	 login.verifyLogo();
	}
	@Then("Admin should see company name below the app name")
	public void admin_should_see_company_name_below_the_app_name() {
		 login.verifyLogo();
	}
	@Then("Admin should see Please login to LMS application")
	public void admin_should_see_please_login_to_lms_application() {
		 String loginLMSApplication=login.getTextLoginToapp();
		 System.out.print(loginLMSApplication+"\n");
		 assertEquals("Please login to LMS application", loginLMSApplication);
	}
	@Then("Admin should see two text field")
	public void admin_should_see_two_text_field() {
	  login.verifyTwoInputBox();
	}
	@Then("Admin should {string} in the first text field")
	public void admin_should_in_the_first_text_field(String user) {
		 String userNameText=login.verifyUserLabelTextbox();
		 System.out.print(userNameText+"\n");
		 assertEquals(user, userNameText);
	}
	@Then("Admin should see {string} symbol next to user text")
	public void admin_should_see_symbol_next_to_user_text(String astrik) {
		 String userNameAstrikText=login.verifyUserLabelAstrikTextbox();
		 System.out.print(userNameAstrikText+"\n");
		 assertEquals(userNameAstrikText, astrik);
	}
	@Then("Admin should {string} in the second text field")
	public void admin_should_in_the_second_text_field(String user) {
		 String passwordText=login.verifyPasswordLabelTextbox();
		 System.out.print(passwordText+"\n");
		 assertEquals(user, passwordText);
	}
	@Then("Admin should see {string} symbol next to password text")
	public void admin_should_see_symbol_next_to_password_text(String astrik) {
		 String passwordAstrikText=login.verifyPasswordLabelAstrikTextbox();
		 System.out.print(passwordAstrikText+"\n");
		 assertEquals(passwordAstrikText, astrik);
	}
	@Then("Admin should see input field on the centre of the page")
	public void admin_should_see_input_field_on_the_centre_of_the_page() {
	  login.verifyLoginFormLocation();
	}
	@Then("Admin should see login button")
	public void admin_should_see_login_button() {
	assertEquals(login.loginButtonDisplayed(), true);
	System.out.print("Login Button is displayed as expected");
	}
	@Then("Verify the alignment of the login button")
	public void verify_the_alignment_of_the_login_button() {
		login.verifyLoginButtonLocation();
	}
	@Then("Admin should see user in gray color")
	public void admin_should_see_user_in_gray_color() {
	  login.verifyUserNameTextColorAsGray();		
	}
	@Then("Admin should see password in gray color")
	public void admin_should_see_password_in_gray_color() {
		  login.verifyPasswordTextColorAsGray();
	}
	@Then("Error message please check username or password")
	public void error_message_please_check_username_or_password() {
	  login.verifyInvalidUsernameAndPasswordError();
	}
	@Then("Error message please check username")
	public void error_message_please_check_username() {
	  login.verifyUserNameColorAsRed();
	}
	@Then("Error message please check password")
	public void error_message_please_check_password() {
	  login.verifyPasswordColorAsRed();
	}
	@When("Admin enter valid credentials and clicks login button through keyboard")
	public void admin_enter_valid_credentials_and_clicks_login_button_through_keyboard() throws InvalidFormatException, IOException {
		login.setLogin();
		login.keyboardClickLoginBtn();
	}
	@When("Admin enter valid credentials and clicks login button through Mouse Click")
	public void admin_enter_valid_credentials_and_clicks_login_button_through_mouse_click() throws InvalidFormatException, IOException  {
		login.setLogin();
		login.mouseClickLoginBtn();
	}

	
	
}
