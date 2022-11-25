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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridDemoParallel {
	WebDriver driver;
	@Parameters({"os","osVersion","browserVersion","browserName"})
	
	@BeforeMethod
	public void setup(String os, String osVersion,String browserVersion,String browserName ){
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName",browserName );
		capabilities.setCapability("browserVersion", browserVersion);
		capabilities.setCapability("os", os);
		capabilities.setCapability("osVersion",osVersion);
		
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
			driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
			driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
	        driver.findElement(By.xpath("//input[@class='button']")).click();
	        Assert.assertTrue(driver.findElement(By.xpath("//b[normalize-space()='Dashboard']")).getText().contains("Dashboard"));
	}		
	
}