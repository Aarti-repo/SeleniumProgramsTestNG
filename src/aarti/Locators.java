package aarti;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    
		    
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		   // driver.get("https://accounts.google.com/");   
	//	    WebElement Username = driver.findElement(By.id("identifierId"));                // web element u can use it anywhere in  the code (by is class name & ID is locator)
	//	    Username.sendKeys("abhyajadhav95@gmail.com");
		//  driver.findElement(By.id("identifierId"));
		
		    //    driver.navigate().back();
	
		      driver.get("https://www.google.com/");                                                       // name locator
	driver.findElement(By.name("q")).sendKeys("Java");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);       // to mimic the pressing of enter key on keyboard use library or class Keys and we can perfotm action as click.
		//  driver.findElements(By.id("Search"));
		
	
		//    driver.findElement(By.name("btnk")).click();                                                         // click is not working
		//      driver.findElement(By.xpath("//input[@type='submit']")).click();
		 //   driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div[1]/span")).click();
		//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).click();
		   
		      
	//	    driver.get("https://login.yahoo.com/");
		  //  driver.findElement(By.id("mbr-forgot-link")).click();                                          // Linktext locator
		     
		//    driver.findElement(By.cssSelector("#login-username")).sendKeys("aarti");                       // CSS locator- start wid #, used for complex element
	//	    Thread.sleep(2000);
		//    driver.findElement(By.cssSelector("#login-signin")).click();
		    
		    
	//	    driver.findElement(By.partialLinkText("forgot")).click();                                        // Partial link text locator
		    
	//	    driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys("aarti");               // created Xpath locator
     //       driver.findElement(By.xpath("//input[@id=\"login-signin\"]")).click();
                   
            
	}

}
