package HSBC_Training_Assignment.HSBC_Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeys {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Browsers\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.get("http://www.google.com");
	    
	    JavascriptExecutor je = (JavascriptExecutor)driver;	
	    WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
	    je.executeScript("arguments[0].value='selenium'",search);
	    
	    
	    driver.close();

	}

}
