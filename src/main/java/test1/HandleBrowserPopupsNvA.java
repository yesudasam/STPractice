package test1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserPopupsNvA {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("URL"); // take Popup related website to handle
		
		driver.findElement(By.xpath(xpathExpression)).click();// take xpath of 
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it= handler.iterator();// Took String as all the values avaiable in string only
		
		String parentWindowId = it.next();
		System.out.println("parent Window id:"+ parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child Window id:"+ childWindowId);
		
		driver.switchTo().window(childWindowId);
		// from switchTo method to get the above Window ID we need Handles method , 
		//thats why we declare Set<String> handler = driver.getWindowHandles();
		// to get control on child window to work
		
		System.out.println("child Window Popup Tittle"+driver.getTitle());
		
		driver.close(); // To close specific window to close / driver.quite(); to close all windows
		
		driver.switchTo().window(parentWindowId); // to get control on parent window to work
		
		System.out.println("parent window popup tittle"+driver.getTitle());
		
		driver.close();
		
		 
		
	}

}
