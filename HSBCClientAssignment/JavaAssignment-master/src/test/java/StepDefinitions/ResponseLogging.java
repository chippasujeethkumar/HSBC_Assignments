package StepDefinitions;




import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ResponseLogging 
{
	@Test
	public void test_01()
	{
		Response response;
		Header h1=new Header("Accept", "application/json");
		
		response=RestAssured.given().header(h1).get("https://api.ratesapi.io/api/2010-01-12");
		System.out.println(response.getBody().asString());
		
		JsonPath jsonPathEvaluator = response.jsonPath();
		String basevalue = jsonPathEvaluator.get("base");
		System.out.println("Base Value is: " +basevalue);
		
		Assert.assertEquals(basevalue,"EUR");	
	
		RestAssured.given().when().log().all().get("https://api.ratesapi.io/api/2010-01-12").then().log().all();
	}

}
