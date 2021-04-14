package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicityonSEeasy1 {

	public static void main(String[] args) {
	 
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     
	      WebDriver driver= new ChromeDriver();
	      
	      driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      
	      // implicityWait -- is always applied globally-- is available for all Webelements
	      
	      driver.get("https://wwww.facebook.com");
	      
	      driver.manage().window().maximize();
	      
	      WebElement firstName = driver.findElement(By.name("firstname"));
	      WebElement lastName = driver.findElement(By.name("lastname"));
	      WebElement mobileNum = driver.findElement(By.name("reg_email__"));
	      WebElement password = driver.findElement(By.name("test@123"));
	      
	   // Created a Userdefined method for Explicitly wait by Naveen Auto( We can use this simple way of write code in real)
	      
	      
	      sendKeys(driver, firstName, 10, "Tom");
	      sendKeys(driver, lastName, 5, "Peter");
	      sendKeys(driver, mobileNum, 5, "9849034453");
	      sendKeys(driver, password, 10, "test@123");
	      
	}
	      
	      // this method is for send the values to the fields
	      public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
	    	 
	    	  new WebDriverWait(driver, timeout).
	    	  until(ExpectedConditions.visibilityOf(element));
	    	  element.sendKeys(value);
	    	  
	      }
	      
	      // this Method is for click on buttom
	      public static void clickOn(WebDriver driver, WebElement element, int timeout){
		    	 
	    	  new WebDriverWait(driver, timeout).
	    	  until(ExpectedConditions.elementToBeClickable(element));
	    	  element.click(); 
	 

	}
}


