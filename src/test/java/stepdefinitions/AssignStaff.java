package stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AssignStaffPage;
import utilities.LoggerLoad;

public class AssignStaff {
	AssignStaffPage obj=new AssignStaffPage();

	@Then("Admin should see a pop up open for assign staff details with empty form along with Save and Cancel button and close \\(X) icon on the top right corner of the window")
	public void admin_should_see_a_pop_up_open_for_assign_staff_details_with_empty_form_along_with_save_and_cancel_button_and_close_x_icon_on_the_top_right_corner_of_the_window() {
		LoggerLoad.info("Admin checks Pop up is displayed");
		assertTrue(obj.isPopupDisplayed());
		assertTrue(obj.isSaveBtnDisplayed());
		assertTrue(obj.isCancelBtnDisplayed());
		assertTrue(obj.isCloseIconDisplayed());
	}

	@Then("Admin should see User Role as R02,and other fields Student Email id,Skill,Program Name,Batch Name and Status with respective input boxes.")
	public void admin_should_see_user_role_as_r02_and_other_fields_student_email_id_skill_program_name_batch_name_and_status_with_respective_input_boxes() {
		assertTrue(obj.isUserRoleCorrect());//user role assertion
		LoggerLoad.info("User Role is correct");
		assertTrue(obj.isFieldsDisplayed());
        LoggerLoad.info("Fileds are displayed");
	}
	
	@Given("Admin is in Assign Staff details pop up page")
	public void admin_is_in_assign_staff_details_pop_up_page() {
	LoggerLoad.info("Admin is in Assign Staff details pop up");
	   obj.clickButton("Assign Staff");
	}

	@When("Admin clicks Cancel\\/Close\\(X) Icon on Assign Staff form")
	public void admin_clicks_cancel_close_x_icon_on_assign_staff_form()  throws InterruptedException {
		LoggerLoad.info("Admin clicks close(X)icon");
	    obj.clickCloseIcon();
	}
	
	@When("Admin clicks <Cancel> button")
	public void admin_clicks_cancel_button() {
	     LoggerLoad.info("Admin clicks Cancel button");
         obj.clickCancelBtn();
	}

	@Then("Assign Staff popup window should be closed without saving")
	public void assign_staff_popup_window_should_be_closed_without_saving() {
		LoggerLoad.info("Admin checks if pop up closed without saving");
		assertTrue(obj.isPopupClosed());
	}
	@Then("Admin can see the Assign Staff popup disappears without assigning")
	public void admin_can_see_the_assign_staff_popup_disappears_without_assigning() {
		assertTrue(obj.isPopupClosed());
	}


}
