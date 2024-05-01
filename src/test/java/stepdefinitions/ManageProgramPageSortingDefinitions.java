package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.ManageProgramPageSorting;

public class ManageProgramPageSortingDefinitions {
	String manageProgramURL = "https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/";
	ManageProgramPageSorting m = new ManageProgramPageSorting();
	LoginPage loginPage = new LoginPage();

	// @BACKGROUND START
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
		loginPage.getLoginPage();
	}

	@When("I submit username and password")
	public void i_submit_username_and_password() throws InvalidFormatException, IOException {
		loginPage.setLogin();
		loginPage.clickLoginBtn();
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		Boolean result = loginPage.verifyLogin();
		Assert.assertEquals(true, result);
	}
	// @BACKGROUND END

	@Given("Admin is on Manage Program page")
	public void admin_is_on_manage_program_page() {
		String currentUrl = m.getCurrentURL();
		Assert.assertEquals(manageProgramURL, currentUrl);

	}

	@When("Admin clicks the sort icon of program name column")
	public void admin_clicks_the_sort_icon_of_program_name_column() {
		m.clickProgramNameSortIcon();
	}

	@Then("The data get sorted on the table based on the program name column values in ascending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_ascending_order() {
		String[] programBefore = m.getProgramNames();
		Boolean result = true;
		// System.out.println(programBefore);
		for (int i = 0; i < programBefore.length - 1; i++) {
			System.out.println("String 1 : " + programBefore[i] + " --- " + "String 2 : " + programBefore[i + 1]);
			if (programBefore[i].compareToIgnoreCase(programBefore[i + 1]) > 0) {
				result = false;
			}
		}

		Assert.assertTrue(result);

	}

	// sorting-02
	@Given("The data is in the ascending order on the table based on Program Name column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_name_column() {
		Boolean result = m.checkProgramNameInAscending();
		Assert.assertTrue(result);
	}

	@Then("The data get sorted on the table based on the program name column values in descending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_descending_order() {

		// Boolean result = m.checkProgramNameInDescending();
		// Assert.assertTrue(result);

		String[] programBefore = m.getProgramNames();
		Boolean result = true;
		// System.out.println(programBefore);
		for (int i = 0; i < programBefore.length - 1; i++) {
			System.out.println("String 1 : " + programBefore[i] + " --- " + "String 2 : " + programBefore[i + 1]);
			if (programBefore[i].compareToIgnoreCase(programBefore[i + 1]) < 0) {
				result = false;
			}
		}

		Assert.assertTrue(result);

	}

	// Sorting-03

	@When("Admin clicks the sort icon of program Desc column")
	public void admin_clicks_the_sort_icon_of_program_desc_column() {
		m.clickProgramDescSortIcon();
	}

	@Then("The data get sorted on the table based on the program description column values in ascending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_ascending_order() {

		String[] programBefore = m.getProgramDescription();
		Boolean result = true;
		for (int i = 0; i < programBefore.length - 1; i++) {
			System.out.println("String 1 : " + programBefore[i] + " --- " + "String 2 : " + programBefore[i + 1]);
			if (programBefore[i].compareToIgnoreCase(programBefore[i + 1]) > 0) {
				result = false;
			}
		}

		Assert.assertTrue(result);
	}

	// sorting 04

	@Given("The data is in the ascending order on the table based on Program Description column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_description_column() {

		Boolean result = m.checkProgramDescInAscending();
		Assert.assertTrue(result);
	}

	@Then("The data get sorted on the table based on the program description column values in descending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_descending_order() {
		String[] programBefore = m.getProgramDescription();
		Boolean result = true;
		for (int i = 0; i < programBefore.length - 1; i++) {
			System.out.println("String 1 : " + programBefore[i] + " --- " + "String 2 : " + programBefore[i + 1]);
			if (programBefore[i].compareToIgnoreCase(programBefore[i + 1]) < 0) {
				result = false;
			}
		}

		Assert.assertTrue(result);

	}

	// sorting-05
	@When("Admin clicks the sort icon of program Status column")
	public void admin_clicks_the_sort_icon_of_program_status_column() {
		m.clickProgramStatusIcon();
	}

	@Then("The data get sorted on the table based on the program status column values in ascending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_ascending_order() {

		String[] programBefore = m.getProgramStatus();
		Boolean result = true;
		for (int i = 0; i < programBefore.length - 1; i++) {
			System.out.println("String 1 : " + programBefore[i] + " --- " + "String 2 : " + programBefore[i + 1]);
			if (programBefore[i].compareToIgnoreCase(programBefore[i + 1]) > 0) {
				result = false;
			}
		}

		Assert.assertTrue(result);
	}

	// sorting_06

	@Given("The data is in the ascending order on the table based on Program Status column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_status_column() {
		Boolean result = m.checkProgramStausInAscending();
		Assert.assertTrue(result);
	}

	@Then("The data get sorted on the table based on the program status column values in descending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_descending_order() {
		String[] programBefore = m.getProgramStatus();
		Boolean result = true;
		for (int i = 0; i < programBefore.length - 1; i++) {
			System.out.println("String 1 : " + programBefore[i] + " --- " + "String 2 : " + programBefore[i + 1]);
			if (programBefore[i].compareToIgnoreCase(programBefore[i + 1]) < 0) {
				result = false;
			}
		}
			Assert.assertTrue(result);
	}

}
