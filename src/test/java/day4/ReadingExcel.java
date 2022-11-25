package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingExcel {
	WebDriver driver;
	@BeforeMethod
	public void steup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@Test(dataProvider = "testdata")

	public void myTest(String username, String password) throws InterruptedException {
		System.out.println("Test 1 Executed "+ username+" "+password);
		driver.findElement(By.name("email1")).sendKeys(username);
		driver.findElement(By.id("password1")).sendKeys(password);
		driver.findElement(By.className("submit-btn")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("vercel"));
		Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).getText().contains("Sign out"));
		Thread.sleep(3000);

	}
	@DataProvider(name="testdata")
	public Object[][] testDataGeneration()
	{
		Object[][]arr = null;
		
		File src = new File("./testdata/SapientTestData.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh1 = wb.getSheet("Sheet1");
			int rowNum = sh1.getPhysicalNumberOfRows();
			int colNum = sh1.getRow(0).getPhysicalNumberOfCells();
			arr = new Object[rowNum][colNum];
			for(int i =0;i<rowNum;i++) {
				for(int j =0;j<colNum;j++) {
//					XSSFRow ri=sh1.getRow(i);
//					XSSFCell cj=ri.getCell(j);
					arr[i][j] = sh1.getRow(i).getCell(j).getStringCellValue();
				}
			}
			

		}catch (FileNotFoundException e)
		{
			System.out.println("Please check data file path"+e.getMessage());
		}
		catch (IOException e) {
			System.out.println("Something Went Wrong IO"+e.getMessage());
		}
		return arr;
		
	}
	@AfterMethod
	public void  tearDown(){
		driver.quit();
		System.out.println("Running after method-Brower Session closed");

	}

}
