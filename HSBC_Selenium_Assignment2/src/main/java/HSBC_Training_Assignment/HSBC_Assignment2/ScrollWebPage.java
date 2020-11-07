package HSBC_Training_Assignment.HSBC_Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollWebPage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Browsers\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
	    
	    JavascriptExecutor je = (JavascriptExecutor)driver;	
	    je.executeScript("window.scrollBy(0,400)");
	    
	    driver.close();
	    

	}

}
