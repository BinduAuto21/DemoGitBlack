package testngClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	static WebDriver driver;
	
	@BeforeMethod
	public void setUp() {	
	WebDriverManager.chromedriver().setup();
	driver.get("https://www.google.com/");
	}
	
	@Test(priority=1,groups="UI")
	public void titleTest() {
		
		
	}
	@Test(priority=2,groups="UI")
	public void logoTest() {
		
	}
	@Test(priority=3,groups="UI")
	public void mailLinkTest() {
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
