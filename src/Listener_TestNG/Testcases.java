package Listener_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)

public class Testcases {
	public WebDriver driver;

	
	//Test to pass as to verify listerenrs.
	
@Test
public void Login() throws Exception
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.edureka.co/");
	 
	driver.manage().window().maximize();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//driver.findElement(By.cssSelector("input#search-input")).sendKeys("Test automation engineer master program" );
	driver.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys("Test automation engineer master program" );
	driver.findElement(By.className("search_input_result")).click(); 
	js.executeScript("window.ScrollBy(0,800)");
	Thread.sleep( 3000);
	
}

// forcefully failed this test as verify listner

@Test
public void TestToFail()
{
	System.out.println("This method to test fail");
	Assert.assertTrue(false);
}
}
