package aarti;

//	package blogPkg;

	import java.time.Duration;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class NewsClick {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty(
					"webdriver.chrome.driver",
					"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver;
			String bannerXpath = "(//div[@class='container-8272be99c3019c828ce4f897f14b03d6__stand']//a[@class='container-8272be99c3019c828ce4f897f14b03d6__link'])";
			
			driver = new ChromeDriver();
			
			List<WebElement> bannerXpaths =driver.findElements(By.xpath(bannerXpath));
			
			driver.get("https://nationalupdatesforyou.blogspot.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,350)", "");
		
			String parent = driver.getWindowHandle();
			int bannerCount = 1;
			for (int i = 1; i <= 100; i++) {
//				js.executeScript("window.scrollBy(0,350)", "");

				if(bannerXpaths.size()==0) {
					driver.navigate().refresh();
				}
				for (int j = 1; j <= 4; j++) {
					String xpath = bannerXpath + "[" + j + "]";
					Thread.sleep(2000);
					driver.findElement(By.xpath(xpath)).click();
					System.out.println("Banner Click Count: " + bannerCount);
					bannerCount++;
				}
				
				
	//			if(i%2==0)
				
				//-----------------------------------------------
		//		parent = driver.getWindowHandle();
				Set<String> s = driver.getWindowHandles();
				// Now iterate using Iterator
				Iterator<String> I1 = s.iterator();
				while (I1.hasNext()) {
					String child_window = I1.next();
					if (!parent.equals(child_window)) {
						driver.switchTo().window(child_window);
						Thread.sleep(1000);
						System.out.println(driver.switchTo().window(child_window).getTitle());
						driver.close();					
					}
				}
			
				
			// switch to the parent window
			driver.switchTo().window(parent);
			
			driver.get("https://nationalupdatesforyou.blogspot.com/");
			Thread.sleep(1000);
		}
			System.out.println("Execution Completed");
			 driver.close();

		}

	}

