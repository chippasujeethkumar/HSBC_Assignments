package HSBC_Training_Assignment.HSBC_Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchpage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Browsers\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.get("http://www.google.com");
	   
	    
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
	    //driver.findElement(By.xpath("html/body/div/div[2]/form/div[2]/div/div/div/div[2]/input")).sendKeys("selenium");
	    System.out.println(driver.manage().window().getSize());
	    
	    driver.close();
	   	    
}

}
