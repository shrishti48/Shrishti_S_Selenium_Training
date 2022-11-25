package day5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumGridDemoMac {
WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "Safari");
		capabilities.setCapability("browserVersion", "16.0");
		capabilities.setCapability("os", "OS X");
		capabilities.setCapability("osVersion","Ventura");
		
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
