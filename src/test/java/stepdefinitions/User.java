package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.UserPage;
import utilities.LoggerLoad;



public class User {
	
	UserPage userPage = new UserPage();
	//@Given("Admin is on dashboard page after Login")
//	public void admin_is_on_dashboard_page_after_login() {
	 //  LoginPage l =new LoginPage();
	   // l.setLogin();
	   // l.clickLoginBtn();
	    
//	}

	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string) {
		userPage.getMainPage();
	}

	@Then("Admin should see the {string} in the URL")
	public void admin_should_see_the_in_the_url(String string) throws InterruptedException {
		/*
		 * LoggerLoad.info("Admin is expected to be on dashboard page"); String
		 * title=userPage.getCurrentUrl(); assertEquals(title,
		 * "https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/user","Admin is not on manage user page"
		 * ); LoggerLoad.info("Admin checks if Manage User is header"); String
		 * header=userPage.getHeader(); LoggerLoad.info("header"+header);
		 * assertEquals(header,"Manage User");
		 */
		userPage.doClick();
	}
	//3
	@Then("Admin should see the text as {string} along with Pagination icon below the table")
	public void admin_should_see_the_text_as_along_with_pagination_icon_below_the_table(String string) {
	    userPage.pagination();

}
	
	@Then("Admin should see the text as {string}")
	public void admin_should_see_the_text_as_along_with_pagination_icon_below_the_table1(String string) {
	   userPage.pagination();

}
	@Then("Admin Should see the data table with column names Id, Name, location, Phone Number, Edit\\/Delete")
	public void admin_should_see_the_data_table_with_column_names_id_name_location_phone_number_edit_delete() {
	    
	}
	

	
	//a[contains(@icon, 'pi pi-trash') 
	@Then("Admin should see a \\{deleteIcon} button on the top left hand side as Disabled")
	public void admin_should_see_a_button_on_the_top_left_hand_side_as_disabled() {
	   userPage.isDisabled();
	}
	
	@Then("Admin should be able to see the {string} button above the data table")
	public void admin_should_be_able_to_see_the_button_above_the_data_table(String string) {
		userPage.isDisplayed();
	}

	 @Then ("Admin should be able to see the {string} text box above the data table")
	public void admin_should_be_able_to_see_the_text_box_above_the_data_table(String string) {
	    // Write code here that turns the phrase above into concrete actions
		userPage.isDisplayed();
	}
	 
	 @Then("Admin should see two  records displayed on the data table")
	 public void admin_should_see_two_records_displayed_on_the_data_table() {
	     // Write code here that turns the phrase above into concrete actions
		 userPage.getCount();
	 }
	 

@Then("Each row in the data table should have a checkbox")
public void each_row_in_the_data_table_should_have_a_checkbox() {
    // Write code here that turns the phrase above into concrete actions
	userPage.tablerowscount();
}

@Then("Each row in the data table should have a edit icon that is enabled")
public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
    // Write code here that turns the phrase above into concrete actions
	userPage.tablerowscount();
}

@Then("Each row in the data table should have a delete icon that is enabled")
public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
    // Write code here that turns the phrase above into concrete actions
	userPage.tablerowscount();
}
//14

@Given("Admin is on Manage User Page")
public void admin_is_on_manage_user_page() {
    userPage.manageUser();
}

@When("Admin enters user name into search box.")
public void admin_enters_user_name_into_search_box() throws InterruptedException {
    userPage.searchInput("Mary");
}

@Then("Admin should see user displayed with the entered name")
public void admin_should_see_user_displayed_with_the_entered_name() throws InterruptedException {
	userPage.validateInput("Mary Poppins");
}
    
@When("Admin enters the keywords not present in the data table on the Search box")
public void admin_enters_the_keywords_not_present_in_the_data_table_on_the_search_box() throws InterruptedException {
	userPage.searchInvalidInput();
}

@Then("Admin should see zero entries on the data table")
public void admin_should_see_zero_entries_on_the_data_table() throws InterruptedException {
	userPage.validateInvalidInput();
   }

//@When("Admin clicks {string} button")
//public void admin_clicks_button(String string) throws InterruptedException {
//    userPage.addNewUserIcon();
//}

@Then("Admin should see pop up open for user details")
public void admin_should_see_pop_up_open_for_user_details() throws InterruptedException {
    userPage.userDetailsPage();
}

@Then("Admin should see text boxes for the fields")
public void admin_should_see_text_boxes_for_the_fields() throws InterruptedException {
	userPage.userDetailsVerificationPage();
}


@Then("Admin should see drop downs for the fields User Role,Role status, visa status on user details pop up")
public void admin_should_see_drop_downs_for_the_fields_user_role_role_status_visa_status_on_user_details_pop_up() throws InterruptedException {
    userPage.userDetailsDropDownVerificationPage();
}



@Given("Admin is on  User details pop up")
public void admin_is_on_user_details_pop_up() throws InterruptedException {
	  userPage.openNewUserIcon();
}

