package stepdefinitions;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.util.List;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import utilities.LoggerLoad;

public class Dashboard {

	DashboardPage dPage=new DashboardPage();

	@Then("Admin should see manage program as header")
	public void admin_should_see_manage_program_as_header() {

//		LoggerLoad.info("Admin is expected to be on dashboard page");
//		String title=dPage.getCurrentUrl();
//		assertEquals(title,"https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/","Admin is not on dashboard page");
		LoggerLoad.info("Admin checks if Manage program is header");
		String header=dPage.getHeader();
		LoggerLoad.info("header"+header);
		assertEquals(header,"Manage Program");
	}

	@Then("Maximum navigation time in milliseconds, defaults to {int} seconds")
	public void maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) {
//		LoggerLoad.info("Admin checks maximum page load time");
//		assertTrue(dPage.isPageLoaded(),"Page did not load in 30s");
	}

	@Then("HTTP response >= {int}. Then the link is broken")
	public void http_response_then_the_link_is_broken(Integer int1) throws Exception {
       LoggerLoad.info("Admin check if link is broken");
       assertFalse(dPage.getLinkResponse()>=int1);
       LoggerLoad.info("Link is not broken and response is:"+dPage.getLinkResponse());
	}


	@Then("Admin should see LMS -Learning management system  as title")
	public void admin_should_see_lms_learning_management_system_as_title() {
		LoggerLoad.info("Admin checks correct spelling and space in LMS title ");
		String title=dPage.getTitle();
		LoggerLoad.info("title "+title);
		assertEquals(title,"LMS - Learning Management System","Title do not match");
	}

	@Then("LMS title should be on the top left corner of page")
	public void lms_title_should_be_on_the_top_left_corner_of_page() {
		LoggerLoad.info("Admin checks if LMS title is top left");
		assertTrue(dPage.isTitleLocLeft());
		LoggerLoad.info("Title is top left");
	}

	@Then("Admin should see correct spelling in navigation bar text")
	public void admin_should_see_correct_spelling_in_navigation_bar_text() {
		LoggerLoad.info("Admin checks correct spelling in navigation bar text");
		List<String> list=dPage.getNavElements();
		assertEquals(list.get(0),"Program","Incorrect spelling in Navigation bar");
		assertEquals(list.get(1),"Batch","Incorrect spelling in Navigation bar");
		assertEquals(list.get(2),"User","Incorrect spelling in Navigation bar");
		assertEquals(list.get(3),"Logout","Incorrect spelling in Navigation bar");
	}

	@Then("Admin should see correct spelling and space in LMS title")
	public void admin_should_see_correct_spelling_and_space_in_lms_title() {
		LoggerLoad.info("Admin checks correct spelling and space in LMS title ");
		String title=dPage.getTitle();
		LoggerLoad.info("title "+title);
		assertEquals(title,"LMS - Learning Management System","Title has incorrect spelling or spaces");
	}


	@Then("Admin should see the navigation bar text on the top right side")
	public void admin_should_see_the_navigation_bar_text_on_the_top_right_side() {
		LoggerLoad.info("Admin checks if navigation bar text on the top right side");
		assertTrue(dPage.isNavLocRight());
		LoggerLoad.info("Navigationbar is top right");
	}

	@Then("Admin should see program in the 1st place")
	public void admin_should_see_program_in_the_1st_place() {
		List<String> list=dPage.getNavElements();
		assertEquals(list.get(0),"Program","Program is not in 1st place");
	}

	@Then("Admin should see batch in the 2nd place")
	public void admin_should_see_batch_in_the_2nd_place() {
		List<String> list=dPage.getNavElements();
		assertEquals(list.get(1),"Batch","Batch is not in 2nd place");
	}

	@Then("Admin should see user in the  3rd place")
	public void admin_should_see_user_in_the_3rd_place() {
		List<String> list=dPage.getNavElements();
		assertEquals(list.get(2),"User","User is not in 3rd place");
	}

	@Then("Admin should see logout in the 4th place")
	public void a_admin_should_see_logout_in_the_4th_place() {
		List<String> list=dPage.getNavElements();
		assertEquals(list.get(3),"Logout","Logout is not in 4th place");
	}

}