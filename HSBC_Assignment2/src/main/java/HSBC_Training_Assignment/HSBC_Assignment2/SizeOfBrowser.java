package HSBC_Training_Assignment.HSBC_Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SizeOfBrowser 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Browsers\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.get("http://www.google.com");
	   
	    
	    Dimension dimension=new Dimension(600,720);
	    driver.manage().window().setSize(dimension);
	    driver.findElement(By.xpath("html/body/div/div[2]/form/div[2]/div/div/div/div[2]/input")).sendKeys("selenium");;
	    System.out.println(driver.manage().window().getSize());
	    driver.close();

	}

}
