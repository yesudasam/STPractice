package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class inputformMenu {

	public static void main(String[] args) {
 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		
		 // Open application
		 
		 driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		 
		// maximize browser
		 
				 driver.manage().window().maximize();
				 
				 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			      
			      
			        WebElement press11= driver.findElement(By.xpath("//a[text()='No, thanks!']"));
					
					press11.click();
 	      
			      // Create obj of Action class
			      
			      Actions A = new Actions(driver);
			      
			      // Select Inpunt form on Menu
			    
					
					WebElement E=driver.findElement(By.linkText("Input Forms"));
					
				
					A.moveToElement(E).perform();
					
					E.click();
					
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
					// Select Input Form submit
					
					driver.findElement(By.linkText("Input Form Submit")).click();
					
										
				    String firstname = "Yesudas";
				    String Lastname	= "Asade";
				    String Email = "yesudasam@gmail.com";
				    
				    
								 
					driver.findElement(By.xpath("(//input)[1]")).sendKeys("Yesudas");
 			        driver.findElement(By.xpath("(//input)[2]")).sendKeys("Asade");
 					driver.findElement(By.xpath("(//input)[3]")).sendKeys("Yesudasbingo@gmail.com");
 					
 					WebElement state =driver.findElement(By.name("state"));
 					
 					Select obj = new Select(state);
 					
 					obj.selectByVisibleText("Arizona");
 					
	}

}
