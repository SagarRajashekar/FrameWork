package generic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotMethod {
	
	public static void elementScreenshot(WebElement element) {
		
		LocalDateTime date=LocalDateTime.now();
		String systemDateTime=date.toString().replaceAll(":", "-");
		File temp = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+systemDateTime+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void pageScreenshot(WebDriver driver) {
		
		LocalDateTime date=LocalDateTime.now();
		String systemDateTime=date.toString().replaceAll(":", "-");
		//System.out.println(systemDateTime);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+systemDateTime+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
}