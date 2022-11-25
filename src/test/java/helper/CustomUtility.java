package helper;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CustomUtility {

	public static void captureScreenshot(WebDriver driver) {
		//FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),File("./Mukesh.png"));
	}

}
