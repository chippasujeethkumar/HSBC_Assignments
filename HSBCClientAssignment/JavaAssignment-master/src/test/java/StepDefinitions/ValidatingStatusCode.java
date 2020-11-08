package StepDefinitions;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class ValidatingStatusCode 
{
	@Test
	public void status()
	{
		Response response;
		Header h1=new Header("Accept", "application/json");
		
		response=RestAssured.given().header(h1).get("https://api.ratesapi.io/api/2010-01-12");
		System.out.println(response.getBody().asString());
		
		
		int statusCode=response.getStatusCode();
		String statusLine=response.getStatusLine();
		
		Assert.assertEquals(statusCode,200);
		Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
		
			
	}

}
