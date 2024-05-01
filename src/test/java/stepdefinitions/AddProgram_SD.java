package stepdefinitions;



import org.junit.Assert;

import io.cucumber.java.en.*;
import pageObjects.ProgramPage;
import utilities.LoggerLoad;


public class AddProgram_SD {
	
	ProgramPage program = new ProgramPage();
	
	@Given("Admin is on Manage Program Page")
	public void admin_is_on_manage_program_page() throws InterruptedException {	 
		program.getCurrentUrl();
		String bodyText = program.getHeader();
		 LoggerLoad.info(bodyText);
		 Assert.assertEquals(bodyText,"Manage Program");
		
	}

//	@When("Admin clicks {string} button")
//	public void admin_clicks_button(String string) {
//	    program.doClick();
//	}
	@Then("Admin is on {string} Popup window")
	public void admin_is_on_popup_window(String string) throws InterruptedException {
		String txt = program.getPopup();
		LoggerLoad.info(txt);
		//Assert.assertEquals(txt,"Program Details\nName\n*\nDescription\n*\nStatus*\nActive\nInactive\nCancel\nSave");
	}

	@Then("Admin should see a popup open for Program details with empty form along with <SAVE> and <CANCEL> button and Close\\(X) Icon on the top right corner of the window")
	public void admin_should_see_a_popup_open_for_program_details_with_empty_form_along_with_save_and_cancel_button_and_close_x_icon_on_the_top_right_corner_of_the_window() throws InterruptedException {
		Assert.assertTrue(program.isPopupDisplayed());
	}
	@Then("Admin should see two input fields and their respective text boxes in the program details window")
	public void admin_should_see_two_input_fields_and_their_respective_text_boxes_in_the_program_details_window() {
	    
		String txt = program.getNameTitle();
	    LoggerLoad.info(txt);
	    Assert.assertEquals(txt, "Name\n*");
	    Assert.assertTrue(program.isNametxt());
	    
	    String txt1 = program.getDesTitle();
	    LoggerLoad.info(txt1);
	    Assert.assertEquals(txt1, "Description\n*");
	    Assert.assertTrue(program.isDesTxt());
	}

	@Then("Admin should see two radio button for Program Status")
	public void admin_should_see_two_radio_button_for_program_status() {
	   Assert.assertTrue(program.isActive());
	   Assert.assertTrue(program.isInactive());
	}

//	@Given("Admin is on {string} Popup window")
//	public void admin_is_on_popup_window(String string) throws InterruptedException {
//		String txt = program.getPopup();
//		LoggerLoad.info(txt);
//		Assert.assertTrue(txt.contains("Program Details"));
//	}

	@When("Admin clicks <Save>button without entering any data")
	public void admin_clicks_save_button_without_entering_any_data() throws InterruptedException {		       
	           program.doSave();        	           
	}

//	@Then("Admin gets a Error message alert")
//	public void admin_gets_a_error_message_alert() {
//	    String nameerr = program.getNameErr();
//	    LoggerLoad.info(nameerr);
//	    Assert.assertEquals( nameerr, "Program name is required.");
//	    String deserr = program.getDesErr();
//	    LoggerLoad.info(deserr);
//	    Assert.assertEquals( deserr, "Description is required.");
//	    String staerr = program.getStaErr();
//	    LoggerLoad.info(staerr);
//	    Assert.assertEquals( staerr, "Status is required.");
//	    program.doCancel();
//	}
	@When("Admin enters only<Program Name> in text box and clicks Save button")
	public void admin_enters_only_program_name_in_text_box_and_clicks_save_button() throws InterruptedException {
		
		program.enterNameTxt();
		program.doSave();
	    String deserr = program.getDesErr();
	    LoggerLoad.info(deserr);
	    Assert.assertEquals( deserr, "Description is required.");
	    String staerr = program.getStaErr();
	    LoggerLoad.info(staerr);
	    Assert.assertEquals( staerr, "Status is required.");
	    program.doCancel();
	    
	}

	@Then("Admin gets a description message alert {string}")
	public void admin_gets_a_description_message_alert(String string) {
		String deserr = program.getDesErr();
	    LoggerLoad.info(deserr);
	    Assert.assertEquals( deserr, "Description is required.");
	    program.doCancel();
	}

