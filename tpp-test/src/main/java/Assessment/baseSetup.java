package Assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseSetup {

		WebDriver driver;
		
		@BeforeSuite
		public void setup() {
		//Setup Chrome driver via webdrivermanager 
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		
		}
		
		//launch mock webpage
		@BeforeTest
		public void launchCareersPage() {
			
			driver.get("https://t9pnlh.csb.app/");
		}
		
		//quit mock webpage 
		@AfterTest
		public void quitAll() {
			driver.quit();
		}
		
		

	

}