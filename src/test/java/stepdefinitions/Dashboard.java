package stepdefinitions;

import static org.testng.Assert.assertEquals;

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

}
