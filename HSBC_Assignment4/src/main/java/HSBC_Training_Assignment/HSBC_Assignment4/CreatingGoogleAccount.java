package HSBC_Training_Assignment.HSBC_Assignment4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class CreatingGoogleAccount {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Browsers\\geckodriver.exe");
		driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://accounts.google.com/signup");
	    driver.manage().window().maximize();
	    
	    WebElement firstName=driver.findElement(By.id("firstName"));
	    WebElement lastName=driver.findElement(By.id("lastName"));
	    WebElement userName=driver.findElement(By.id("username"));
	    WebElement password=driver.findElement(By.xpath("//input[@name='Passwd']"));
	    WebElement confirmpassword=driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
	    WebElement nextBt=driver.findElement(By.xpath("//span[text()='Next']"));
	    
	    String fName,lName,uName,passsword,cPassword,pNumber,gNumber;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the firstname");
	    fName=s.nextLine();
	    System.out.println("Enter the lastName");
	    lName=s.nextLine();
	    System.out.println("Enter the userName");
	    uName=s.nextLine();
	    System.out.println("Enter the password");
	    passsword=s.nextLine();
	    System.out.println("Enter the confirmpassword");
	    cPassword=s.nextLine();
	    Thread.sleep(3000);
	    
	    firstName.sendKeys(fName);
	    lastName.sendKeys(lName);
	    userName.sendKeys(uName);
	    password.sendKeys(passsword);
	    confirmpassword.sendKeys(cPassword);
	    nextBt.click();
	    
	    System.out.println("Enter the phonenumber");
	    pNumber=s.nextLine();
	    Thread.sleep(3000);
	    
	    WebElement phNo=driver.findElement(By.id("phoneNumberId"));
	    WebElement phNext=driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
	    phNo.sendKeys(pNumber);
	    phNext.click();
	    
	    System.out.println("Enter the Google verification code");
	    gNumber=s.nextLine();
	    Thread.sleep(3000);
	    
	    WebElement gNo=driver.findElement(By.id("code"));
	    WebElement gNext=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div/button/div[2]"));
	    gNo.sendKeys(gNumber);
	    gNext.click();
	    Thread.sleep(3000);
	    
	    //WebElement pNum=driver.findElement(By.xpath("//input[@id='phoneNumberId']"));
	    
	    //pNum.sendKeys(Keys.ENTER);
	    //WebElement recovery=driver.findElement(By.xpath("//input[@type='email']"));
	    WebElement dBrth=driver.findElement(By.xpath("//input[@id='day']"));
	    dBrth.sendKeys("2");
	    WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	    Select drpdn1=new Select(month);
	    drpdn1.selectByIndex(3);
	    WebElement year=driver.findElement(By.xpath("//input[@id='year']"));
	    year.sendKeys("1990");
	    WebElement gender=driver.findElement(By.xpath("//select[@id='gender']"));
	    Select drpdn2=new Select(gender);
	    drpdn2.selectByValue("2");
	    WebElement Next=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]"));
	    //recovery.sendKeys("sujeethkumarrrr@gmail.com"); 
	    Next.click();   
	}
}
