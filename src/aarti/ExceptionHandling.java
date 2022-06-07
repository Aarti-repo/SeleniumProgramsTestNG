package aarti;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {                                    //throws : use to declared the exception
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		
		
		Thread.sleep(200);
		
		try {
			driver.findElement(By.id("fake")).click();                                //handling exception try : code which thorws or raise exception
		
		//	driver.switchTo().alert().accept();                                      // handling noAlertException
			
		
		}
		
		catch(NoSuchElementException e) {
		
	//	catch(NoAlertPresentException E) {
			System.out.println("Element is not found");	                              // catch : handle exception
	//	E.printStackTrace();                                           // method of throwaable class which print thorwaqble along with othr detail like line no class name. useful for disgnosing exception
		
		throw(e);                                                                     // throw an exception even if we catch exception , still of it will throw exception.
		}
		
		System.out.println("Hello Aarti");                                            // rest of the program execution flow.

	
		
	//	driver.switchTo().window("fail");                                     //throw NoSuchWindowException
	//	driver.switchTo().frame("Abc");                                        // throw NoSuchFrameException
	//	driver.close();
		}

}
