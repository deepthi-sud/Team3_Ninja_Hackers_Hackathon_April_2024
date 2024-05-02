package stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.UserSort;

public class UserSortDefinition {
	UserSort u = new UserSort();

	// usersort-01
	@Given("Admin is on Manage User Page")
	public void admin_is_on_manage_user_page() {
		u.clickuserButton();

	}

	@When("Admin clicks on ID sort icon")
	public void admin_clicks_on_id_sort_icon() {

		u.clickUserIdSortIcon();
	}

	@Then("Admin should see User details are sorted by id")
	public void admin_should_see_user_details_are_sorted_by_id() {
		Boolean result = u.checkUserIdInAscending();
		Assert.assertTrue(result);

	}

	// User-sorting-02
	@When("Admin clicks on name sort icon")
	public void admin_clicks_on_name_sort_icon() {
		u.clickNameSortIcon();
	}

	@Then("Admin should see User details are sorted by name")
	public void admin_should_see_user_details_are_sorted_by_name() {
		Boolean result = u.checkUserNameInAscending();
		Assert.assertTrue(result);

	}

	// user-sorting-03
	@When("Admin clicks on Location sort icon")
	public void admin_clicks_on_location_sort_icon() {
		u.clickUserLocationSortIcon();
	}

	@Then("Admin should see User details are sorted by Location")
	public void admin_should_see_user_details_are_sorted_by_location() {
		Boolean result = u.checkUserLocationInAscending();
		Assert.assertTrue(result);

	}

    //user-sorting-04
	@When("Admin clicks on Phone number sort icon")
	public void admin_clicks_on_phone_number_sort_icon() {
		u.clickUserPhoneNoSortIcon();

	}

	@Then("Admin should see User details are sorted by Phone number")
	public void admin_should_see_user_details_are_sorted_by_phone_number() {
		Boolean result = u.checkUserPhoneNoInAscending();
		Assert.assertTrue(result);
	}

}
