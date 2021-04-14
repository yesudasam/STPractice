package test1;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementconcept {

	public static void main(String[] args) {
 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// Launch chrome 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
		driver.get("http://www.half.ebay.com"); // Enter URL
		
		// get the total count of links on the webpage
		
		
		// all the links are represented by <a> html tag:
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		
		// List is a type of object
		// Here linkList is an object
		
		// Display size of LinkList:
		
		System.out.println(linklist.size());
		
		// get the text of each link on the page
		
		for (int i=0; i<linklist.size(); i++){
			String linkText = linklist.get(i).get.Text();
			System.out.println(linkText);
			
		}
		}
		
	}

}
