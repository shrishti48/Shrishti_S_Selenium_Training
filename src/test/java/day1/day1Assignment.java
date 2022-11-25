package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day1Assignment {
	public static void main(String[] args) throws InterruptedException{
		//SearchContext driver1 = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
        driver.findElement(By.xpath("//input[@class='button']")).click();
        driver.findElement(By.xpath("//a[contains(@class,'firstLevelMenu')]")).click();
        driver.findElement(By.xpath("//input[contains(@name,'btnAdd')]")).click();
        //driver.findElement(By.xpath("//input[contains(@name,'systemUser'['UserType'])]")).sendKeys("Admin");
        WebElement user = driver.findElement(By.name("User Role"));
        Select drpuser = new Select(user);
        drpuser.selectByVisibleText("Admin");
        WebElement name=driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']"));
        name.sendKeys("Mukesh Otwani");
        driver.findElement(By.xpath("//label[@for='systemUser_userName']")).sendKeys("Naruto");
        WebElement status = driver.findElement(By.xpath("//select[@id='systemUser_status']"));
        Select drpstatus = new Select(status);
        drpuser.selectByVisibleText("Enabled");
        driver.findElement(By.id("systemUser_password")).sendKeys("ABcd!23");
        driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("ABcd!23");
        driver.findElement(By.xpath("//input[contains(@name,'btnSave')]")).click();
        WebElement welcome = driver.findElement(By.id("welcome"));
        Select drpwelcome = new Select(welcome);
        drpwelcome.selectByVisibleText("Logout");
        
     
	}

}
