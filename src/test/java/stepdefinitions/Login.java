package stepdefinitions;

import static org.testng.Assert.assertEquals;

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

	@When("Admin enter valid credentials  and clicks login button")
	public void admin_enter_valid_credentials_and_clicks_login_button() {
		login.setLogin();
		login.clickLoginBtn();
	}

	@Then("Admin should land on dashboard page")
	public void admin_should_land_on_dashboard_page() {
		String title=login.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}
	
	
}
