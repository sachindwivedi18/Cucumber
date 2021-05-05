package stepDefinition;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import Util.JiraPolicy;
//import io.cucumber.datatable.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumber.api.DataTable;

@JiraPolicy(logTicketReady = true)
public class Register {

	@Given("^User is on registeration page$")
	public void user_is_on_registeration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	@When("^user enters following user details$")
	public void user_enters_following_user_details(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
	}

	@Then("^user registeration should be sucessful$")
	public void user_registeration_should_be_sucessful(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
	}

}
