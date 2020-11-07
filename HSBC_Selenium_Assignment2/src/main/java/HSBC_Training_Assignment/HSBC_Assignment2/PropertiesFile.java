package HSBC_Training_Assignment.HSBC_Assignment2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesFile 
{
	public static void main(String[] args) 
	{
		Properties prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream("D:\\eclipse-java-photon-R-win32-x86_64\\Workspace\\HSBC_Assignment2\\src\\main\\java\\HSBC_Training_Assignment\\HSBC_Assignment2\\properties");
			prop.load(ip);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				
		System.setProperty("webdriver.gecko.driver",prop.getProperty("path"));
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.get(prop.getProperty("url"));
	    
	    System.out.println("URL of the site is :"+prop.getProperty("url"));
	    
	    driver.close();

	}
}
