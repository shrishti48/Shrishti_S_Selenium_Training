package day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		//To get title of page
		String title = driver.getTitle();
		System.out.println(title);
		//Returns HTML page source
		//System.out.println(driver.getPageSource());
		//Returns Current URL of the Browser.
		System.out.println(driver.getCurrentUrl());
		/*navigate().to();-Loads a new web page in the current browser window.
		System.out.println(driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html"));
		System.out.println(driver.navigate().back());
		driver.navigate().refresh();
		driver.close();
		*/
		/*
		 * driver.get(“https://www.google.co.in”);
driver.close();
—————————–
10) quit()-It closes all browser that opened by WebDriver during execution.
Syntax:driverObject.quit();
Example:
driver.get(“file:///C:/Users/gcreddy/Desktop/HTMLExamples/LoginPage.html”);
driver.findElement(By.linkText(“Sign In”)).click();
driver.quit();
		 */
		
	}

}