@When("Admin enters mandatory fields in the form and clicks on submit button")
public void admin_enters_mandatory_fields_in_the_form_and_clicks_on_submit_button() throws InterruptedException {
	 userPage.fillNewUserFormSubmit(userPage.generateFirstName(),userPage.generateEmail(),userPage.generateLinkedin(),userPage.generatePhoneNumber());
}

@Then("Admin gets message User added Successfully")
public void admin_gets_message_user_added_successfully() throws InterruptedException {
   userPage.showSuccessMsg();
}


@When("Admin skips to add value in mandatory field")
public void admin_skips_to_add_value_in_mandatory_field() throws InterruptedException {
	 userPage.skipMandatoryUserFormSubmit();
}

@Then("Admin should see error message below the test field and the field will be highlighed in red color")
public void admin_should_see_error_message_below_the_test_field_and_the_field_will_be_highlighed_in_red_color() throws InterruptedException {
   userPage.showErrorMsg();
}


@When("Admin enters invalid data in all of the  fields in the form and clicks on submit button")
public void admin_enters_invalid_data_in_all_of_the_fields_in_the_form_and_clicks_on_submit_button() throws InterruptedException{
   userPage.fillInvalidData();
}

@Then("Admin gets error message and user is not created")
public void admin_gets_error_message_and_user_is_not_created() throws InterruptedException {
	 userPage.showErrorMsg();
}


@When("Admin clicks on submit button without entering data")
public void admin_clicks_on_submit_button_without_entering_data() throws InterruptedException {
	userPage.submitWithEmptyData();
}

@Then("user wont be created and Admin gets error message")
public void user_wont_be_created_and_admin_gets_error_message() throws InterruptedException {
	userPage.showErrorMsg();
}



@When("Admin clicks Cancel\\/Close\\(X) Icon on User Details form")
public void admin_clicks_cancel_close_x_icon_on_user_details_form() throws InterruptedException {
	userPage.clickCrossButton();
}

@Then("User Details popup window should be closed without saving")
public void user_details_popup_window_should_be_closed_without_saving() throws InterruptedException {
	userPage.showErrorMsg();
}

//@When("Admin clicks Cancel button")
//public void admin_clicks_cancel_button() throws InterruptedException {
//	userPage.clickCancelButton();
//}

@Then("Admin can see the User details popup disappears without adding any user")
public void admin_can_see_the_user_details_popup_disappears_without_adding_any_user() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	userPage.showErrorMsg();
	
}

@When("Fill in all the fields with valid values and click submit")
public void fill_in_all_the_fields_with_valid_values_and_click_submit() throws InterruptedException {
    userPage.fillNewUserFormSubmit("testa",userPage.generateEmail(),userPage.generateLinkedin(),userPage.generatePhoneNumber());
}

@Then("The newly added user should be present in the data table in Manage User page")
public void the_newly_added_user_should_be_present_in_the_data_table_in_manage_user_page() throws InterruptedException {
	userPage.searchInput("testa");
	userPage.validateInput("testa");
}


@When("Admin clicks on the edit icon")
public void admin_clicks_on_the_edit_icon() throws InterruptedException {
userPage.searchInput("testa");
   userPage.editIcon();
}

@Then("A new pop up with User details appears")
public void a_new_pop_up_with_user_details_appears() throws InterruptedException {
	//userPage.searchInput("Mary");
    userPage.editUserDetailsPage();
}

@Given("Admin is on editUser details pop up")
public void admin_is_on_edituser_details_pop_up() throws InterruptedException {
	//userPage.searchInput("Sam");
	//userPage.editIcon();
}

@When("Update the fields with valid data and click submit")
public void update_the_fields_with_valid_data_and_click_submit() throws InterruptedException {
	userPage.editIcon();
	userPage.fillUserInfoForEdit();
}

@Then("Admin gets message {string} and see the updated values in data table")
public void admin_gets_message_and_see_the_updated_values_in_data_table(String string) {
    
}

@When("Update the fields with invalid values and click submit")
public void update_the_fields_with_invalid_values_and_click_submit() throws InterruptedException {
	userPage.editIcon();
	userPage.fillInvalidUserInfoForEdit();
}

@Then("Admin should get Error message")
public void admin_should_get_error_message() {
    
}


@When("Update the mandatory fields with valid values and click submit")
public void update_the_mandatory_fields_with_valid_values_and_click_submit() throws InterruptedException {
//	userPage.editIcon();
	userPage.fillMandatoryUserInfoForEdit();
}

@When("Update the optional fields with valid values and click submit")
public void update_the_optional_fields_with_valid_values_and_click_submit() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	userPage.fillOptionalUserInfoForEdit();
}


@When("Admin enters only numbers or special char in the text fields")
public void admin_enters_only_numbers_or_special_char_in_the_text_fields() throws InterruptedException {
	userPage.fillNumbersNSpecialUserInfoForEdit();
}

@When("Admin clicks Cancel button on edit popup")
public void admin_clicks_cancel_button_on_edit_popup() throws InterruptedException {
	userPage.clickCancelButtonOnEdit();
}

@Then("Admin can see the User details popup disappears and can see nothing changed for particular User")
public void admin_can_see_the_user_details_popup_disappears_and_can_see_nothing_changed_for_particular_user() {
    
}





}
