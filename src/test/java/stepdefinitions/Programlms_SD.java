package stepdefinitions;




import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.ProgramPage;
import utilities.LoggerLoad;

public class Programlms_SD {
	
	ProgramPage program = new ProgramPage();
	
	
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		
	    
	}

	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) throws InterruptedException {		
	    	
	}

	@Then("Admin should see URL with Manage Program")
	public void admin_should_see_url_with_manage_program() {
		String title=program.getTitle();
		LoggerLoad.info(title);
		Assert.assertEquals(title, "LMS");
	}
	
	@Then("Admin should see a heading with text {string} on the page")
	public void admin_should_see_a_heading_with_text_on_the_page(String string) throws InterruptedException {		
			 String bodyText = program.getHeader();
			 LoggerLoad.info(bodyText);
			 String url = program.getCurrentUrl();
			 LoggerLoad.info(url);
		     Assert.assertEquals(bodyText,string);	    
	}
	
	@Then("Admin should see the text as {string} along with Pagination icon below the table.")
	public void admin_should_see_the_text_as_along_with_pagination_icon_below_the_table(String string) throws InterruptedException {
		String bodyText = program.getShowing();
		LoggerLoad.info(bodyText);
		Assert.assertEquals(bodyText, string);
	}
	
	@Then("Admin should see the footer as {string}")
	public void admin_should_see_the_footer_as(String string) throws InterruptedException {
		String txt = program.getFootertxt();
		LoggerLoad.info(txt);
		Assert.assertEquals(txt, string);
	}

	@Then("Admin should see a Delete button on the top left hand side as Disabled")
	public void admin_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled() {
		
		Assert.assertTrue(program.getDelete());
	}
	@Then("Admin should see a {string} button on the program page above the data table")
	public void admin_should_see_a_button_on_the_program_page_above_the_data_table(String string) {
		Assert.assertTrue(program.getAddprogram());
	}

	@Then("Admin should see the number of records \\(rows of data in the table) displayed on the page are {int}")
	public void admin_should_see_the_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1)
			throws InterruptedException {
		String txt = program.getNoofRec();
		LoggerLoad.info(txt);
		Assert.assertNotEquals(txt, int1);
	}
	
	@Then("Admin should see data table on the Manage Program Page with following column headers \\(Program Name, Program Description, Program Status, Edit,Delete)")
	public void admin_should_see_data_table_on_the_manage_program_page_with_following_column_headers_program_name_program_description_program_status_edit_delete() {
		Assert.assertTrue(program.isProgName());
		Assert.assertTrue(program.isProgDes());
		Assert.assertTrue(program.isProgSta());
		Assert.assertTrue(program.iseditdel());
	}
	
	@Then("Admin should see the sort arrow icon beside to each column header except Edit and Delete")
	public void admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete() {
		Assert.assertTrue(program.issortArrow());
	}
	
	@Then("Admin should see check box on the left side in all rows of the data table")
	public void admin_should_see_check_box_on_the_left_side_in_all_rows_of_the_data_table() {
		Assert.assertTrue(program.ischeckbox());
	}

	@Then("Admin should see the Edit and Delete buttons on each row of the data table")
	public void admin_should_see_the_edit_and_delete_buttons_on_each_row_of_the_data_table() {
		Assert.assertTrue(program.isEdit());
		Assert.assertTrue(program.isDel());
	}
	
	@Then("Admin should see Search bar with text as {string}")
	public void admin_should_see_search_bar_with_text_as(String string) {
		String txt = program.getSearch();
		LoggerLoad.info(txt);
		Assert.assertNotEquals(txt, string);
	}
	@Then("Admin could see a popup open for Program details to edit")
	public void admin_could_see_a_popup_open_for_program_details_to_edit() {
	    program.doCancel();
	}
	@When("Admin clicks <Edit>button on the data table for any row")
	public void admin_clicks_edit_button_on_the_data_table_for_any_row() {
	   
	}
}
