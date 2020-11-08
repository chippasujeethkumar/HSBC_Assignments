package StepDefinitions;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ValidatingNegativeScenarioLink 
{
	@Test
	public void m1()
	{
		Response response;
		Header h1=new Header("Accept", "application/json");
			
		response=RestAssured.given().header(h1).get("https://api.ratesapi.io/api/ ");
		System.out.println("Negative Senario1:"+response.getBody().asString());
		
		JsonPath jsonPathEvaluator = response.jsonPath();
		String message1=jsonPathEvaluator.get("error");
	
		Assert.assertEquals(message1,"time data 'api' does not match format '%Y-%m-%d'","An incorrect or incomplete\r\n url");	
	}
	
	@Test
	public void m2()
	{
	Response response1;
	Header h2=new Header("Accept", "application/json");
		
	response1=RestAssured.given().header(h2).get("https://api.ratesapi.io");
	System.out.println("Negative Senario2"+response1.getBody().asString());
	
	JsonPath jsonPathEvaluator1 = response1.jsonPath();
	String message2=jsonPathEvaluator1.get("details");

	Assert.assertEquals(message2,"https://exchangeratesapi.io");
	}}
