package seClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff5 {
    static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\bkarn\\Downloads\\ChDri116\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
