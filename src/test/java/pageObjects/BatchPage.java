package pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import constants.Constants;
import utilities.ConfigReader;
import utilities.DriverFactory;
import utilities.LoggerLoad;

public class BatchPage {
	WebDriver driver;
	//	public static WebDriver driver = DriverFactory.getdriver();
	//	String lmsUrl = ConfigReader.getUrl();

	// login
	By Username = By.id("username");
	By Password = By.id("password");
	By LoginBtn = By.xpath("//span[text()='Login']");
	// HeaderBatch
	By BatchClick = By.xpath("//span[text()='Batch']");
	By header = By.xpath("//div[@class='box']");

	By BatchName = By.xpath("//th[text()='Batch Name ']");
	By BatchDesc = By.xpath("//th[text()='Batch Description ']");
	By BatchStatus = By.xpath("//th[text()='Batch Status ']");
	By NoClasses = By.xpath("//th[text()='No Of Classes ']");
	By ProgramN = By.xpath("//th[text()='Program Name ']");
	By EditDel = By.xpath("//th[text()=' Edit / Delete ']");
	// Add Batch fields Should be displayed
	By NameB = By.xpath("//label[text()='Name']");
	By DescB = By.xpath("//label[text()='Description ']");
	By ProgramB = By.xpath("//label[text()='Program Name ']");
	By NoOfClassesB = By.xpath("//input[@id='batchNoOfClasses]'");
	By errorclassfield=By.xpath("//small[text()='Number of classes is required.']");
	// Toast Message
	By msg_successful = By.xpath(".//div[contains(@class,'p-toast-message-text')]");
	By ToastSMSG=By.xpath("//div[contains(@class, 'p-toast-summary')]");
	By ToastDetail=By.xpath("//div[contains(@class, 'p-toast-detail')]");
	By BatchRow =By.xpath( "(//table[@role='grid']//tr)[2]//td[2]");

	// Add batch
	By  ANEWBATCH =  By.xpath("//button[@id='new']/span[@class='p-button-label']");
	// BatchDetails
	By AddName = By.id("batchName");
	By AddDesc = By.id("batchDescription");
	By EmptyDesc=By.xpath("//small");
	By ProgramNameB = By.xpath("//input[@placeholder='Select a Program name']");
	By droparrow=By.xpath("//div[@role='button']");
	By activeBtn = By.xpath("//div[@class='p-radiobutton-box'][1]");
	By BatchNoofClasses = By.xpath("//input[@id='batchNoOfClasses']");
	By TableBatch=By.xpath("//table[@role='grid']");


	////div[@class='p-radiobutton-box p-highlight']

	By inactiveBtn = By.xpath("//div[contains(text(),'Inactive')]//div[2]");

	By CancelBtn = By.xpath("//span[text()='Cancel']");
	By SaveBtn = By.xpath("//span[text()='Save']");
	By CloseX = By.xpath("//button[@tabindex='-1']");
	By modelelmt = By.xpath("//div[@role='dialog']");
	// Edit Batch

	// Delete ICON
	// By DeleteICON = By.xpath("//div[@class='p-paginator-bottom p-paginator
	// p-component ng-star-inserted']");
	By headerTable = By.xpath("//table//thead[@class='p-datatable-thead']//th");
	// Disable Delete ICON above header
	By DisableDeleteICon1 = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']");

	
	// Enabled DeleteIcon on row wise
	By DELETEICONEnable = By.xpath("//button[@icon='pi pi-trash']");
	// EDIT ICON
	By EditIcon = By.xpath("//button[@icon='pi pi-pencil']");

	// CheckBox
	By checkbox = By.xpath("//div[@role='checkbox']");
	// Paginator
	By Pagination = By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']");
	By getpopup=By.xpath("//div[@role='dialog']");
By DescERROR =By.xpath("//small[text()='Batch Description is required.']");
	By poperrormsg=By.xpath("//div[text()='Failed']");
	// message updated and deleted batch
	By UpdatedBatchMsg = By.xpath("//div[text()='batch Updated']");
	By BatchDeletdMsg = By.xpath("//div[text()='batch Deleted']");
	// Datatable all the elements
	// div[@class='p-datatable-wrapper ng-star-inserted']

	// Manage Batch Page
	By ManageBatchPage = By.xpath("//div[text()=' Manage Batch']");

	// Confirmation window
	By confirmWindow = By.xpath("//p-confirmdialog//div[contains(@class,'p-dialog-content')]");
	By DeleteYes = By.xpath("//span[text()='Yes']");
	By DeleteNo = By.xpath("//div[contains(@class,'p-dialog-footer')]/button[contains(@class,'p-confirm-dialog-reject')]");

	// Search Text Box
	By SearchBox = By.xpath("//input[@class='p-inputtext p-component']");

	public void DeleteIconEnable() {

		driver.findElement(DELETEICONEnable).click();

//		WebElement DeleteI =
//				driver.findElement(By.xpath("//span[@class='p-button-icon pi pi-trash'])[1]"));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", DeleteI);


	}
	
