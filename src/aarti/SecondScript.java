package aarti;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
       WebDriver Driver = new FirefoxDriver();
       Driver.get("https://www.facebook.com");
       Driver.manage().window().maximize();
       Driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("aartinalge97@facebook.com");
       Driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("abcd1234");
       Driver.findElement(By.linkText("Log In")).click();  //click for login button
      // Driver.navigate().back();
       
       Driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("aartinalge97@facebook.com");
       Driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("abcd1234");
       Driver.findElement(By.linkText("Log In")).click();  //click for login button
       
    //   Select sel1 = new Select(Driver.findElement(By.xpath("")));   // month dropdown selection
 //      sel1.selectByVisibleText("Aug");                    // select august month index start from 0
 //    Select sel2 = new Select(Driver.findElement(By.xpath("")));
 //    sel2.selectByValue("8");
     
  //   Select sel3 = new Select(Driver.findElement(By.xpath("")));
  //   sel3.selectByIndex(7);
       // Driver.quit();
     
	}

}

