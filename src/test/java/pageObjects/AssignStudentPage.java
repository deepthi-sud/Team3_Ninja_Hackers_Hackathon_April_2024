package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constants;
import utilities.DriverFactory;
import utilities.ExcelReader;

public class AssignStudentPage {
	public  static WebDriver driver=DriverFactory.getdriver();
	String excelpath=Constants.excelpath;
	String sheetname="student";
	ExcelReader reader=new ExcelReader();

	By username=By.id("username");
	By password=By.id("password");
	By loginBtn=By.xpath("//button[@type='submit']");
	By userElmt =By.xpath("//span[contains(text(),'User')]");
	By mnguser=By.xpath("//div[@class='box']");
	By studAssgn=By.xpath("//button[@id='Assign']");//Assign student button
	By modalElmnt=By.xpath(".//div[@role='dialog']");
	By saveBtn=By.xpath(".//button[@label='Save']");
	By cancelBtn=By.xpath(".//button[@label='Cancel']");
	By closeIcn=By.xpath(".//div[contains(@class,'p-dialog-header-icons')]//button[@type='button']//span");
	By header=By.xpath("//div[contains(@class,'p-dialog-header')]//span");
	By userRole=By.xpath("//input[@id='roleId']");
	By Email=By.xpath(".//div[contains(@class,'p-dropdown')]//span[text()='Select Email ID']");
	By Program=By.xpath(".//input[@id='programName']");
	By Batch=By.xpath(".//input[@id='batchName']");
	By radioBtn = By.xpath("//span[@class='p-radiobutton-icon']");
	By activeBtn = By.xpath("//div[contains(text(),'Active')]//div[2]");
	By inactiveBtn = By.xpath("//div[contains(text(),'Inactive')]//div[2]");
	By userError=By.xpath(".//div[contains(text(),'Email Id is required')]");
	By pgmError=By.xpath(".//div[contains(text(),'Program Name is required')]"); 
	By batchError=By.xpath(".//div[contains(text(),'Batch Name is required')]");
	By statusError=By.xpath(".//div[contains(text(),'Status is required')]");
	By toastElmt=By.xpath(".//div[contains(@class,'p-toast-message-text')]");
	By toastSummary = By.xpath("//div[contains(@class, 'p-toast-summary')]") ;
	By toastDetail = By.xpath("//div[contains(@class, 'p-toast-detail')]");
	
	public void login() {
		driver.get(Constants.URL);
		driver.findElement(username).sendKeys(Constants.user_name);
		driver.findElement(password).sendKeys(Constants.pass_word);
		driver.findElement(loginBtn).click();
	}

	public boolean isUserClicked(String str) {
		
		WebElement userElement = driver.findElement(userElmt);
		Actions actions = new Actions(driver);
		actions.moveToElement(userElement).click().build().perform();
		
		
		if (driver.findElement(userElmt).getText().equals(str)) 
			return true;
		else 
			return false;
	}

	public String getHeader() {
		String header=driver.findElement(mnguser).getText();
		return header;
	}

	public boolean isAssignStudClicked(String string) {
		driver.findElement(studAssgn).click();
		if (driver.findElement(studAssgn).getText().equals(string)) 
			return true;
		else 
			return false;
	}

	public boolean isPopupDisplayed() {
		return driver.findElement(modalElmnt).isDisplayed();
	}
	public boolean isSaveBtnDisplayed() {
		return driver.findElement(saveBtn).isDisplayed();
	}
	public boolean isCancelBtnDisplayed() {
		return driver.findElement(cancelBtn).isDisplayed();
	}
	public boolean isCloseIconDisplayed() {  //cl	ose(X)Icon
		return driver.findElement(closeIcn).isDisplayed();
	}

