package day5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumGridDemo {
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability("browserVersion", "latest");
		capabilities.setCapability("os", "Windows");
		capabilities.setCapability("osVersion","8");
		
		URL url = null;
		try {
			url = new URL("https://shrishtis_xhj8Km:9YdgTfsxWVsZJ3irRafk@hub-cloud.browserstack.com/wd/hub");
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		driver = new RemoteWebDriver(url,capabilities);
	}
	@AfterMethod
	public void  tearDown(){
		driver.quit();
	}
	
	@Test
	  public void test13() {
		  //RemoteWebDriver driver = new RemoteWebDriver();
			driver.get("https://ineuron-courses.vercel.app/login");
			Assert.assertTrue(driver.getCurrentUrl().contains("app"));
			
	}		
	
}
