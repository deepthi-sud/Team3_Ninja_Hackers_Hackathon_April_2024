package stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ManageProgramDelete;

public class ManageProgramDeleteDefinition {
	ManageProgramDelete mpd = new ManageProgramDelete();

	//@delete-01
	
	@When("Admin clicks <Delete> button on the data table for any row")
	public void admin_clicks_delete_button_on_the_data_table_for_any_row() {
		mpd.clickDeleteButton();
	   
	}

	@Then("Admin should see a alert open with heading {string} along with  <YES> and <NO> button for deletion")
	public void admin_should_see_a_alert_open_with_heading_along_with_yes_and_no_button_for_deletion(String string) {
		Boolean result = mpd.checkAlert();
		Assert.assertTrue(result);
		System.out.println("hi");
	   	}
	
	//delete-02
	
	@Then("Admin should see a message {string}")
	public void admin_should_see_a_message(String string) {
	   String message = mpd.checkMessage();
	   
	   boolean result = message.contains(string);
	   Assert.assertTrue(result);
	}

	//delete-03

@Given("Admin is on Confirm Deletion alert")
public void admin_is_on_confirm_deletion_alert() {
    Boolean result= mpd.isInConfirmWindow();
    Assert.assertTrue(result);
}

@When("Admin clicks <YES> button on the alert")
public void admin_clicks_yes_button_on_the_alert() {
    mpd.clickYesButton();
}

@Then("Admin gets a message {string} alert and able to see that program deleted in the data table")
public void admin_gets_a_message_alert_and_able_to_see_that_program_deleted_in_the_data_table(String string) {
	String message =  mpd.checkAlertMessage();
    boolean result = message.contains(string);
    Assert.assertTrue(result);
    }

	


}
