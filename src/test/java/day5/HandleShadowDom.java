package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleShadowDom {
	@Test
	public void testInHeadlessMode() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://selectorshub.com/xpath-practice-page/");

		SearchContext shadow = driver.findElement(By.cssSelector("#userName")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#kils")).sendKeys("Mukesh");
				
		
		
	}


}
