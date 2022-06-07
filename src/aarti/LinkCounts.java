package aarti;



import java.util.Iterator;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LinkCounts {

	static int linkCount;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32_v90.44\\chromedriver.exe");
		
          WebDriver driver = new ChromeDriver();
          
          driver.get("https://www.google.com");
          
         List<WebElement> links = driver.findElements(By.xpath("//a"));             //or driver.findElements(By.tagName("a"));
          
         System.out.println(links);
         
         int linkcount = links.size();
       
           System.out.println("total links : "+ linkcount);
           
      //  using for loop
      
 /*        for(int i=0;i<linkcount;i++)
           {
       	   WebElement l1 = links.get(i);
        	   System.out.println(l1.getText());
        	   
        	// OR
        	   
        	   System.out.println(links.get(i).getText());
           }
   
    */    
           // using for each loop

      /*      for (WebElement link : links ) {
            System.out.println(link.getText());
            linkCount++;
           }
           System.out.println("total links : "+ linkCount);
            
      */      
           
           // using iterator
      /*     
           Iterator<WebElement> iterator = links.iterator();
           
           while(iterator.hasNext()) {
        	String   url = iterator.next().getText();
        	   System.out.println(url);
           }
           
       */    
         
         
         
       // links from perticular section like lang section
         
         WebElement langSection = driver.findElement(By.id("SIvCob"));
         
        List<WebElement> l1 = langSection.findElements(By.tagName("a"));
        
        for(int i=0; i<l1.size();i++)
        {
        	System.out.println(l1.get(i).getText());
        }
        
           
           // all elements on webpage
           
          List<WebElement> allelements = driver.findElements(By.xpath("//*"));
          
          int elementcount = allelements.size();
          
          System.out.println("total elements : "+ elementcount);
               
          driver.close();
	}

}