	@When("Admin enters only<Program description> in text box and clicks Save button")
	public void admin_enters_only_program_description_in_text_box_and_clicks_save_button() throws InterruptedException {
		
	    program.enterDesTxt();
	    program.doSave();
	   
	}

	@Then("Admin gets a name message alert {string}")
	public void admin_gets_a_name_message_alert(String string) {
		String nameerr = program.getNameErr();
		LoggerLoad.info(nameerr);
		Assert.assertEquals(nameerr, "Program name is required.");
		program.doCancel();
	}

	@When("Admin selects only Status and clicks Save button")
	public void admin_selects_only_status_and_clicks_save_button() throws InterruptedException {
		//program.getPopup();
	    program.isActiveClick();
	    program.doSave();
	}
	@Then("Admin gets a name and description message alert")
	public void admin_gets_a_name_and_description_message_alert() {
		String nameerr = program.getNameErr();
	    LoggerLoad.info(nameerr);
	    Assert.assertEquals( nameerr, "Program name is required.");
	    String deserr = program.getDesErr();
	    LoggerLoad.info(deserr);
	    Assert.assertEquals( deserr, "Description is required.");
	    program.doCancel();
	}


	@When("Admin enters only numbers or special char in name and desc column")
	public void admin_enters_only_numbers_or_special_char_in_name_and_desc_column() throws InterruptedException {
		//program.getPopup();
	    program.enterNameTxt1();
	    program.enterDesTxt1();
	    program.doSave();
	}
	@Then("Admins get a error message alert")
	public void admins_get_a_error_message_alert() {
		String nameerr1 = program.getNameErr1();
	    LoggerLoad.info(nameerr1);
	    Assert.assertEquals( nameerr1, "This field should start with an alphabet, no special char and min 2 char.");
	    String deserr1 = program.getDesErr1();
	    LoggerLoad.info(deserr1);
	    Assert.assertEquals( deserr1, "This field should start with an alphabet and min 2 char.");
	    program.doCancel();
	}

	@When("Admin clicks Cancel Close\\(X) Icon on Program Details form")
	public void admin_clicks_cancel_close_x_icon_on_program_details_form() throws InterruptedException {
		//program.getPopup();
	    program.doCancel();
	}


	@When("Enter all the required fields with valid values and click Save button")
	public void enter_all_the_required_fields_with_valid_values_and_click_save_button() throws InterruptedException {
		//program.getPopup();
		program.doFill();	    
	}
	@Then("Admin gets a message {string} alert and able to see the new program added in the data table")
	public void admin_gets_a_message_alert_and_able_to_see_the_new_program_added_in_the_data_table(String string)
			throws InterruptedException {
		
		//String txt = program.getSuccessMsg();
		String toastmsg = program.checkToastMessage();
		LoggerLoad.info(toastmsg);
		Assert.assertEquals(toastmsg, string);
	}

	@When("Admin clicks Cancel button")
	public void admin_clicks_cancel_button() {			
	    program.doCancel();
	}
	
	@Then("Program Details popup window should be closed without saving")
	public void program_details_popup_window_should_be_closed_without_saving() throws InterruptedException {
		
		Assert.assertTrue(program.isPopupDisplayed());

	}
	@Then("Admin can see the Program details popup disappears without creating any program")
	public void admin_can_see_the_program_details_popup_disappears_without_creating_any_program() throws InterruptedException {
		Assert.assertTrue(program.isPopupDisplayed());
	}
	@When("Admin edit the Name column and clicks save button")
	public void admin_edit_the_name_column_and_clicks_save_button() {
	    if(program.getNameTitle().equalsIgnoreCase("Team3")) {
	    	program.doEditName();
	    	program.doSave();
	    }
	}
	@When("Admin edit Description column and clicks save button")
	public void admin_edit_description_column_and_clicks_save_button() {
		if(program.getDesTitle().equalsIgnoreCase("Team3")) {
	    	program.doEditDES();
	    	program.doSave();
	    }		
	}
	@When("Admin change Status and clicks save button")
	public void admin_change_status_and_clicks_save_button() throws InterruptedException {
	    if(program.getPopup().contains("Program Details")) {
	    	program.isInactiveClick();
	    	program.doSave();
	    }
	}




}
