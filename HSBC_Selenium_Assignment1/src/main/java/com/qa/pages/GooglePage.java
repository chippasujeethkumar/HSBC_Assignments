package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class GooglePage extends BaseClass
{
	public GooglePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="hplogo")
	WebElement logo;
	
	public boolean validatelogo()
	{
		return logo.isDisplayed();	
	}
	
}
