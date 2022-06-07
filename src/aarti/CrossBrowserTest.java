package aarti;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowserTest {

	
	WebDriver driver;
	
    @BeforeTest
    @Parameters("browser")	

public void Setup(String browser) throws Exception  {
	
    	// check if parameter passed from TESTNG is firefox
		if(browser.equalsIgnoreCase("firefox")) {
			//create firefox instance
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else {
			
			throw new Exception("Broweser is not corect");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

@Test

public void test() throws InterruptedException {
	
	driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("aartinalge97@facebook.com");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("abcd1234");
    Thread.sleep(3000);
    driver.findElement(By.linkText("Log In")).click();
	Thread.sleep(3000);

}

}