package pageObjects;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.DriverFactory;

public class ManageProgramPageSorting {

	public static WebDriver driver = DriverFactory.getdriver();

	By programNameSortIcon   = By.xpath("//p-sorticon[@field='programName']/i");
	By programNameTitle      = By.xpath("//p-table[@datakey='programId']//thead/tr/th[2]//p-sorticon[@field='programName']");
	By noOfPrograms          = By.xpath("//p-table[@datakey='programId']//tbody/tr");
	
	By programDescSortIcon   = By.xpath("//p-sorticon[@field='description']/i");
	By programDescHeader     = By.xpath("//p-table[@datakey='programId']//thead/tr//th[@psortablecolumn='programDescription']");
	
	
//	By programStatusIcon     = By.xpath("//th[@psortablecolumn='programStatus']");
	By programStatusIcon   = By.xpath("//th[@psortablecolumn='programStatus']");
	String ascendingClass = "pi-sort-amount-up-alt";
	String descendingClass = "pi-sort-amount-down";
		
	String ascendingProgramDescription = "ascending";
	String descendingProgramDescription = "descending";

  // sorting_01

	public String getCurrentURL() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public void clickProgramNameSortIcon() {
		driver.findElement(programNameSortIcon).click();
	}
	public String[] getProgramNames() {

		List<WebElement> programNames = driver.findElements(noOfPrograms);
		String[] programBefore = new String[programNames.size()];

		for (int i = 1; i <= programNames.size(); i++) {

			WebElement programName = driver
					.findElement(By.xpath("//p-table[@datakey='programId']//tbody/tr[" + i + "]/td[2]"));
			programBefore[i - 1] = programName.getText().trim();
			System.out.println(programBefore[i - 1]);

		}
		return programBefore;

	}

	// Sorting-02
	public Boolean checkProgramNameInAscending() {

		WebElement sort = driver.findElement(programNameSortIcon);
		Boolean result = hasClass(sort, ascendingClass);
		System.out.println("has Ascending class : " + result);
		return result;
	}
	
	public boolean hasClass(WebElement element, String searchClass) {
		String classes = element.getAttribute("class");
		System.out.println("Classes available : " + classes);
		for (String c : classes.split(" ")) {
			if (c.equals(searchClass)) {
				return true;
			}
		}

		return false;
	}

	// Sorting-03
	public Boolean checkProgramNameInDescending() {

		WebElement sort = driver.findElement(programNameSortIcon);
		Boolean result = hasClass(sort, descendingClass);
		System.out.println("has Descending class : " + result);
		return result;
	}

	
	public void clickProgramDescSortIcon() {
		driver.findElement(programDescSortIcon).click();
	}

	public String[] getProgramDescription() {

		List<WebElement> programDescriptions = driver.findElements(noOfPrograms);
		String[] programBefore = new String[programDescriptions.size()];

		for (int i = 1; i <= programDescriptions.size(); i++) {

			WebElement programName = driver
					.findElement(By.xpath("//p-table[@datakey='programId']//tbody/tr[" + i + "]/td[3]"));
			programBefore[i - 1] = programName.getText().trim();
			System.out.println(programBefore[i - 1]);

		}
		return programBefore;

	}

	
	// sorting_04



	public Boolean checkProgramDescInAscending() {

		Boolean result = false;
		WebElement programDesc = driver.findElement(programDescHeader);
		String ariaSortValue = programDesc.getAttribute("aria-sort");
		System.out.println("AriaSortValue : " + ariaSortValue);
		if (ariaSortValue.equalsIgnoreCase("ascending"))
		{
			result = true;
		}
		return result;
	}

	//sorting-05
	public void clickProgramStatusIcon()
	{
	      driver.findElement(programStatusIcon).click();
	}
	

	public Boolean checkProgramStausInAscending() {

		Boolean result = false;
		WebElement programStatus = driver.findElement(programStatusIcon);
		String ariaSortValue = programStatus.getAttribute("aria-sort");
		System.out.println("AriaSortValue : " + ariaSortValue);
		if (ariaSortValue.equalsIgnoreCase("ascending"))
		{
			result = true;
		}
		return result;
	}
	
	//sorting-06
	
	public String[] getProgramStatus() {

		List<WebElement> programStatus = driver.findElements(noOfPrograms);
		String[] programBefore = new String[programStatus.size()];

		for (int i = 1; i <= programStatus.size(); i++) {

			WebElement programName = driver
					.findElement(By.xpath("//p-table[@datakey='programId']//tbody/tr[" + i + "]/td[4]"));
			programBefore[i - 1] = programName.getText().trim();
			System.out.println(programBefore[i - 1]);

		}
		return programBefore;

	}

	

}
