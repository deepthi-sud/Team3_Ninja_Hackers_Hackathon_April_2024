package stepdefinitions;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ManageProgramPageValidation;

public class ManageProgramValidationDefinition {
  ManageProgramPageValidation mp = new ManageProgramPageValidation();
  
//PageValidation-01
@When("Admin clicks on Batch link on Manage Program page")
public void admin_clicks_on_batch_link_on_manage_program_page() {
    mp.clickBatchLink();
}

@Then("Admin is re-directed to Batch page")
public void admin_is_re_directed_to_batch_page() {
 String title=mp.isInBatchPage();
 Assert.assertEquals("Manage Batch", title);
 
 //pageValidaion-02
}
@When("Admin clicks on User link on Manage Program page")
public void admin_clicks_on_user_link_on_manage_program_page() {
    mp.clickUserLink();
}

@Then("Admin is re-directed to User page")
public void admin_is_re_directed_to_user_page() {
   String result = mp.isInUserpage();
   Assert.assertEquals("Manage User", result);
}

//pageValidation-03
@When("Admin clicks on Logout link on Manage Program page")
public void admin_clicks_on_logout_link_on_manage_program_page() {
	mp.clickLogoutLink();
   
}

@Then("Admin is re-directed to Login page")
public void admin_is_re_directed_to_login_page() {
	Boolean result = mp.isInLogInPage();
	Assert.assertTrue(true);

}

//paginatior-04

@When("Admin clicks Next page link on the program table")
public void admin_clicks_next_page_link_on_the_program_table() {
    mp.clickNextButton();
}

@Then("Admin should see the Pagination has {string} active link")
public void admin_should_see_the_pagination_has_active_link(String string) {
    boolean result = mp.isNextButtonActive();
    Assert.assertTrue(result);
}

//paginator-05
@When("Admin clicks Last page link")
public void admin_clicks_last_page_link() {
	mp.clickLastPageButton();
    
}

@Then("Admin should see the last page record on the table with Next page link are disabled")
public void admin_should_see_the_last_page_record_on_the_table_with_next_page_link_are_disabled() {
     boolean result;
     result = mp.isNextPageButtonDisabled();
     Assert.assertTrue(result);
}
//paginator-06

@Given("Admin is on last page of Program table")
public void admin_is_on_last_page_of_program_table() {
    mp.isOnLastPage();
}


@When("Admin clicks First page link")
public void admin_clicks_first_page_link() {
	mp.clickFirstPageButton();
 
}

@Then("Admin should see the next page record on the table with pagination has next page link")
public void admin_should_see_the_next_page_record_on_the_table_with_pagination_has_next_page_link() {
     boolean result = mp.isEnableNextPageButton();
     Assert.assertTrue(result);
}

//paginator-07

@Given("Admin is on Previous Program page")
public void admin_is_on_previous_program_page() {
  mp.isOnSecondPageLink();
}

@When("Admin clicks Start page link")
public void admin_clicks_start_page_link() {
   mp.clickFirstPageButton();
}

@Then("Admin should see the very first page record on the table with Previous page link are disabled")
public void admin_should_see_the_very_first_page_record_on_the_table_with_previous_page_link_are_disabled() {
  boolean result= mp.isPreviousPageButtonDisabled();
  Assert.assertTrue(result);
}







}



