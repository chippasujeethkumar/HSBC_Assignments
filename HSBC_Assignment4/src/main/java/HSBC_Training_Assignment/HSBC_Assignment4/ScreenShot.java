package HSBC_Training_Assignment.HSBC_Assignment4;






import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShot 
{
	static WebDriver driver;
public static void main(String arg[])
{
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Browsers\\geckodriver.exe");
	driver= new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("https://api.jquery.com/dblclick/");
    driver.manage().window().maximize();
    
}


public static void takeScreenshot(String fileName) {

		  TakesScreenshot scrShot =(TakesScreenshot)driver;

          File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

          File DestFile=new File("D:\\Selenium jar files\\Failing"+fileName+".jpg");
          
          FileUtils.copyFile(SrcFile,DestFile);
}
}
