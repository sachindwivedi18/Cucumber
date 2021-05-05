
package stepDefinition;

import org.testng.Assert;

import Util.JiraPolicy;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@JiraPolicy(logTicketReady = true)
public class Login {

	@Given("^user is on App page$")
	public void user_is_on_App_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	@When("^user clicks on sign in button$")
	public void user_clicks_on_sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
	}

	@Then("^user is displayed on login screen$")
	public void user_is_displayed_on_login_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	@When("^user enters \"([^\"]*)\" in username$")
	public void user_enters_in_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	@Then("^failed error message appears$")
	public void failed_error_message_appears() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}


}