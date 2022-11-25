package testNGPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokeTestTest {

	WebDriver driver;
	@BeforeMethod
	public void steup() {
		driver = new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
	}
	@AfterMethod
	public void  tearDown(){
		driver.quit();
		System.out.println("Running after method-Brower Session closed");
	}
	
	@Test
	public void verifyURL(){
		Assert.assertTrue(driver.getCurrentUrl().contains("index.php"));
	}
	
	@Test
	public void verifyTitle() {
	}
	@Test(enabled = false)
	public void verifySocialMediaAccount() {
		List<WebElement> l1=driver.findElements(By.xpath("//div[@id='social-icons']"));
		int count=l1.size();
		Assert.assertEquals(count,1);
	}
	
	@Test
	public void BlankLogin() {
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("");
        driver.findElement(By.xpath("//input[@class='button']")).click();
		//String<WebElement> str = driver.findElement(By.xpath("//span[@id='spanMessage']"));
		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='spanMessage']")).getText().contains("Username cannot be empty"));
	}
	
	@Test
	public void BlankPassword() {
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("");
        driver.findElement(By.xpath("//input[@class='button']")).click();
		//String<WebElement> str = driver.findElement(By.xpath("//span[@id='spanMessage']"));
		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='spanMessage']")).getText().contains("Password cannot be empty"));
	}
	@Test
	public void InavlidCredentials() {
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("kshaskj");
        driver.findElement(By.xpath("//input[@class='button']")).click();
         WebElement element= driver.findElement(By.xpath("//span[@id='spanMessage']"));
         String msg=element.getText();
         Assert.assertTrue(driver.findElement(By.xpath("//span[@id='spanMessage']")).getText().contains("Invalid credentials"));
            
	}
	@Test
	public void ValidCredentials() {
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
        driver.findElement(By.xpath("//input[@class='button']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//b[normalize-space()='Dashboard']")).getText().contains("Dashboard"));
	}
}