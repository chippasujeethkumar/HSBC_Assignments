package StepDefinitions;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.CoreMatchers.equalTo;

public class parameter 
{
	Response r;
	@Given("Latest Foreign Exchange rates API given")
	public void latest_Foreign_Exchange_rates_API_given() 
	{
		System.out.println("validating the Past date Scenario");
		System.out.println("API Launching");
	   
	}

	@When("posted with multiple {string} information")
	public void posted_with_multiple_information(String string)
	{
		 RestAssured.given().when().get("https://api.ratesapi.io/api/"+string).then().body("date",equalTo(string));
		  System.out.println(string);
		  r = RestAssured.get("https://api.ratesapi.io/api/"+string);
	}
	@Then("validate Response")
	public void validate_Response()
	{
		Assert.assertEquals(200, r.getStatusCode());	 
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("@Test getting annotation is started");		
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("@Test getting annotation is ending");	
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("we are in the after test");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("we are in the before test");
	}
}


