package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import utilities.LoggerLoad;

public class Dashboard {

	DashboardPage dPage=new DashboardPage();

	@Then("Admin should see manage program as header")
	public void admin_should_see_manage_program_as_header() {

		LoggerLoad.info("Admin is expected to be on dashboard page");
		String title=dPage.getCurrentUrl();
		assertEquals(title,"https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/","Admin is not on dashboard page");
		LoggerLoad.info("Admin checks if Manage program is header");
		String header=dPage.getHeader();
		LoggerLoad.info("header"+header);
		assertEquals(header,"Manage Program");
	}

	@Then("Maximum navigation time in milliseconds, defaults to {int} seconds")
	public void maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) {

	}

	@Then("HTTP response >= {int}. Then the link is broken")
	public void http_response_then_the_link_is_broken(Integer int1) {

	}

	@Then("Admin should see {string}  as title")
	public void admin_should_see_as_title(String string) {
		LoggerLoad.info("Admin checks if LMS -Learning management system  is header");
		String title=dPage.getTitle();
		LoggerLoad.info("title "+title);
		assertEquals(title,string);
	}

	@Then("LMS title should be on the top left corner of page")
	public void lms_title_should_be_on_the_top_left_corner_of_page() {

	}

	@Then("Admin should see correct spelling in navigation bar text")
	public void admin_should_see_correct_spelling_in_navigation_bar_text() {
		LoggerLoad.info("Admin checks correct spelling in navigation bar text");
        List<String> list=dPage.getNavElements();
        assertEquals(list.get(0),"Program");
        assertEquals(list.get(1),"Batch");
        assertEquals(list.get(2),"User");
        assertEquals(list.get(3),"Logout");
	}

	@Then("Admin should see correct spelling and space in LMS title")
	public void admin_should_see_correct_spelling_and_space_in_lms_title() {
		LoggerLoad.info("Admin checks correct spelling and space in LMS title ");
		String title=dPage.getTitle();
		LoggerLoad.info("title "+title);
		assertEquals(title,"LMS - Learning Management System");
	}


	@Then("Admin should see the navigation bar text on the top right side")
	public void admin_should_see_the_navigation_bar_text_on_the_top_right_side() {
		
	}
	
	@Then("Admin should see {string} in the 1st place")
	public void admin_should_see_in_the_1st_place(String string) {
		List<String> list=dPage.getNavElements();
        assertEquals(list.get(0),string);
	}

	@Then("Admin should see {string} in the 2nd place")
	public void admin_should_see_in_the_2nd_place(String string) {
		List<String> list=dPage.getNavElements();
        assertEquals(list.get(1),string);
	}

	@Then("Admin should see {string} in the  3rd place")
	public void admin_should_see_in_the_3rd_place(String string) {
		List<String> list=dPage.getNavElements();
		assertEquals(list.get(2),string);
	}

	@Then("Admin should see {string} in the 4th place")
	public void admin_should_see_in_the_4th_place(String string) {
		List<String> list=dPage.getNavElements();
		assertEquals(list.get(3),string);
	}



}