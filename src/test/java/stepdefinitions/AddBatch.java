package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.BatchPage;
import utilities.DriverFactory;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class AddBatch {
WebDriver driver;
	//WebDriver driver=DriverFactory.getdriver();
	BatchPage  batch = new BatchPage ();


	@Given("Admin Logged in LMS portal")
	public void admin_logged_in_lms_portal() throws InterruptedException {
		batch.Lmsurl();
		batch.LMSLogin();
		Thread.sleep(1000);
	}

	@When("Admin Click on Batch in header and then click on A New Batch button")
	public void admin_click_on_batch_in_header_and_then_click_on_a_new_batch_button() throws InterruptedException {
		batch.BatchClicklink();
		Thread.sleep(2000);
		batch.ANewBatchclick();
		Thread.sleep(1000);
		//batch.driver.navigate().back();
		//batch.driver.switchTo().alert().dismiss();
		//batch.driver.navigate().refresh();

	}
	@Given("A new pop up with Batch details appears")
	public void a_new_pop_up_with_batch_details_appears() throws InterruptedException {
		//batch.driver.navigate().forward();
		//batch.driver.switchTo().alert().accept();
		Thread.sleep(1000);
		//batch.BatchClicklink();
		//batch.ANewBatchclick();

	}
	@When("The pop up should include the fields Name, Number of classes and Description as text box,")
	public void the_pop_up_should_include_the_fields_name_number_of_classes_and_description_as_text_box() {
		batch.popupDetails();
	}



	@When("Admin clicks cancel button") 

	public void admin_clicks_cancel_button() throws InterruptedException {
		Thread.sleep(1000); 
		//batch.BatchClicklink(); 
		//	batch.ANewBatchclick();
		batch.CancelBtnBatch(); 
	} 
	@Then("Admin should navigate to Manage Batch page") 
	public void admin_should_navigate_to_manage_batch_page() { 
		LoggerLoad.info("Admin is in Manage Batch Page");
	}


	@When("Admin Fill in all the fields except description with valid values   and click on save button")
	public void admin_fill_in_all_the_fields_except_description_with_valid_values_and_click_on_save_button(DataTable dataTable) throws InterruptedException {

		Map<String, String> dataMap = dataTable.asMap(String.class,String.class); 
		batch.BNameField((dataMap.get("Name")));
		batch.BDescription((dataMap.get("Description")));
		batch.SelectBatchPrgm((dataMap.get("Program Name")));
		//batch.isActive();
		batch.BNoOfClasses((dataMap.get("NoOf Classes")));
		//batch.ClickSaveBTN();
		Thread.sleep(1000);
		batch.CancelBtnBatch(); 
	}


	@Then("Admin should get Error message")
	public void admin_should_get_error_message() {
batch.ToastFailureMSG();
	}

	@When("Admin Fill in all the fields and click on cancel button")
	public void admin_fill_in_all_the_fields_and_click_on_cancel_button() throws InterruptedException {
		batch.validFieldsBatch();
		batch.CancelBtnBatch();
	}

	@Then("Admin navigates to manage Batch page")
	public void admin_navigates_to_manage_batch_page() {
		LoggerLoad.info("Admin is in Manage Batch Page");
		batch.ManagePageDisplayed();

	}


	@When("Admin Fill in all the fields  with valid values   and click on save button")
	public void admin_fill_in_all_the_fields_with_valid_values_and_click_on_save_button(DataTable dataTable) throws InterruptedException {
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class); 
		batch.BNameField((dataMap.get("Name")));
		batch.BDescription((dataMap.get("Description")));
		Thread.sleep(2000);
		batch.SelectBatchPrgm((dataMap.get("Program Name")));
		Thread.sleep(1000);
		//batch.BStatusBtnA((dataMap.get("Status")));
		//batch.isActive();
		batch.BNoOfClasses((dataMap.get("NoOf Classes")));
		batch.CancelBtnBatch();

	}
	

	/*
	 * @Then("Admin should get Succesful  message") public void
	 * admin_should_get_succesful_message() {
	 * 
	 * batch.ToastFailureMSG();
	 * 
	 * }
	 */
	
	@Given("Admin in manage batch page with popup batch details")
	public void admin_in_manage_batch_page_with_popup_batch_details() {
	   
		batch.ManagePageDisplayed();
	}

	@When("Admin enters all the values and click on cancel button")
	public void admin_enters_all_the_values_and_click_on_cancel_button() throws InterruptedException {

	    Thread.sleep(2000);
	    batch.CancelBtnBatch();
		
	}

	@Then("Admin navigate to manage batch page")
	public void admin_navigate_to_manage_batch_page() {
	   
		batch.ManagePageDisplayed();
	}


	@Given("Admin is on popup with batch details")
	public void admin_is_on_popup_with_batch_details() {
	   batch.popupDetails();
	}

	@When("Admin is Fill in all the fields with valid values and click save")
	public void admin_is_fill_in_all_the_fields_with_valid_values_and_click_save() throws InterruptedException {
	   batch.validFieldsBatch();
	   batch.ClickSaveBTN();
	}

	@Then("The newly added batch should be present in the data table in Manage Batch page")
	public void the_newly_added_batch_should_be_present_in_the_data_table_in_manage_batch_page() throws InterruptedException {
	   batch.batchpresent();
		
	}

	@Given("Admin checks a new pop up with Batch details appears")
	public void admin_checks_a_new_pop_up_with_batch_details_appears() {
	    batch.popupDetails();
	}

	@When("Check if any of the fields have invalid values")
	public void check_if_any_of_the_fields_have_invalid_values() throws InterruptedException {
		batch.InvalidFields();
	}
	@Then("Error message should display")
	public void error_message_should_display() {
	    batch.DescBatErrMsg();
	}


	@When("Check any of the mandatory fields are blank")
	public void check_any_of_the_mandatory_fields_are_blank() throws InterruptedException {
	   batch.Mandatoryfields();
	   batch.ClickSaveBTN();
	}

	







}
