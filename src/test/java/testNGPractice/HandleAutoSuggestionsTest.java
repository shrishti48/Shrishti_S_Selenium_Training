package testNGPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAutoSuggestionsTest {
	@Test
	public void test6() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	driver.findElement(By.name("q")).sendKeys("Selenium");
	
	Thread.sleep(3000);
	
	List<WebElement> allElements =  driver.findElements(By.xpath("//div[@role='option']"));
	
	for(WebElement ele:allElements) {
		String str = ele.getText();
		System.out.println(str);
		
		//if(WebElement)
	}
	
}
}
