package HSBC_Training_Assignment.HSBC_Assignment4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MedicalRecord {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Browsers\\geckodriver.exe");
		driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
	    driver.manage().window().maximize();
	    
	    
	    Thread.sleep(1000);
	    WebElement medicalRecord=driver.findElement(By.xpath("/html/body/div/div[1]/div/ul/li[2]/a"));
	    medicalRecord.click();
	    Thread.sleep(1000);
	    WebElement searchPatient=driver.findElement(By.xpath("/html/body/div/div[2]/div/h2[1]/a"));
	    searchPatient.click();
	    WebElement dropdown=driver.findElement(By.xpath("//select[@id='search_type']"));
	    Select drpdn=new Select(dropdown);
	    drpdn.selectByValue("3");
	    WebElement search=driver.findElement(By.id("search_patient"));
	    search.click();
	    driver.quit();
	   

	}

}
