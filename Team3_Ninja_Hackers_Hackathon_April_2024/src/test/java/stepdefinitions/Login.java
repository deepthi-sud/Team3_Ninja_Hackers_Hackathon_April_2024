package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

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
}
