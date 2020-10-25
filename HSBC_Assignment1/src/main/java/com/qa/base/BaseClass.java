package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() 
	{		
		prop=new Properties();
		FileInputStream ip = null;
		try {
			ip = new FileInputStream("D:\\eclipse-java-photon-R-win32-x86_64\\Workspace\\HSBC_Assignment1\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (IOException e) {	
			e.printStackTrace();
		}		
	}
	public static void initalization() 
	{
		String site=prop.getProperty("url");
		String browserName=prop.getProperty("browser");
		
		System.out.println("Url of the Site is:"+site);
		System.out.println("Browser Used:"+browserName);
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Workspace\\HSBC_Assignment1\\Browserjarfiles\\chromedriver.exe");
		driver=new ChromeDriver();	
	}
	if(browserName.equals("FF"))
	{
		
		System.setProperty("webdriver.gecko.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Workspace\\HSBC_Assignment1\\Browserjarfiles\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	
	driver.get(site);
}
}
