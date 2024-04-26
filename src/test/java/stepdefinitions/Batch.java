package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.BatchPage;
import pageObjects.LoginPage;
import utilities.DriverFactory;

public class Batch {
	WebDriver driver;
	
	BatchPage  batch = new BatchPage ();
	//LoginPage login =new LoginPage();
	
	
	
	@Given("Admin enters url")
	public void admin_enters_url() {
		driver=DriverFactory.getdriver();
	    driver.get(Constants.URL);
	}

	@When("Admin enters valid credentials and then click on login button")
	public void admin_enters_valid_credentials_and_then_click_on_login_button() {
	    batch.LMSLogin();
	}

	@Then("Admin navigates to Learning Management System Page")
	public void admin_navigates_to_learning_management_system_page() {
	    
	}

	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
	   
	}

	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string) {
	   
	}

	@Then("Admin should see the {string} in the URL and in the header")
	public void admin_should_see_the_in_the_url_and_in_the_header(String string) {
	    
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
	    
	}

	@Then("Admin Should see the data table with headers Batch name")
	public void admin_should_see_the_data_table_with_headers_batch_name() {
	    
	}

	@Then("Admin Should see the data table with headers Batch Description")
	public void admin_should_see_the_data_table_with_headers_batch_description() {
	   
	}

	@Then("Admin Should see the data table with headers Batch Status")
	public void admin_should_see_the_data_table_with_headers_batch_status() {
	    
	}

	@Then("Admin Should see the data table with headers No of classes")
	public void admin_should_see_the_data_table_with_headers_no_of_classes() {
	    
	}

	@Then("Admin Should see the data table with headers Program Name")
	public void admin_should_see_the_data_table_with_headers_program_name() {
	    
	}

	@Then("Admin Should see the data table with headers Edit")
	public void admin_should_see_the_data_table_with_headers_edit() {
	    
	}

	@Then("Admin Should see the data table with headers Delete")
	public void admin_should_see_the_data_table_with_headers_delete() {
	   
	}

	@Then("Admin should be able to see the {string} icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
	    
	}

	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	
}