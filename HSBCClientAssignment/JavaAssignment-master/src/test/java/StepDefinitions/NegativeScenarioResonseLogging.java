package StepDefinitions;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class NegativeScenarioResonseLogging 
{
	Response response;
	Header h1;
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
		h1=new Header("Accept", "application/json");
	}

	@When("posted with future date information")
	public void posted_with_future_date_information() {
		response=RestAssured.given().header(h1).get("https://api.ratesapi.io/api/ ");
		System.out.println(response.getBody().asString());
	}

	@Then("validate positive response code received Store the response into response object")
	public void validate_positive_response_code_received_Store_the_response_into_response_object() {
		JsonPath jsonPathEvaluator = response.jsonPath();
		String name=jsonPathEvaluator.get("error");
		System.out.println("error message in the response:"+name);
		
		Assert.assertEquals(name,"time data 'api' does not match format '%Y-%m-%d'");
		RestAssured.given().when().log().all().get("https://api.ratesapi.io/api/ ").then().log().all();
	   
	}

}




//@Test
//public void test_01()
//{
//	Response response;
//	Header h1=new Header("Accept", "application/json");
//	
//	
//	response=RestAssured.given().header(h1).get("https://api.ratesapi.io/api/ ");
//	System.out.println(response.getBody().asString());
//	
//	JsonPath jsonPathEvaluator = response.jsonPath();
//	String name=jsonPathEvaluator.get("error");
//	System.out.println("error message in the response:"+name);
//	
//	
//	Assert.assertEquals(name,"time data 'api' does not match format '%Y-%m-%d'");
//	RestAssured.given().when().log().all().get("https://api.ratesapi.io/api/ ").then().log().all();
//	
//	
//}
