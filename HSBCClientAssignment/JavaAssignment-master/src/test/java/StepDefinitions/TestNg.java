package StepDefinitions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TestNg 
{
	
//	@BeforeMethod
//	public void beforeMethod()
//	{
//		System.out.println("@Test getting annotation is started");		
//	}
//	@AfterMethod
//	public void afterMethod()
//	{
//		System.out.println("@Test getting annotation is ending");	
//	}
//	
//	@AfterTest
//	public void aftertest()
//	{
//		System.out.println("we are in the after test");
//	}
//	
//	@BeforeTest
//	public void beforetest()
//	{
//		System.out.println("we are in the before test");
//	}
	

	@Test
	public void testing() {
	Response response;
	Header h1=new Header("Accept","application/json");
	
	response=RestAssured.given().header(h1).get("http://dummy.restapiexample.com/api/v1/employee/1");
	System.out.println(response.getBody().asString());
	
	JsonPath jsonPathEvaluator = response.jsonPath();
	String status = jsonPathEvaluator.get("status");
	String eMail = jsonPathEvaluator.get("id");
	System.out.println("Status of the response is: " +status);
	System.out.println("eMail Value is: " +eMail);
	System.out.println("Time Response is:"+response.getStatusCode());
	System.out.println("Headers of Responses:"+response.getHeader("id"));
	System.out.println("Headers of Responses:"+response.getHeader("data"));
	}}
