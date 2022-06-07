package aarti;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeleniumAction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
         
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.edureka.co");
		
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		Actions builder = new Actions(Driver);
		
		builder.moveToElement(Driver.findElement(By.xpath("/html/body/nav/div[1]"))).build().perform();
		Thread.sleep(3000);
		
		WebElement link = Driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[8]/a"));
		
		builder.moveToElement(link).build().perform();
		Thread.sleep(3000);
		
		Driver.findElement(By.xpath("//ul[@class=\"dropdown-menu dropdown_menu_multi_level hidden-xs hidden-sm\"]//li//a[text() =\"Software Testing\"]")).click();
		Thread.sleep(4000);
		
		WebElement act = Driver.findElement(By.xpath("/html/body/header/nav/div[3]/input"));                // not detecting from this onwards
		
		builder.moveToElement(act).build().perform();
		
	Thread.sleep(3000);
	
	WebElement search = Driver.findElement(By.id("search-results"));                 // xpath = //div[@class="search_result_web"]
		builder.moveToElement(search).build().perform();
		Thread.sleep(3000);
		
		Action seriesOfActions;
		
		seriesOfActions = builder
				.sendKeys(act, "selenium")
				.keyDown(search, Keys.SHIFT)
				.keyUp(search, Keys.SHIFT)
			 .build();
		
		seriesOfActions.perform();
		
		Thread.sleep(3000);
		
		Driver.quit();
		
		
		
	}

}
