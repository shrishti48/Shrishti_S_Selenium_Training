package testNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class CrossBrowserTest {
	
	public void loginTest(String browser)
	{
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("Chrome")) {
			driver =  new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox")) {
			driver =  new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver =  new EdgeDriver();
		}
		
	}

}
