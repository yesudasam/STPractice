package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customxapath {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// Launch chrome 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
		driver.get("http://www.half.ebay.com"); // Enter URL
		
		// We can write customize xpath as below 3
		
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");
		
		 //driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java");
		
		  //driver.findElement(By.xpath("//input[contains(@class,'actextbox')]")).sendKeys("Java");
		
		// How to get dynamic id's using contains function 
		
		// id = test_123
		// id = test_456 like this the id's  will change dynamically in xpath
		
		// ---Starts-with
		// id = test_123_test_
		
		//--Ends-with
		// id = 123_test_t
		//
		
		// we can use below syntax for id's change dynamically
		// Here 'test_' after the extention numbers change dynamically also to get the id's
		
		//driver.findElement(By.id("//input[contains(@id, 'test_')])")).sendKeys("Test"); 
		
		//driver.findElement(By.id("//input[starts-with(@id, 'test_')])")).sendKeys("Test");
		
		//driver.findElement(By.id("//input[ends-with(@id, '_test_t')])")).sendKeys("Test"); 
		
	}
	

}
