package aarti;

		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.ui.Select;
	


		public class DataEntryAutomation {

		//	WebDriver driver;
		    public void fillDateOfBirth(WebDriver driver, String pageUrl) {

//		     driver = new HtmlUnitDriver();
		     
		      driver.get(pageUrl);

		      WebElement Month = driver.findElement(By.id("month"));
		       
		       Select mon = new Select(Month);
		      mon.selectByVisibleText("July");

		       WebElement Day = driver.findElement(By.id("day"));
		       Select date = new Select(Day);
		      date.selectByVisibleText("11");

		       WebElement Year = driver.findElement(By.id("year"));
		        Select Y = new Select(Year);
		      Y.selectByVisibleText("1990");

		    }

		    public static void answerQuestions(WebDriver driver,  String pageUrl) {
		        
//		       driver = new HtmlUnitDriver;
		       driver.get(pageUrl);

		        List <WebElement> AllCheckbox = driver.findElements(By.xpath("//input[@type ='checkbox']"));
		        
		               int size = AllCheckbox.size();

		              for(int i=0; i<size; i++){

		                 String value = AllCheckbox.get(i).getAttribute("value");

		                if(value.equalsIgnoreCase("Java") || value.equalsIgnoreCase("Python") || value.equalsIgnoreCase("Linux") || value.equalsIgnoreCase("Mac OSX") || value.equalsIgnoreCase("IntelliJ IDEA"))
		                {

		                
		                  AllCheckbox.get(i).click();
		                
		                }
		              }
		    }
		}


