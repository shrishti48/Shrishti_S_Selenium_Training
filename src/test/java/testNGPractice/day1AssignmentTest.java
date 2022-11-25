package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day1AssignmentTest {
	
		//SearchContext driver1 = new ChromeDriver();
	@Test
	public void test() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
        driver.findElement(By.xpath("//input[@class='button']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//b[normalize-space()='Dashboard']")).getText().contains("Dashboard"));
        driver.findElement(By.xpath("//a[contains(@class,'firstLevelMenu')]")).click();
        driver.findElement(By.xpath("//input[contains(@name,'btnAdd')]")).click();
        //driver.findElement(By.xpath("//input[contains(@name,'systemUser'['UserType'])]")).sendKeys("Admin");
        //Select systemUser_userType = new UserType(systemUser_userTypeDrop);
	} 
	

}
