package testNGPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginCategoryTest {
  @Test
  public void test7() {
  WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
	driver.get("https://ineuron-courses.vercel.app/login");
	Assert.assertTrue(driver.getCurrentUrl().contains("vercel"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement username = driver.findElement(By.name("email1"));
	username.sendKeys("ineuron@ineuron.ai");
	driver.findElement(By.id("password1")).sendKeys("ineuron");
	driver.findElement(By.className("submit-btn")).click();
	//Assert.assertTrue(driver.findElement(By.xpath())
	
	WebElement manage =driver.findElement(By.xpath("//span[normalize-space()='Manage']"));
	//driver.switchTo().frame(child_frame);
	Actions act=new Actions(driver);
	act.moveToElement(manage).perform();
	driver.findElement(By.xpath("(//span[normalize-space()='Manage Categories'])[1]")).click();
	Set<String> allWindowHandle = driver.getWindowHandles();
	String parent=driver.getWindowHandle();
	int count=allWindowHandle.size();
	
	for(String child:allWindowHandle)
	{
		if(!child.equals(parent))
		{
			driver.switchTo().window(child);
			driver.findElement(By.xpath("//button[normalize-space()='Add New Category']")).click();
			
		}
		}
	Alert alt=driver.switchTo().alert();
	alt.sendKeys("Selenium");
	alt.accept();
	
}
}
