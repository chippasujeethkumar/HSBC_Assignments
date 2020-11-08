package StepDefinitions;



import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class NegativeScenarioStepdefFile 
{
	Response response;
	Header h1;
	@Given("Rates API for Latest Foreign Exchange rates Incorrect URL")
	public void rates_API_for_Latest_Foreign_Exchange_rates_error_URL() 
	{		
		h1=new Header("Accept", "application/json");			
	}

	@When("The API response is giving error")
	public void the_API_response_is_giving_error() 
	{
		response=RestAssured.given().header(h1).get("https://api.ratesapi.io/api/ ");
		System.out.println(response.getBody().asString());
	}

	@Then("Check the response of the code")
	public void check_the_response_of_the_code() 
	{
		JsonPath jsonPathEvaluator = response.jsonPath();
		String name=jsonPathEvaluator.get("error");
		System.out.println("error message in the response:"+name);
		Assert.assertEquals(name,"time data 'api' does not match format '%Y-%m-%d'");
	}

}
