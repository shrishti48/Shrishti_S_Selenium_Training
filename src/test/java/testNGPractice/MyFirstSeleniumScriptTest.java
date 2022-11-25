package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSeleniumScriptTest {
  @Test
  public void test5() {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com");
      driver.findElement(By.name("q")).sendKeys("Automation Testing");
      Assert.assertTrue(driver.getCurrentUrl().contains("google"));
      String title=driver.getTitle();
      System.out.println("Title is "+title);
      String url=driver.getCurrentUrl();
      System.out.println("Url is "+url);
  }
}
