//package stepdefinitions;
//
//import org.junit.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.ManageProgramDelete;
//
//public class ManageProgramDeleteDefinition {
//	ManageProgramDelete mpd = new ManageProgramDelete();
//
//	String noOfRecordsBeforeDelete;
//	String deleteRowText;
//	String deleteRow1Text;
//	String deleteRow2Text;
//
//	// @delete-01
//
//	@When("Admin clicks <Delete> button on the data table for any row")
//	public void admin_clicks_delete_button_on_the_data_table_for_any_row() {
//		noOfRecordsBeforeDelete = mpd.checkTotalRecords();
//		System.out.println("Number of records before deletion : " + noOfRecordsBeforeDelete);
//		mpd.clickDeleteButton();
//
//	}
//
//	@Then("Admin should see a alert open with heading {string} along with  <YES> and <NO> button for deletion")
//	public void admin_should_see_a_alert_open_with_heading_along_with_yes_and_no_button_for_deletion(String string) {
//		Boolean result = mpd.checkAlert();
//		Assert.assertTrue(result);
//		System.out.println("hi");
//	}
//
//	// delete-02
//
//	@Then("Admin should see a message {string}")
//	public void admin_should_see_a_message(String string) {
//		String message = mpd.checkMessage();
//
//		boolean result = message.contains(string);
//		Assert.assertTrue(result);
//	}
//
//	// delete-03
//
//	@Given("Admin is on Confirm Deletion alert")
//	public void admin_is_on_confirm_deletion_alert() {
//		Boolean result = mpd.isInConfirmWindow();
//		Assert.assertTrue(result);
//	}
//
//	@When("Admin clicks <YES> button on the alert")
//	public void admin_clicks_yes_button_on_the_alert() {
//		mpd.clickYesButton();
//	}
//
//	@Then("Admin gets a message {string} alert and able to see that program deleted in the data table")
//	public void admin_gets_a_message_alert_and_able_to_see_that_program_deleted_in_the_data_table(String string) {
//		String message = mpd.checkToastMessage();
//		boolean result = message.contains(string);
//		Assert.assertTrue(result);
//	}
//
////deleting-04
//	@When("Admin clicks <NO> button on the alert")
//	public void admin_clicks_no_button_on_the_alert() {
//		System.out.println("Clicking No button ...");
//		mpd.clickNoButton();
//	}
//
//	@Then("Admin can see the deletion alert disappears without deleting")
//	public void admin_can_see_the_deletion_alert_disappears_without_deleting() {
//		String noOfRecordsAfterDelete = mpd.checkTotalRecords();
//		System.out.println("Number of records After deletion : " + noOfRecordsAfterDelete);
//		boolean result = noOfRecordsBeforeDelete.equals(noOfRecordsAfterDelete);
//
//		boolean windowDisplayResult = mpd.isNotInConfirmWindow();
//		System.out.println("Deletion result : " + result + " Window result : " + windowDisplayResult);
//		if (result && windowDisplayResult) {
//			Assert.assertTrue(true);
//		} else {
//			Assert.assertTrue(false);
//		}
//
//	}
//
////deleting-05
//	@When("Admin clicks Cancel\\/Close\\(X) Icon on Deletion alert")
//	public void admin_clicks_cancel_close_x_icon_on_deletion_alert() {
//		mpd.clickCloseButton();
//	}
//
//	@Then("Admin can see the deletion alert disappears without any changes")
//	public void admin_can_see_the_deletion_alert_disappears_without_any_changes() {
//		boolean result = mpd.isNotInConfirmWindow();
//		Assert.assertTrue(result);
//	}
//
////multipledeletion-06
//	@When("Admin clicks any checkbox in the data table")
//	public void admin_clicks_any_checkbox_in_the_data_table() {
//		mpd.checkCheckBox();
//
//	}
//
//	@Then("Admin should see common delete option enabled under header Manage Program")
//	public void admin_should_see_common_delete_option_enabled_under_header_manage_program() {
//		boolean result = mpd.deleteButtonIsVisible();
//		Assert.assertTrue(result);
//	}
//
////mulitipledeletion-07
//	@Given("Admin is on confirm Deletion alert")
//	public void admin_is_on_confirm_deletion_alerrt() {
//		deleteRowText = mpd.getDeleteRecordText();
//		System.out.println("BeforeDeleteRowText : " + deleteRowText);
//		mpd.clickDeleteButton();
//
//	}
//
//	@Then("Admin should land on Manage Program page and can see the selected program is deleted from the data table")
//	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_deleted_from_the_data_table() {
//		boolean result = true;
//		String afterDeleteRowText = mpd.getDeleteRecordText();
//		System.out.println("afterDeleteRowText : " + afterDeleteRowText);
//		if (deleteRowText.equals(afterDeleteRowText))
//			result = false;
//		Assert.assertTrue(result);
//	}
////multipledeletion-08
//
//	@Then("Admin should land on Manage Program page and can see the selected program is not deleted from the data table")
//	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_not_deleted_from_the_data_table() {
//		boolean result = false;
//		String afterFirstRowRecord = mpd.getDeleteRecordText();
//		System.out.println("afterfirstrowrecod" + afterFirstRowRecord);
//		if (deleteRowText.equals(afterFirstRowRecord))
//			result = false;
//		Assert.assertFalse(result);
//	}
//
////multipledeletion-09
//
//	@Given("Admin is on Confirm deletion alert")
//	public void admin_is_on_confirm_deletionn_alert() {
//		deleteRow1Text = mpd.getDeleteRecordText();
//		System.out.println("BeforeDeleteRowText : " + deleteRow1Text);
//		deleteRow2Text = mpd.getDeleteSecondRecordText();
//		System.out.println("BeforeDeleteRow2Text : " + deleteRow2Text);
//		// click the check boxes
//		mpd.clickMultipleCheckBox();
//		mpd.clickMultipleDeleteRecordButton();
//
//	}
//
//	@Then("Admin should land on Manage Program page and can see the selected programs are deleted from the data table")
//	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_deleted_from_the_data_table() {
//
//		boolean result = true;
//		String afterDeleteRowText = mpd.getDeleteRecordText();
//		System.out.println("afterDeleteRowText : " + afterDeleteRowText);
//		String afterDeleteRow2Text = mpd.getDeleteSecondRecordText();
//		if ((deleteRow1Text.equals(afterDeleteRowText)) && (deleteRow2Text.equals(afterDeleteRow2Text)))
//			result = false;
//		Assert.assertTrue(result);
//	}
//
////multipledeletion-10
//	@Then("Admin should land on Manage Program page and can see the selected programs are not deleted from the data table")
//	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_not_deleted_from_the_data_table() {
//		boolean result = false;
//		String afterDeleteRowText = mpd.getDeleteRecordText();
//		System.out.println("afterDeleteRowText : " + afterDeleteRowText);
//		String afterDeleteRow2Text = mpd.getDeleteSecondRecordText();
//		if ((deleteRow1Text.equals(afterDeleteRowText)) && (deleteRow2Text.equals(afterDeleteRow2Text)))
//			result = true;
//		Assert.assertTrue(result);
//	}
//
//}
