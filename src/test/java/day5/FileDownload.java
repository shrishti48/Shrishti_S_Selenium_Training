package day5;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileDownload {
	public static void main(String[] args) throws IOException, InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/download");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Hello World.docx']"))).click().perform();
		Thread.sleep(3000);	
	}

}
