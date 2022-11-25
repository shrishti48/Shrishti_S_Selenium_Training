package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTProblem1 {
	WebDriver driver;
	@BeforeMethod
	public void steup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@AfterMethod
	public void  tearDown(){
		driver.quit();
		System.out.println("Running after method-Brower Session closed");
		
	}

	
@Test(dataProvider = "testdata")
	
	public void myTest(String username, String password) throws InterruptedException {
		System.out.println("Test 1 Executed "+ username+" "+password);
		driver.findElement(By.name("email1")).sendKeys(username);
		driver.findElement(By.id("password1")).sendKeys(password);
		driver.findElement(By.className("submit-btn")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("vercel"));
		Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).getText().contains("Sign out"));
		Thread.sleep(3000);
	
	}
	@DataProvider(name="testdata")
	public Object[][] testDataGeneration()
	{
		Object[][]arr = new Object[4][2];
		
		arr[0][0] = "sample9@gmail.com";
		arr[0][1] = "Mukesh1234";
		arr[1][0] = "samplemukesh@gmail.com";
		arr[1][1] = "Mukesh1234";
		arr[2][0] = "samplemukesh1@gmail.com";
		arr[2][1] = "Mukesh1234";
		arr[3][0] = "samplemukesh2@gmail.com";
		arr[3][1] = "Mukesh1234";
		
		return arr;
		
	}
	
	
}
