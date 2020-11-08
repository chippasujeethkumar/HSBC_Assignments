package StepDefinitions;




import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class NegativeScenario 
{
	@Test
	public void test_01()
	{
		Response response;
		Header h1=new Header("Accept", "application/json");
		
		
		response=RestAssured.given().header(h1).get("https://api.ratesapi.io/api/ ");
		System.out.println(response.getBody().asString());
		
		JsonPath jsonPathEvaluator = response.jsonPath();
		String name=jsonPathEvaluator.get("error");
		System.out.println("error message in the response:"+name);
		
		
		Assert.assertEquals(name,"time data 'api' does not match format '%Y-%m-%d'");
		RestAssured.given().when().log().all().get("https://api.ratesapi.io/api/ ").then().log().all();
		
		
	}
}
