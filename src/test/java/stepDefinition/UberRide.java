package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.testng.Assert;

import Util.JiraPolicy;
import cucumber.api.java.en.And;

@JiraPolicy(logTicketReady = true)
public class UberRide {

	@Given("^User wants to select a car type \"([^\"]*)\" from uber app$")
	public void user_wants_to_select_a_car_type_from_uber_app(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Uber working.............");
		
		Assert.assertEquals("Uo", "to00000");
//	    throw new PendingException();
	}

	@When("^user selects car \"([^\"]*)\" and pick up point \"([^\"]*)\" and drop location \"([^\"]*)\"$")
	public void user_selects_car_and_pick_up_point_and_drop_location(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	@Then("^Driver starts the journey$")
	public void driver_starts_the_journey() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	@Then("^Driver ends the journey$")
	public void driver_ends_the_journey() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}
	
	@Then("^User pays (\\d+) USD$")
	public void user_pays_USD(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
	}

}