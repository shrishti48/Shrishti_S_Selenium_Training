package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleDynamicAlertsTest {
	public void test8() {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
    Assert.assertTrue(driver.getTitle().contains("Practise"));
    driver.findElement(By.xpath("//button[text()='Try it']")).click();
    //Thread.sleep(10000);
    WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(10));
    Alert alt=wb.until(ExpectedConditions.alertIsPresent());
    alt.accept();
    
}
 
}
