package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.GooglePage;

public class GooglePageTest extends BaseClass
{
	GooglePage googlepage;
	
	GooglePageTest()
	{
		super();
	}
	
	
	@BeforeSuite
	public void beforeSuiteMethod()
	{
		
		System.out.println("we are in beforeSuiteMethod");
	}
	@AfterSuite
	public void afterSuiteMethod()
	{
		
		System.out.println("we are in afterSuiteMethod");
	}
	@BeforeTest
	public void BeforeTestMethod()
	{
		System.out.println("we are in  BeforeTestMethod");
		
	}
	@AfterTest
	public void afterTestMethod()
	{
		
		System.out.println("we are in afterTestMethod");
	}
	
	
	@BeforeClass
	public void classBeforeMethod()
	{
		
		System.out.println("we are in classBeforeMethod");
	}
	@AfterClass
	public void classAfterMethod()
	{
		
		System.out.println("we are in classAfterMethod");
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initalization();
		googlepage=new GooglePage();
		
	}
	
	@AfterMethod
	public void closee()
	{
		driver.quit();
	}
	
	
	@Test
	public void GooglePageLogoTest()
	{
		boolean logo=googlepage.validatelogo();
		Assert.assertTrue(logo);
	}
	
	
	
	
	

}
