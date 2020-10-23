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

public class PopUpWindows 
{
	 WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
	System.setProperty("webdriver.gecko.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Browsers\\geckodriver.exe");
   driver = new FirefoxDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
   driver.get("http://popuptest.com/goodpopups.html");
   driver.manage().window().maximize();
   
	}
	
	@AfterMethod
	public void close()
	{
	   driver.quit();
	}
	@Test
	public void test()
	{
		  String window=driver.getWindowHandle();
		    List<WebElement> links=driver.findElements(By.partialLinkText("Good PopUp"));
		    System.out.println("Number of Links :"+links.size());
		    
		    for(int i=0;i<links.size();i++)
		    {
		    	links.get(i).click();	
		    	System.out.println("we are in child window "+(i+1)+" "+driver.getTitle()+" "+driver.getWindowHandle());
		    	driver.switchTo().window(window);
		    	System.out.println("we are in parent window : "+driver.getTitle());
		    }
	}
}
