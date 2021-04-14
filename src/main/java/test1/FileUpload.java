package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://html.com/"input-type-file/");		
		//type="file" should be present at Inspect to Browse/attach or to upload files buttons
		driver.findElement(By.xapth(".//*[@id='file upload']")).sendKeys(file path to paste);
		
		 		
	}

}
