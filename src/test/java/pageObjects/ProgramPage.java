package pageObjects;

import java.time.Duration;

import java.util.NoSuchElementException;



import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



import utilities.ConfigReader;
import utilities.DriverFactory;


public class ProgramPage extends LoginPage{
	
	WebDriver driver=DriverFactory.getdriver();
	String browser = ConfigReader.getBrowserType();
	
		
	Wait<WebDriver> wait =
	        new FluentWait<>(driver)
	            .withTimeout(Duration.ofSeconds(1))
	            .pollingEvery(Duration.ofMillis(300))
	            .ignoring(ElementNotInteractableException.class);
	
		
	    By header = By.xpath("//div[@class='box']"); 	   
	    By showing = By.xpath("//span[@class='p-paginator-current ng-star-inserted']");
		By footertxt = By.xpath("//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']");
		By delete = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']//span[@class='p-button-icon pi pi-trash']");
        By addProgram = By.xpath("//button[@id='new']");
        By noOfRec = By.xpath("//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']");
        By progNameHeader = By.xpath("//th[normalize-space()='Program Name']");
        By progDesHeader = By.xpath("//th[normalize-space()='Program Description']");
        By progStatusHeader = By.xpath("//th[normalize-space()='Program Status']");
        By editdeleteHeader = By.xpath("//th[normalize-space()='Edit / Delete']");
        By sortArrow = By.xpath("//p-sorticon[@field='programName']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']");
        By checkbox = By.xpath("//div[@class='p-checkbox-box']");
        By editbtn = By.xpath("//tbody/tr[1]/td[5]/div[1]/span[1]/button[1]/span[1]");
        By delbtn = By.xpath("//tbody/tr[1]/td[5]/div[1]/span[1]/button[2]/span[1]");
        By search = By.xpath("//input[@id='filterGlobal']");
        By save = By.xpath("//span[normalize-space()='Save']");
        By nameTxtbox = By.xpath("//input[@id='programName']");
        By nameTitle = By.xpath("//label[@for='programName']");
        By desTitle = By.xpath("//label[@for='programDescription']");
        By desTxtbox = By.xpath("//input[@id='programDescription']");
        By radioBtn = By.xpath("//span[@class='p-radiobutton-icon']");
        By activeBtn = By.xpath("//div[contains(text(),'Active')]//div[2]");
        By inactiveBtn = By.xpath("//div[contains(text(),'Inactive')]//div[2]");
        By modelelmt = By.xpath("//div[@role='dialog']");
        By nameErr = By.xpath("//small[normalize-space()='Program name is required.']");
        By desErr = By.xpath("//small[normalize-space()='Description is required.']");
        By staErr = By.xpath("//small[normalize-space()='Status is required.']");
        By cancel = By.xpath("//span[normalize-space()='Cancel']");
        By nameErr1 = By.xpath("//small[contains(text(),'This field should start with an alphabet, no speci')]");
        By desErr1 = By.xpath("//small[contains(text(),'This field should start with an alphabet and min 2')]");
        By close = By.xpath("//span[@class='p-dialog-header-close-icon ng-tns-c132-29 pi pi-times']");       
        By successMsg = By.xpath("//div[@class='p-toast-detail ng-tns-c90-11");
        By toastSummary = By.xpath("//div[contains(@class, 'p-toast-summary')]") ;
    	By toastDetail = By.xpath("//div[contains(@class, 'p-toast-detail')]") ;
		
        public String getHeader() throws InterruptedException {      
        	Thread.sleep(2000);
    		return driver.findElement(header).getText();     		
    	}
        public String getCurrentUrl() {
    		
    		return driver.getCurrentUrl();
    	}
        public void doFill() throws InterruptedException {
        	driver.findElement(nameTxtbox).sendKeys("Team3bn");
        	driver.findElement(desTxtbox).sendKeys("Team3ytt");
        	driver.findElement(activeBtn).click();     	        	
        	driver.findElement(save).click();
        }
        public void doClose() {
        	driver.findElement(close).click();
        }    
        
