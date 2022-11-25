package day5;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileDemo {
	@Test
	public void upload() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("file-upload"))).click().perform();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\shrs6\\Desktop\\FileOpen.exe");
		driver.findElement(By.id("file-submit")).click();
	}
	}
