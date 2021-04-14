package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumEasyPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		
		 // Open application
		 
		 driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		 
		// maximize browser
		 
				 driver.manage().window().maximize();
				 
				 // wait for 2 sec
				 
				 Thread.sleep(2000);
				 
				 //WebDriverWait wait=new WebDriverWait(x,60);
				 
				 
			// Find elements to enter message and show message
				 
                 String msg = "Yesudas";
				 String sum1= "5";
				 String sum2= "7";
				 
				 
				 String press = "at-cv-lightbox-press button-holder";
				 
				WebElement press11= driver.findElement(By.xpath("//a[text()='No, thanks!']"));
				
				press11.click();
				  
				 driver.findElement(By.id("user-message")).sendKeys(msg);
				 driver.findElement(By.xpath("//button[@type='button'][text()='Show Message']")).click();
				 
				 
				 String Validate=driver.findElement(By.id("display")).getText();
				 
				 if(msg.equalsIgnoreCase(Validate)){
					 System.out.println("Displayed value is true");
				 }
				 else{	
					 System.out.println("Displyed value is false");
				 }
					 
					
				 driver.findElement(By.id("sum1")).sendKeys(sum1);
				 driver.findElement(By.id("sum2")).sendKeys(sum2);
				 
				 Thread.sleep(3000);
				 
				 
				driver.findElement(By.xpath("//button[@type='button'][text()='Get Total']")).click();
				
				 
			 
				  
		 
	}

}
