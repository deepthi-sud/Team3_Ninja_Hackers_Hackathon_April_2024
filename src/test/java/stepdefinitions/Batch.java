package stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import constants.Constants;
import io.cucumber.core.logging.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.BatchPage;
import pageObjects.LoginPage;
import utilities.DriverFactory;
import utilities.LoggerLoad;

public class Batch {
	WebDriver driver=DriverFactory.getdriver();
	BatchPage  batch = new BatchPage ();


	@Given("Admin enters url")
	public void admin_enters_url() {
		batch.Lmsurl();
	}

	@When("Admin enters valid credentials and then click on login button")
	public void admin_enters_valid_credentials_and_then_click_on_login_button() {
		//batch.Lmsurl();
		batch.LMSLogin();
	}

	@Then("Admin navigates to Learning Management System Page")
	public void admin_navigates_to_learning_management_system_page() {

	}

//	@Given("Admin is on dashboard page after Login")
//	public void admin_is_on_dashboard_page_after_login() {
//		String title=batch.getTitle();
//		System.out.println("Title of current page is : " + title);
//	}


//	@When("Admin clicks {string} from navigation bar")
//	public void admin_clicks_from_navigation_bar(String string) throws InterruptedException {
//		Thread.sleep(1000);
//		batch.BatchClicklink();
//		Thread.sleep(1000);
//	}

	@Then("Admin should see the {string} in the URL and in the header")
	public void admin_should_see_the_in_the_url_and_in_the_header(String expectedURL) {

		String title=batch.getTitle();
		LoggerLoad.info(title);
		
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
		batch.checkPagination();
	}

	@Then("Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete")
	public void admin_should_see_the_data_table_with_headers_batch_name_batch_description_batch_status_no_of_classes_program_name_edit_delete() {
		LoggerLoad.info("Admin is on managepage with all the details on the header");
		batch.BatchTableHeaders();
		
	}   

	@Then("Admin should be able to see the {string} icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String Delete) {
		batch.DeleteIconEnableDisplay();
	}

	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String ANewbatch) {
batch.AddNewBatchButtonVisible();
	}

//	@Then("Each row in the data table should have a checkbox")
//	public void each_row_in_the_data_table_should_have_a_checkbox() {
//		 batch.datatablecheckbox();
//	                
//	            }
	 
//	@Then("Each row in the data table should have a edit icon that is enabled")
//	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
//		 batch.datatablecheckbox();
//	}

//	@Then("Each row in the data table should have a delete icon that is enabled")
//	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
//		 batch.datatablecheckbox();
//	}



}