	public String  DescBatErrMsg() {
		return driver.findElement(DescERROR).getText();
		
	}

	public boolean AddNewBatchButtonVisible() {
		return driver.findElement(ANEWBATCH).isDisplayed();
	}
	public void ErrorFldMSG() {

		WebElement geterrormessage= driver.findElement(poperrormsg);

		String get=geterrormessage.getText();

		LoggerLoad.info(get);

	}


	public void DeleteIconEnableDisplay() {
		WebElement deleteIcon=driver.findElement(DELETEICONEnable);
		if (deleteIcon.isDisplayed()) {
			System.out.println("Delete icon is displayed.");
		} else {
			System.out.println("Delete icon is not displayed.");
		}
	}
	public void checkPagination() {

		boolean page= driver.findElement(Pagination).isDisplayed();
		System.out.println(page);

		if(page)

			LoggerLoad.info("admin see the pagintion");

		else
			LoggerLoad.info("admin not able to see the pagintion");


	}
	
	 public boolean isCheckboxSelected() {
	        
	        WebElement checkbox = driver.findElement(By.xpath("//div[@role='checkbox']"));
	        return checkbox.isSelected();
	 }
	
	
	 public String getCurrentUrl() {
 		
 		return driver.getCurrentUrl();
 	}
	
	

	public void datatablecheckbox() {

		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		WebElement editButton = driver.findElement(By.xpath("//button[@icon='pi pi-pencil']"));
		WebElement deleteICON = driver.findElement(By.xpath("//button[@icon='pi pi-trash']"));
		WebElement CheckBox =driver.findElement(By.xpath("//div[@role='checkbox']"));
	}

	public void popupDetails() {

		WebElement namefield =driver.findElement(AddName);


		WebElement DescriptioF =driver.findElement(AddDesc);
		String descriptionfieldtype= DescriptioF.getAttribute("type");



		WebElement ispgmnamefieldFieldPresent = driver.findElement(ProgramNameB);
		String programnamefieldtype=ispgmnamefieldFieldPresent.getAttribute("aria-haspopup");
		WebElement isstatus = driver.findElement(activeBtn);
		WebElement isnoofclass = driver.findElement(BatchNoofClasses);

	}

	public void ErrorMsgFields() {


		String descerrror=driver.findElement(EmptyDesc).getText();

		System.out.println("Error Description");

	}
	public boolean displaypopup()
	{


		boolean popup = driver.findElement(getpopup).isDisplayed();
		if (popup)
		{
			LoggerLoad.info("NewPopup is displayed");
		}

		else
		{
			LoggerLoad.info("NewPopup is not displayed");
		}
		return popup;
	}

	public void DeleteIconHeaderB() {
		driver.findElement(DisableDeleteICon1).click();
	}

	public boolean ManagePageDisplayed() {
		return driver.findElement(ManageBatchPage).isDisplayed();

	}

	public String getHeader() throws InterruptedException {
		// driver.wait();
		return driver.findElement(header).getText();
	}

	public boolean DisableDeleteIconHeader() {
		return driver.findElement(DisableDeleteICon1).isDisplayed();

	}

	/*
	 * public boolean PaginationDisplay() { return
	 * driver.findElement(Pagination).isDisplayed(); }
	 * 
	 * public String getBUpdatedMsgText() { return
	 * driver.findElement(UpdatedBatchMsg).getText(); }
	 */

	public void CloseInPopup() {
		driver.findElement(CloseX).click();

		Boolean isClosed = false;
		try {
			driver.findElement(CloseX).isDisplayed();

		} catch (NoSuchElementException e) {
			isClosed = true;
		}

	}

	/*
	 * public void getLoginPage() { driver.get(lmsUrl); }
	 */

	public boolean BatchTableHeaders() {
		driver.findElement(BatchName).isDisplayed();
		driver.findElement(BatchDesc).isDisplayed();
		driver.findElement(BatchStatus).isDisplayed();
		driver.findElement(NoClasses).isDisplayed();
		driver.findElement(ProgramN).isDisplayed();
		return driver.findElement(EditDel).isDisplayed();

	}

	public void validFieldsBatch() throws InterruptedException {

		driver.findElement(AddName).sendKeys("BatchAbdd");
		driver.findElement(AddDesc).sendKeys("Tester");
		driver.findElement(ProgramNameB).sendKeys("TejuTeam34");
		//driver.findElement(droparrow).click();
		Thread.sleep(2000);
		driver.findElement(activeBtn).click();
		driver.findElement(BatchNoofClasses).sendKeys("3");


	}
	public void Mandatoryfields() throws InterruptedException {

		driver.findElement(AddName).sendKeys("BatchAbdd");
		driver.findElement(AddDesc).sendKeys("Tester");
		driver.findElement(ProgramNameB).sendKeys("TejuTeam34");
		//driver.findElement(droparrow).click();
		Thread.sleep(2000);
		driver.findElement(activeBtn).click();
		driver.findElement(BatchNoofClasses).sendKeys("3");



	}



