package HSBC_Training_Assignment.HSBC_Assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyingPincode {

	public static void main(String[] args)
	{
		int count1=0,count2=0;
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Browsers\\geckodriver.exe");
		driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://chennaiiq.com/chennai/pincode-by-name.php");
	    driver.manage().window().maximize();
	    
	    
	    List<WebElement> elements=driver.findElements(By.xpath("/html/body/table/tbody/tr[3]/td[2]/table[1]/tbody/tr/td[3]"));
	    
	    
	    ArrayList<String> pincodes=new ArrayList<String>();
	    System.out.println("size is:"+elements.size());
	    for(int i=0;i<elements.size();i++)
	    {
	    	pincodes.add(elements.get(i).getText());
	    	System.out.print(elements.get(i).getText());
	    }
	    
	    HashSet<String> names=new HashSet<String>();
	    
	    System.out.println("-----------Dublicate pincodes---------------------");
	    for(String pincode: pincodes)
	    {
	    	if(!names.add(pincode)==false)
	    	{
	    		count1++;
	    		System.out.println("--------------------------------------------");
	    		System.out.println(pincode);
	    		System.out.println("--------------------------------------------");
	    	}
	    }
	    //299,113
	    System.out.println("Above are dublicate pincodes and count of those pincodes are:"+count1);	
	}
}
