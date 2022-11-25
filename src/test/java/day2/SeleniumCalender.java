package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCalender {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		
		Thread.sleep(3000);
		
		//List<WebElement> allElements =  driver.findElements(By.xpath("//div[@role='option']"));
		List<WebElement> allElements=driver.findElements(By.xpath("//td[@data-month='10']"));
		Thread.sleep(2000);
		 //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("25");
		for(WebElement ele:allElements) {
			String str = ele.getText();
			if(str.equals("25")) {
				ele.click();
				break;
			}
		}
	}
}
	


