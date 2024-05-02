package stepdefinitions;

import java.awt.Checkbox;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BatchPage;
import utilities.DriverFactory;
import utilities.LoggerLoad;

public class EditDelete {

	WebDriver driver=DriverFactory.getdriver();
	BatchPage  batch = new BatchPage ();

	@Given("Admin logged into LMS portal")
	public void admin_logged_into_lms_portal() {

		batch.Lmsurl();
		batch.LMSLogin();
	}

	@When("Admin clicks on Batch from navigation bar")
	public void admin_clicks_on_batch_from_navigation_bar() {
		batch.BatchClicklink();
	}
	@Then("Admins is on Manage Batch Page")
	public void admins_is_on_manage_batch_page() throws InterruptedException {
		String bodyText = batch.getHeader();
		LoggerLoad.info(bodyText);
		String url = batch.getCurrentUrl();
		LoggerLoad.info(url);
		// Assert.assertEquals(bodyText,string);

	}

	@When("Admin should clicks the delete icon")
	public void admin_should_clicks_the_delete_icon() throws InterruptedException {
		Thread.sleep(2000);

		batch.DeleteIconEnable();
	}

	@Then("Alert appears with yes and No option")
	public void alert_appears_with_yes_and_no_option() {
		//batch.DeleteIconEnable();
		//	Alert alert = driver.switchTo().alert();
		/*
		 * boolean result = batch.isInConfirmWindow(); Assert.assertTrue(result);
		 */
	}

	@Given("Admin is on Manage Batch Page with alert")
	public void admin_is_on_manage_batch_page_with_alert() {
		//driver.switchTo().alert();
		//batch.ManagePageDisplayed();
		batch.isInConfirmWindow();

	}

	@When("Admin  clicks on yes option")
	public void admin_clicks_on_yes_option() throws InterruptedException {
		Thread.sleep(2000);
		batch.DeleteYesConfirmW();
	}

	@Then("Batch deleted alert pops and batch is no more available in data table")
	public void batch_deleted_alert_pops_and_batch_is_no_more_available_in_data_table() {
		/*
		 * String message = batch.ToastFailureMSG(); boolean result =
		 * message.contains(String); Assert.assertTrue(result);
		 */
		batch.ToastFailureMSG();	
	}

	@Given("Admin is on Manage Batch Page")
	public void admin_is_on_manage_batch_page() throws InterruptedException {
		String bodyText = batch.getHeader();
		LoggerLoad.info(bodyText);
		String url = batch.getCurrentUrl();
		LoggerLoad.info(url);
	}
	@When("Admin clicks the delete icon and  click No option")
	public void admin_clicks_the_delete_icon_and_click_no_option() {
		batch.DeleteIconEnable();
		batch.DeleteNoConfirmW();

	}

	@Then("Batch is still listed in data table")
	public void batch_is_still_listed_in_data_table() {
		//boolean isBatchListed = batch.batchpresent();
		LoggerLoad.info("Batch is not listed in the data table");

	}

	@When("None of the checkboxes in data table are selected")
	public void none_of_the_checkboxes_in_data_table_are_selected() {
		//LoggerLoad.info("Admin is in ManageBatch with no checkbox selected");
		 boolean areCheckboxesSelected = batch.CheckBoxSelected();
		
		//Assert.assertFalse("None of the checkboxes in data table are selected",areselected);
	}

	@Then("The delete icon under the {string} header should be disabled")
	public void the_delete_icon_under_the_header_should_be_disabled(String string) {
		batch.DisableDeleteIconHeader();

	}

	@Given("Admin is in Manage Batch Page")
	public void admin_is_in_manage_batch_page() {
		batch.ManagePageDisplayed();
	}

	@When("Admin selects one of the checkbox and  delete icon below {string} header")
	public void admin_selects_one_of_the_checkbox_and_delete_icon_below_header(String string) {
		batch.CheckBoxSelected();
		batch.DeleteIconHeaderB();
	}

	@Then("The respective row in the data table is deleted")
	public void the_respective_row_in_the_data_table_is_deleted() throws InterruptedException {
		Thread.sleep(2000);
		batch.isRespectiveRowDeleted();
	}

	@When("Admin selects Two or more checkboxes row and Click delete icon below {string} header")
	public void admin_selects_two_or_more_checkboxes_row_and_click_delete_icon_below_header(String string) throws InterruptedException {
		Thread.sleep(1000);
		batch.isCheckboxSelected();
		batch.DeleteIconEnable();
		batch.DeleteYesConfirmW();
	}

	@Given("Admin is on Manage Page with Edit Icon enabled on row level in datatable")
	public void admin_is_on_manage_page_with_edit_icon_enabled_on_row_level_in_datatable() {
		LoggerLoad.info("Admin is on manage batch page with edit icon enable");
		batch.Editicondisplayed();
	}
	@When("Admin clicks the edit icon for {string}")
	public void admin_clicks_the_edit_icon_for_(String batchName) throws InterruptedException {

		Thread.sleep(2000);
		batch.EditIconBatch();
	}

	@Given("Admin is on manage batch page with batch details popup")
	public void admin_is_on_manage_batch_page_with_batch_details_popup() {
		batch.popupdisplay();
		//batch.ManagePageDisplayed();
		//driver.navigate().refresh();
	}


	@When("Admin Update the fields with valid values and click save")
	public void admin_update_the_fields_with_valid_values_and_click_save() throws InterruptedException {
		Thread.sleep(2000);
		batch.UpdateField();
		batch.ClickSaveBTN();
	}
	@Then("The updated batch details should appear on the data table")
	public void the_updated_batch_details_should_appear_on_the_data_table() {
batch.getUpdatedBatchDataTable();

	}

	@Given("Admin is with batch popup details")
	public void admin_is_with_batch_popup_details() {
               batch.popupdisplay();
	}
	@When("Admin Update the fields with invalid values and click save")
	public void admin_update_the_fields_with_invalid_values_and_click_save() {
batch.UpdateFieldInvalid();
batch.ClickSaveBTN();
	}
	@Then("Error message should EDIT appear")
	public void error_message_should_EDIT_appear() {
		batch.ToastFailureMSG();
	}

	//	@Given("Admin is on manage batch page")
	//	public void admin_is_on_manage_batch_page() {
	//		batch.ManagePageDisplayed();
	//	}

	@When("Admin clicks edit icon and Erase data from mandatory field")
	public void admin_clicks_edit_icon_and_erase_data_from_mandatory_field() {
		batch.EditIconBatch();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 * WebElement EditIcon =
		 * wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
		 * EditIconBatch))); EditIcon.click();
		 */

	}

	








}
