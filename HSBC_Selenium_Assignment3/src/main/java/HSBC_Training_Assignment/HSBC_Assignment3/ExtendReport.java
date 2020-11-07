package HSBC_Training_Assignment.HSBC_Assignment3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class ExtendReport 
{
	public static void main(String[] args)
		{
			ExtentHtmlReporter reporter=new ExtentHtmlReporter("D:\\HSBC\\HSBC_Final\\extendreport.html");			
			ExtentReports extent=new ExtentReports();
			extent.attachReporter(reporter);
			ExtentTest test1=extent.createTest("Google search test","test to validate google functionality");
			
			System.setProperty("webdriver.chrome.driver","D:\\Selenium jar files\\chrome86\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		    
		    test1.log(Status.INFO, "Starting testcase");
		    driver.get("http://www.google.com");
		    test1.log(Status.PASS, "Navigating to google page");
		    test1.info("Test completed");
		    extent.flush();
		    
		
		}
	
}
