package HSBC_Training_Assignment.HSBC_Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropScript
{
	 WebDriver driver;
		@BeforeMethod
		public void setUp()
		{
		System.setProperty("webdriver.gecko.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Browsers\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.get("https://jqueryui.com/droppable/");
	    driver.manage().window().maximize();	    
		}
		@AfterMethod
		public void close()
		{
		   driver.close();
		}
		
		@Test
		public void test()
		{
			System.out.println("hi");
			System.out.println(driver.findElements(By.tagName("iframe")).size());
			System.out.println("iam in");
			WebElement frameElement=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(0);
		    WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		    WebElement trgt=driver.findElement(By.xpath("//div[@id='droppable']"));		    
//		    WebElement src=driver.findElement(By.xpath("//html[@lang='en']/body/div/p[1]"));
//		    WebElement trgt=driver.findElement(By.xpath("//html[@lang='en']/body/div/p[2]"));
//		    WebElement src=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
//		    WebElement trgt=driver.findElement(By.xpath("//p[text()='Drop here']"));		
		    Actions builder=new Actions(driver);
		    Action drganddrp=builder.dragAndDrop(src,trgt).build();
		    drganddrp.perform();
		}

}
