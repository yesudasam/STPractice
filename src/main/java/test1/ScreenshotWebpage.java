package test1;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotWebpage {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// Launch chrome 
		
		driver.get("http://www.facebook.com");
		takeScreeshot("Facebook_LoginPage");
		
	}

	public static void takeScreeshot(String fileName){
		
	//1. Take screenshot and store it as a file format:
		
	
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 	
		//2. Now copy the screenshot to desired location using copyfile method: 
		FileUtils.copyFile
	}
}