	public void batchpresent() throws InterruptedException{


		WebElement elecheckbox=driver.findElement(checkbox);

		String mmsg = elecheckbox.getText();

		LoggerLoad.info(" Batch Created"); 
	}

	public void LMSLogin() {
		driver.findElement(Username).sendKeys(Constants.user_name);

		driver.findElement(Password).sendKeys(Constants.pass_word);
		driver.findElement(LoginBtn).click();
	}
	public void Lmsurl() {
		driver=DriverFactory.getdriver();
		driver.get(Constants.URL);

	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void BatchClicklink() {
		driver.findElement(BatchClick).click();
	}

	public void ANewBatchclick() {
		driver.findElement(ANEWBATCH).click();
	}

	public void CancelBtnBatch() {
		driver.findElement(CancelBtn).click();
	}

	public void BNameField(String Name) {
		driver.findElement(AddName).sendKeys(Name);
	}


	public void BDescription(String Description) {
		driver.findElement(AddDesc).sendKeys(Description); }


	/*
	 * public void BSelectProgmName(String Prgm) {
	 * driver.findElement(SelectProgramName).sendKeys(Prgm); }
	 */
	public void SelectBatchPrgm(String SPN) {
		// driver.findElement(ProgramNameB).sendKeys(SPN);
		driver.findElement(ProgramNameB).click();

		WebElement textField = driver.findElement(ProgramNameB);
		new Actions(driver).sendKeys(textField, "TejuTeam01").build().perform();

		/*
		 * Select dropprmname= new Select((WebElement) ProgramNameB);
		 * dropprmname.selectByVisibleText("TejuTeam01");
		 */

	}

	/*
	 * public void BStatusBtnA( ) { //driver.findElement(StatusA).click();
	 * WebElement element =
	 * driver.findElement(By.xpath("//div[@class='p-radiobutton-box p-highlight']"))
	 * ; JavascriptExecutor executor = (JavascriptExecutor)driver;
	 * executor.executeScript("arguments[0].click();", element);
	 * 
	 * }
	 */

	public boolean isActive() {			
		return driver.findElement(activeBtn).isDisplayed();			
	}
	public boolean isInactive() {			
		return driver.findElement(inactiveBtn).isDisplayed();			
	}
	public void isActiveClick() {			
		driver.findElement(activeBtn).click();		
	}

	public void ClickSaveBTN() {
		driver.findElement(SaveBtn).click();
	}

	public void BNoOfClasses(String BNum) {
		driver.findElement(BatchNoofClasses).sendKeys(BNum);
	}

	public boolean DeleteIconBatchdisplay() {
		return	driver.findElement(DELETEICONEnable).isDisplayed();

		/*
		 * public boolean PopupDisplayed() throws InterruptedException { Boolean
		 * isClosed=false; try { return driver.findElement(modelelmt).isDisplayed();
		 * 
		 * }catch(NoSuchElementException e) { isClosed=true; } return isClosed; }
		 */



	}
	public String getPopup() throws InterruptedException {			
		return driver.findElement(modelelmt).getText();
	}

	public void EditIconBatch() {
		driver.findElement(EditIcon).click();
	}

	public boolean Editicondisplayed() {
		return driver.findElement(EditIcon).isDisplayed();
	}

	public void DeleteYesConfirmW() {
		driver.findElement(DeleteYes).click();
	}

	public void DeleteNoConfirmW() {
		driver.findElement(DeleteNo).click();
	}

	public String SuccessfulMsg() {
		return driver.findElement(msg_successful).getText();
	}

	public String ToastFailureMSG() {
		System.out.println("waiting for toast to appear...");
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(500));
		WebElement td = wait.until(ExpectedConditions.presenceOfElementLocated(ToastDetail));

		WebElement ts = driver.findElement(ToastSMSG);

		String alertMessage = ts.getText() + " " + td.getText();

		System.out.println("Toast message..." + alertMessage);

		return alertMessage;
	}
	public void InvalidFields() throws InterruptedException {


		driver.findElement(AddName).sendKeys("@gdjgsdff");
		Thread.sleep(1000);
		driver.findElement(AddDesc).sendKeys("122312323223");
		driver.findElement(droparrow).click();
		Thread.sleep(1000);
		//driver.findElement(myoption).click();
		Thread.sleep(1000);
		driver.findElement(activeBtn).click();

		Thread.sleep(2000);

		driver.findElement(BatchNoofClasses).sendKeys("14");

		Thread.sleep(2000);

	}
	public void UpdateField() {
		driver.findElement(BatchNoofClasses).sendKeys("67");
	}


	public void CheckBoxSelected() {

		List<WebElement> checkboxes = driver.findElements(By.xpath("//span[@class='p-checkbox-icon pi pi-check']"));

		for (WebElement checkbox : checkboxes) { if (!checkbox.isSelected()) {
			checkbox.click(); 
		}
		}
	}
}



