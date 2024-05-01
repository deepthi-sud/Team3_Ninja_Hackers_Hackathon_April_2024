package stepdefinitions;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AssignStudentPage;
import utilities.LoggerLoad;

public class AssignStudent {
	AssignStudentPage obj=new AssignStudentPage();
	
	@Given("Admin logged on the LMS portal")
	public void admin_logged_on_the_lms_portal() {
		obj.login();
	}

//	@Then("Admin clicks {string} from navigation bar")
//	public void admin_clicks_from_navigation_bar(String string) {
//		LoggerLoad.info("Admin clicks User link from navigation bar");
//		assertEquals(obj.isUserClicked(string),true);
//	}

	@Given("Admin is in manage user page")
	public void admin_is_in_manage_user_page() {
		LoggerLoad.info("Admin checks if he is  manage user page");
		assertEquals(obj.getHeader(),"Manage User","The user is not on userpage");
	}

	@When("Admin clicks {string} button")
	public void admin_clicks_button(String string) {
		//LoggerLoad.info("Admin checks if user link is clicked");
		//assertEquals(obj.isAssignStudClicked(string),true);
		obj.clickButton(string);
	}

	@Then("Admin should see a pop up open for assign student details with empty form along with Save and Cancel button and close \\(X) icon on the top right corner of the window")
	public void admin_should_see_a_pop_up_open_for_assign_student_details_with_empty_form_along_with_save_and_cancel_button_and_close_x_icon_on_the_top_right_corner_of_the_window() {
		LoggerLoad.info("Admin checks Pop up is displayed");
		assertTrue(obj.isPopupDisplayed());
		assertTrue(obj.isHeaderCorrect());
		assertTrue(obj.isSaveBtnDisplayed());
		assertTrue(obj.isCancelBtnDisplayed());
		assertTrue(obj.isCloseIconDisplayed());
	}

	@Then("Admin should see User Role as R03,and other fields Student Email id,Program Name,Batch Name and Status with respective input boxes.")
	public void admin_should_see_user_role_as_r03_and_other_fields_student_email_id_program_name_batch_name_and_status_with_respective_input_boxes() {

		assertTrue(obj.isUserRoleCorrect());//user role assertion
		LoggerLoad.info("User Role is correct");
		assertTrue(obj.isFieldsDisplayed());
        LoggerLoad.info("Student Email id,Program Name,Batch Name Fileds are displayed");
	}

	@Then("Admin should see drop down boxes with valid datas for Student Email id,Program Name and Batch Name")
	public void admin_should_see_drop_down_boxes_with_valid_datas_for_student_email_id_program_name_and_batch_name() {
        assertTrue(obj.isDropDownDisplayed());
        LoggerLoad.info("dropdown is displayed");
	}

	@Then("Admin should see two radio button for Status")
	public void admin_should_see_two_radio_button_for_status() throws InterruptedException {
     assertTrue(obj.isActive());  
     assertTrue(obj.isInactive()); 
     LoggerLoad.info("Radio buttons are displayed");
		
	}

	@Given("Admin is in Assign Student details pop up page")
	public void admin_is_in_assign_student_details_pop_up_page() {
		LoggerLoad.info("Admin is in pop up page");
		obj.clickAssignStudent();
	
	}

	@When("Admin clicks {string} button with out entering any data")
	public void admin_clicks_button_with_out_entering_any_data(String string) {
		LoggerLoad.info("Admin clicks Save button");
		obj.clickButton(string);
	}

	@Then("Admin gets a Error message alert")
	public void admin_gets_a_error_message_alert() {
		String msg=obj.errorMsg();
		LoggerLoad.info("Admin gets error message :"+msg);
	} 

//	@When("Admin clicks {string} button without entering Student Email id")
//	public void admin_clicks_button_without_entering_student_email_id(String string) throws InvalidFormatException, IOException {
//		LoggerLoad.info("Admin clicks Save button without entering Student Email id");
//		obj.setWithoutEmail();
//	}
	
	@Then("Admin gets a Error message alert as {string}")
	public void admin_gets_a_error_message_alert_as(String string) {
		assertEquals(obj.errorMsg(),string);
	}


	@When("Admin clicks {string} button without selecting program")
	public void admin_clicks_button_without_selecting_program(String string) throws InvalidFormatException, IOException {
		obj.setWithoutProgram();
	}
	
	@When("Admin clicks {string} button without selecting batch")
	public void admin_clicks_button_without_selecting_batch(String string) throws InvalidFormatException, IOException {
	    obj.setWithoutBatch();
	}

	@When("Admin clicks {string} button without giving status")
	public void admin_clicks_button_without_giving_status(String string) throws InvalidFormatException, IOException {
	    obj.setWithoutStatus();
	}
	
	@When("Admin clicks Cancel\\/Close\\(X) Icon on Assign Student form")
	public void admin_clicks_cancel_close_x_icon_on_assign_student_form() throws InterruptedException {
		LoggerLoad.info("Admin clicks close(X)icon");
	    obj.clickCloseIcon();
	}

	@Then("Assign Student popup window should be closed without saving")
	public void assign_student_popup_window_should_be_closed_without_saving() {
	   LoggerLoad.info("Admin checks if pop up closed without saving");
	   assertTrue(obj.isPopupClosed());
	}
	
//	@When("Enter all the required fields with valid values and click Save button")
//	public void enter_all_the_required_fields_with_valid_values_and_click_save_button() throws InvalidFormatException, IOException{
//		LoggerLoad.info("Admin enters valid data to fields");
//		obj.setValidData();
//		    
//	}

	@Then("Admin gets a message {string} alert")
	public void admin_gets_a_message_alert(String string) {
	    assertEquals(obj.getToastMessage(),string);
	    LoggerLoad.info("Student assigned successfully");
	}
	
	@When("Admin clicks <Cancel> button")
	public void admin_clicks_cancel_button() {
	  obj.clickCancelBtn();
	}
	
	@Then("Admin can see the Assign Student popup disappears without assigning")
	public void admin_can_see_the_assign_student_popup_disappears_without_assigning() {
	assertTrue(obj.isPopupClosed());
	}

}
