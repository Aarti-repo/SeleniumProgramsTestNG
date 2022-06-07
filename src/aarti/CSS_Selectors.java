package aarti;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;           // action like scrolling down page, interface btwn selenium webdriver and UI interface
		
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("shooes");
		driver.findElement(By.cssSelector("#gh-btn")).click(); 
		
		
		js.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.cssSelector("#gh-btn")).click();
		
	//	driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3")).click();            // copied XPath working
    	driver.findElement(By.partialLinkText("Reebok BB 4600")).click();                                          // partial Linktext locator working
	//	driver.findElement(By.xpath("h3[class*='item__title']")).click();                               //created xpath for partial link text but not worked
	}

}
