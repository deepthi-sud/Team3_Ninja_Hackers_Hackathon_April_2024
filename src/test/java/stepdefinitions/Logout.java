//package stepdefinitions;
//
//import utilities.LoggerLoad;
//
//import static org.testng.Assert.assertEquals;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.LogOutPage;
//
//public class Logout {
//	LogOutPage logOutObj=new LogOutPage();
//
//	@Given("Admin is dashboard page")
//	public void admin_is_dashboard_page() {
//		LoggerLoad.info("Admin is expected to be on dashboard page");
//		String title=logOutObj.getTitle();
//		assertEquals(title,"LMS","Admin is not on dashboard page");
//	}
//
//	@When("Admin click Logout button on navigation bar")
//	public void admin_click_logout_button_on_navigation_bar() {
//		logOutObj.clickLogOutBtn();
//	}
//
//	@Then("Admin should land on login in page")
//	public void admin_should_land_on_login_in_page() {
//		String title=logOutObj.getTitle();
//		LoggerLoad.info("Title of current page is : " + title);
//		assertEquals(title,"LMS","User is not on login page");
//	}
//}