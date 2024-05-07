package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class testCases extends baseSetup {
	  @Test
	  public void submitForm() throws InterruptedException {
		//implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//explicit wait
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			
		  //WebElement variables for mock webpage fields/buttons
		    WebElement firstName = driver.findElement(By.xpath("//*[@id=\"txtFirstName\"]"));
			WebElement lastName = driver.findElement(By.xpath("//*[@id=\"txtLastName\"]"));
			WebElement companyField = driver.findElement(By.xpath("//*[@id=\"txtCompany\"]"));
			WebElement emailField = driver.findElement(By.xpath("//*[@id=\"txtEmail\"]"));
			WebElement birthdayField = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[5]/div/button"));
			WebElement addressField = driver.findElement(By.xpath("//*[@id=\"txtAddress\"]"));
			WebElement cityField = driver.findElement(By.xpath("//*[@id=\"txtCity\"]"));
			WebElement stateField = driver.findElement(By.xpath("//*[@id=\"selState\"]"));
			WebElement zipField = driver.findElement(By.xpath("//*[@id=\"txtZip\"]"));
			WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[11]/button"));
			
			//STEP 1: Verify save button is present, then click it		
			
			wait.until(ExpectedConditions.visibilityOf(saveBtn));
			if(saveBtn.isDisplayed()) {
				System.out.println("Save button is present, clicking save.");
				saveBtn.submit();
			} else 
				System.out.println("Save button is NOT present.");
			
			
			
			//STEP 2: Validate the error messages for following fields
			//First Name 
			//expected error message
		    String fn = "Please provide a First Name.";
		    //actual error message element captured in string and printed to log
		    String fnError = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[1]/div")).getText();
		    System.out.println(fnError);
		    //verify error message with Assertion
	        Assert.assertEquals(fn, fnError);
		     
		    //Last Name 
		    //expected error message
		    String ln = "Please provide a Last Name.";
		    //actual error message element captured in string and printed to log
		    String lnError = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[2]/div")).getText();
		    System.out.println(lnError);
		    //verify error message with Assertion
	        Assert.assertEquals(ln, lnError);
		     
		    //Company
		    //expected error message
			String company = "Please provide a Company.";
		    //actual error message element captured in string and printed to log
		    String companyError = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[3]/div")).getText();
		    System.out.println(companyError);
     	    //verify error message with Assertion
			Assert.assertEquals(company, companyError);
			
		    //Email
		    //expected error message
			String email = "Please provide a valid Email.";
		    //actual error message element captured in string and printed to log
		    String emailError = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[4]/div")).getText();
		    System.out.println(emailError);
     	    //verify error message with Assertion
			Assert.assertEquals(email, emailError);
			
		    //Birthday
		    //expected error message
			String bday = "Please provide a Birthday.";
		    //actual error message element captured in string and printed to log
		    String bdayError = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[5]/div/div")).getText();
		    System.out.println(bdayError);
     	    //verify error message with Assertion
			Assert.assertEquals(bday, bdayError);
			
		    //Address
		    //expected error message
			String address = "Please provide an Address.";
		    //actual error message element captured in string and printed to log
		    String addressError = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[6]/div")).getText();
		    System.out.println(addressError);
     	    //verify error message with Assertion
			Assert.assertEquals(address, addressError);
			
		    //City
		    //expected error message
			String city = "Please provide a City.";
		    //actual error message element captured in string and printed to log
		    String cityError = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[8]/div")).getText();
		    System.out.println(cityError);
     	    //verify error message with Assertion
			Assert.assertEquals(city, cityError);
			     
		    //State
		    //expected error message
			String state = "Please select a State.";
		    //actual error message element captured in string and printed to log
		    String stateError = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[9]/div")).getText();
		    System.out.println(stateError);
     	    //verify error message with Assertion
			Assert.assertEquals(state, stateError);
		     
		    //Zip
		    //expected error message
			String zip = "Please provide a Zip.";
		    //actual error message element captured in string and printed to log
		    String zipError = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[10]/div")).getText();
		    System.out.println(zipError);
     	    //verify error message with Assertion
			Assert.assertEquals(zip, zipError);
		     
			
			//STEP 3: Fill in each required field.
			
			//first name
			wait.until(ExpectedConditions.visibilityOf(firstName));
			if(firstName.isDisplayed()) {
				System.out.println("Entering first name");
				firstName.sendKeys("John");
			} else 
				System.out.println("First name field is NOT present.");
			
			//last name
			wait.until(ExpectedConditions.visibilityOf(lastName));
			if(lastName.isDisplayed()) {
				System.out.println("Entering last name");
				lastName.sendKeys("Smith");
			} else 
				System.out.println("last name field is NOT present.");
			
			//company
			wait.until(ExpectedConditions.visibilityOf(companyField));
			if(companyField.isDisplayed()) {
				System.out.println("Entering company");
				companyField.sendKeys("Total Party Planner");
			} else 
				System.out.println("Company field is NOT present.");
			
			//email
			wait.until(ExpectedConditions.visibilityOf(emailField));
			if(emailField.isDisplayed()) {
				System.out.println("Entering email");
				emailField.sendKeys("John@TotalPartyPlanner.com");
			} else 
				System.out.println("Email field is NOT present.");
			
			//birthday
			wait.until(ExpectedConditions.visibilityOf(birthdayField));
			if(birthdayField.isDisplayed()) {
				System.out.println("Entering birthday");
				birthdayField.click();
				WebElement dateIcon = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]"));
				//Navigating date picker to select 6/23/1985 
				for(int i=0; i<=3; i++) {
				dateIcon.click();
				}
				WebElement yearIcon = driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[1]/td[1]/div"));
				yearIcon.click();
				WebElement leftIcon = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/i"));
				leftIcon.click();
				WebElement yearDOB = driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[2]/td[3]/div"));
				yearDOB.click();
				WebElement monthDOB = driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div"));
				monthDOB.click();
				WebElement dayDOB = driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[5]/td[1]"));
				dayDOB.click();
				Thread.sleep(300);
				
			} else 
				System.out.println("Birthday field is NOT present.");
			
			//address
			wait.until(ExpectedConditions.visibilityOf(addressField));
			if(addressField.isDisplayed()) {
				System.out.println("Entering address");
				addressField.sendKeys("123 Glendale avenue");
			} else 
				System.out.println("Address field is NOT present.");
			
			//city
			wait.until(ExpectedConditions.visibilityOf(cityField));
			if(cityField.isDisplayed()) {
				System.out.println("Entering city");
				cityField.sendKeys("Maui");
			} else 
				System.out.println("City field is NOT present.");
			
			//state
			wait.until(ExpectedConditions.visibilityOf(stateField));
			Select dropdown = new Select(stateField);
			if(stateField.isDisplayed()) {
				System.out.println("Picking state from dropdown");
				dropdown.selectByValue("HI");
			} else 
				System.out.println("state field is NOT present.");
			
			//zipField
			wait.until(ExpectedConditions.visibilityOf(zipField));
			if(zipField.isDisplayed()) {
				System.out.println("Entering zip code");
				zipField.sendKeys("96753");
			} else 
				System.out.println("Zip field is NOT present.");
			
			//STEP 4: Submit the form.
			
			wait.until(ExpectedConditions.visibilityOf(saveBtn));
			if(saveBtn.isDisplayed()) {
				System.out.println("Save button is present, clicking save.");
				saveBtn.submit();
			} else 
				System.out.println("Save button is NOT present.");
			Thread.sleep(2000);
			
			//STEP 5: Validate success message 
			String successMsg = driver.findElement(By.xpath("/html/body/div[1]/label")).getText();
			String expectedSuccessMsg = ("John Smith Added Successfully!");
			Assert.assertEquals(expectedSuccessMsg, successMsg);			
			
		     
			
			
			
	  }
}
