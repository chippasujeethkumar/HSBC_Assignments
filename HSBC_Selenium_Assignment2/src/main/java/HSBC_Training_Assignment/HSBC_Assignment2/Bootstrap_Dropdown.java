package HSBC_Training_Assignment.HSBC_Assignment2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bootstrap_Dropdown 
{
	 WebDriver driver;
		@BeforeMethod
		public void setUp()
		{
		System.setProperty("webdriver.gecko.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Browsers\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	    driver.manage().window().maximize();	    
		}
		
		@Test
		public void test()
		{
			 WebElement dropdown=driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")); 
			    dropdown.click();
			    
			    List<WebElement> elements=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]/li/a/label"));
			    System.out.println("Total number of Elements in the Dropdown :"+elements.size());
			    
			    for(int i=0;i<elements.size();i++)
			    {
			    	System.out.println("Element" +(i+1)+":"+elements.get(i).getText());
			    }
		}
		@AfterMethod
		public void close()
		{
		   driver.close();
		}
}