	public boolean isActive() {			
		return driver.findElement(activeBtn).isDisplayed();			
	}
	public boolean isInactive() {			
		return driver.findElement(inactiveBtn).isDisplayed();			
	}
	public void ClickActiveBtn() {			
		//driver.findElement(activeBtn).click();		
		WebElement active = new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(activeBtn));
        active.click();
	}
	public void ClickInactiveBtn() {			
		//driver.findElement(inactiveBtn).click();	
		WebElement inactive = new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(inactiveBtn));
        inactive.click();
	}
	public boolean isHeaderCorrect() {
		if (driver.findElement(header).getText().equals("Assign Student"))
			return true;
		else
			return false;
	}

	public boolean isUserRoleCorrect() {
		if (driver.findElement(userRole).getAttribute("value").equals("R03"))
			return true;
		else
			System.out.println(driver.findElement(userRole).getText());
		return false;
	}

	public boolean isFieldsDisplayed() {//EmailId,Batch,Program,status input fields validation

		if( driver.findElement(Email).isDisplayed() && driver.findElement(Batch).isDisplayed() && driver.findElement(Program).isDisplayed())
			return true;
		else 
			return false;
	}

	public void clickAssignStudent() {
		driver.findElement(studAssgn).click();

	}
	public void clickSave() {
		driver.findElement(saveBtn).click();

	}
	public void clickButton(String str) {
		System.out.print("inside clickButton:::"+str);
		driver.findElement(By.xpath(".//button[@label='"+str+"']")).click();
		//span[contains(text(),'Add New User')]
	}
	
	public void clickCloseIcon() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement closeIcon = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(closeIcn)));
		closeIcon.click();

	}
	
	public String errorMsg() {
	    StringBuilder errorMsg = new StringBuilder();
	    
	    try {
	        if (driver.findElement(userError).isDisplayed()) {
	            errorMsg.append(driver.findElement(userError).getText()).append(" ");
	        }
	    } catch (NoSuchElementException ignored) {}

	    try {
	        if (driver.findElement(pgmError).isDisplayed()) {
	            errorMsg.append(driver.findElement(pgmError).getText()).append(" ");
	        }
	    } catch (NoSuchElementException ignored) {}

	    try {
	        if (driver.findElement(batchError).isDisplayed()) {
	            errorMsg.append(driver.findElement(batchError).getText()).append(" ");
	        }
	    } catch (NoSuchElementException ignored) {}

	    try {
	        if (driver.findElement(statusError).isDisplayed()) {
	            errorMsg.append(driver.findElement(statusError).getText());
	        }
	    } catch (NoSuchElementException ignored) {}

	    return errorMsg.toString().trim();
	}

	
	public void clickCancelBtn() {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement cancel = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(cancelBtn)));
		cancel.click();
	}

	public boolean isPopupClosed() {
		Boolean isClosed=false;
		try {
			driver.findElement(modalElmnt).isDisplayed();

		}catch(NoSuchElementException e) {
			isClosed=true;
		}
		return isClosed;
	}

	public void setValidData() throws InvalidFormatException, IOException {
		List<Map<String,String>> row= ExcelReader.getData(excelpath, "student");
		String email =row.get(4).get("email");
		String program =row.get(4).get("programName");
		String batch =row.get(4).get("batch");
		String status =row.get(4).get("status");
		System.out.println(email+" "+program+" "+batch+" "+status);
		set_fields(email,program,batch,status);
	}
	
	public void setWithoutEmail() throws InvalidFormatException, IOException {
		List<Map<String,String>> row= ExcelReader.getData(excelpath, "student");
		String email =row.get(0).get("email");
		String program =row.get(0).get("programName");
		String batch =row.get(0).get("batch");
		String status =row.get(0).get("status");
		System.out.println(email+" "+program+" "+batch+" "+status);
		driver.findElement(Program).sendKeys(program);
		driver.findElement(Batch).sendKeys(batch);
		setSatus(status);
		clickSave();
		
	}
	public void setWithoutProgram() throws InvalidFormatException, IOException {
		List<Map<String,String>> row= ExcelReader.getData(excelpath, "student");
		String email =row.get(1).get("email");
		String program =row.get(1).get("programName");
		String batch =row.get(1).get("batch");
		String status =row.get(1).get("status");
		System.out.println(email+" "+program+" "+batch+" "+status);
		set_fields(email,program,batch,status);
	}
	public void setWithoutBatch() throws InvalidFormatException, IOException {
		List<Map<String,String>> row= ExcelReader.getData(excelpath, "student");
		String email =row.get(2).get("email");
		String program =row.get(2).get("programName");
		String batch =row.get(2).get("batch");
		String status =row.get(2).get("status");
		System.out.println(email+" "+program+" "+batch+" "+status);
		set_fields(email,program,batch,status);
	}
	
	public void setWithoutStatus() throws InvalidFormatException, IOException {
		List<Map<String,String>> row= ExcelReader.getData(excelpath, "student");
		String email =row.get(3).get("email");
		String program =row.get(3).get("programName");
		String batch =row.get(3).get("batch");
		String status =row.get(3).get("status");
		System.out.println(email+" "+program+" "+batch+" "+status);
		set_fields(email,program,batch,status);
	}
	
	public void set_fields(String email,String pgm,String Batch,String Status) {
		setEmail(email);
		setProgram(pgm);
		setBatch(Batch);
		setSatus(Status);
		clickSave();
	}
	
	public void setEmail(String email)  {
		
		//
		
		if(email!=null) {
	   // String email1="team3ninja@gmail.com";
		WebElement dropdown=driver.findElement(Email);
		dropdown.click();
	    WebElement filter = driver.findElement(By.xpath(".//p-dropdown[@id=\"userId\"]//../../../..//input[contains(@class,'p-dropdown-filter')]"));
		filter.sendKeys(email);
		WebElement option = driver.findElement(By.xpath(".//p-dropdown[@id='userId']//..//../../../../..//span[text()='"+email+"']"));
	    option.click(); // Click on the desired option
		}
	}
	public void setProgram(String pgm) {
		if(pgm!=null) {
		WebElement dropdown=driver.findElement(By.xpath("/html/body/app-root/app-user/div/p-dialog[3]/div/div/div[2]/form/div[3]/p-dropdown/div/span"));
		dropdown.click();
		WebElement option = driver.findElement(By.xpath(".//span[text()='"+pgm+"']"));
		option.click();
		}
	}
	public void setBatch(String batch) {
		if(batch!=null) {
//		WebElement dropdown=driver.findElement(By.xpath("//p-dropdown[@id='batchName']//../..//span[text()='Select Batch']"));
//		dropdown.click();
//		WebElement option = driver.findElement(By.xpath(".//span[text()='"+batch+"']"));
//		option.click();
			WebElement dropdown = new WebDriverWait(driver,Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//p-dropdown[@id='batchName']//../..//span[text()='Select Batch']")));
            dropdown.click();

            WebElement option = new WebDriverWait(driver,Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath(".//span[text()='"+batch+"']")));
            option.click();
		}
	}
	public void setSatus(String status) {
		if(status!=null) {
		if(status.equals("Active")) {
			ClickActiveBtn();
		}else if(status.equals("Inactive")) {
			ClickInactiveBtn();
		}else
		{
			System.out.println("Status unknown");
		}
		}
			
	}

	public boolean isDropDownDisplayed() {
		return true;
	
	}
	public String getToastMessage() {
		
		System.out.println("waiting for toast to appear...");
		WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(500));
		WebElement td = wait.until(ExpectedConditions.presenceOfElementLocated(toastDetail));
	
		WebElement ts = driver.findElement(toastSummary);
		
		String alertMessage = ts.getText() + " " + td.getText();
		
		System.out.println("Toast message..." + alertMessage);

		return alertMessage;

	}


	





}