        public void doEdit() {
        	driver.findElement(editbtn).click();
        }
        
        
        public void doEditName() {
        	driver.findElement(nameTxtbox).sendKeys("Team3zu");
        }
        public void doEditDES() {
        	driver.findElement(desTxtbox).sendKeys("Team3jj");
        }
        public String getSuccessMsg() throws InterruptedException { 
 	        
        	return driver.findElement(successMsg).getText(); 
        	//return driver.switchTo().alert().getText();
        }
        public String getShowing() {
        	return driver.findElement(showing).getText();   
        }
        public String getNameErr() {
        	return driver.findElement(nameErr).getText();   
        }
        public String getDesErr() {
        	return driver.findElement(desErr).getText();   
        }
        public String getNameErr1() {
        	return driver.findElement(nameErr1).getText();   
        }
        public String getDesErr1() {
        	return driver.findElement(desErr1).getText();   
        }
        public String getStaErr() {
        	return driver.findElement(staErr).getText();   
        }
        public void doCancel() {
   		     driver.findElement(cancel).click();		
   	}
        
        public boolean getDelete() {
    		 return driver.findElement(delete).isDisplayed(); 		
    	}

		public boolean getAddprogram() {
			return driver.findElement(addProgram).isDisplayed();
		}
		public boolean isProgName() {
			return driver.findElement(progNameHeader).isDisplayed();		
			
		}
		public boolean isProgDes() {			
			return driver.findElement(progDesHeader).isDisplayed();	
			
		}
		public boolean isProgSta() {			
			return driver.findElement(progStatusHeader).isDisplayed();		
			
		}
		public boolean iseditdel() {			
			return driver.findElement(editdeleteHeader).isDisplayed();			
		}
		public boolean issortArrow() {			
			return driver.findElement(sortArrow).isDisplayed();			
		}
		public boolean ischeckbox() {			
			return driver.findElement(checkbox).isDisplayed();			
		}
		public boolean isEdit() {			
			return driver.findElement(editbtn).isDisplayed();			
		}
		public boolean isDel() {			
			return driver.findElement(delbtn).isDisplayed();			
		}
		public String getSearch() {
        	return driver.findElement(search).getText();   
        }
		public boolean isPopupDisplayed() throws InterruptedException {
			Boolean isClosed=false;
			try {
				return driver.findElement(modelelmt).isDisplayed();
				
			}catch(NoSuchElementException e) {
				isClosed=true;
			}
		return isClosed;
		}

		
		public String getPopup() throws InterruptedException {			
			return driver.findElement(modelelmt).getText();
		}
		public String getNameTitle() {
			 return driver.findElement(nameTitle).getText();
		}
		public boolean isNametxt() {			
			return driver.findElement(nameTxtbox).isDisplayed();			
		}
		public void enterNameTxt() {
			 driver.findElement(nameTxtbox).sendKeys("Team3gh");
		}
		public void enterDesTxt() {
			 driver.findElement(desTxtbox).sendKeys("Team3qqth");
		}
		public void enterNameTxt1() {
			 driver.findElement(nameTxtbox).sendKeys("980779");
		}
		public void enterDesTxt1() {
			 driver.findElement(desTxtbox).sendKeys("&*%*^^");
		}
		public String getDesTitle() {
			 return driver.findElement(desTitle).getText();
		}
		public boolean isDesTxt() {			
			return driver.findElement(desTxtbox).isDisplayed();			
		}
		public boolean isActive() {			
			return driver.findElement(activeBtn).isDisplayed();			
		}
		public boolean isInactive() {			
			return driver.findElement(inactiveBtn).isDisplayed();			
		}
		public void isActiveClick() {			
			 driver.findElement(activeBtn).click();		
		}
		public void isInactiveClick() {			
			 driver.findElement(inactiveBtn).click();		
		}

		
		public String getTitle() {
			 return driver.getTitle();
		}
		public void doClick() {
			driver.findElement(addProgram).click();			
		}
		public void doSave() {
			 driver.findElement(save).click();			
		}	

		public String getNoofRec() throws InterruptedException {

			return driver.findElement(noOfRec).getText();
		}
		
		
		public String getFootertxt() throws InterruptedException {
			
			return driver.findElement(footertxt).getText();
		}
		public void refresh() {
			driver.navigate().refresh();
		}	
//		public void alert() {
//			Alert alert = driver.switchTo().alert();
//			alert.accept();
//			alert.dismiss();
//		}	
		
		public  void pause() {			
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		public String checkToastMessage() {

			System.out.println("waiting for toast to appear...");
			WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(500));
			WebElement td = wait.until(ExpectedConditions.presenceOfElementLocated(toastDetail));
		
			WebElement ts = driver.findElement(toastSummary);
			
			String alertMessage = ts.getText() + " " + td.getText();
			
			System.out.println("Toast message..." + alertMessage);

			return alertMessage;

		}
		
}
		


