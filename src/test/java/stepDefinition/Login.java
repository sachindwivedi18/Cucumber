package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	
	@Given("user is on App page")
	public void user_is_on_app_page() {

	}

	@When("user clicks on sign in button")
	public void user_clicks_on_sign_in_button() {

	}

	@Then("user is displayed on login screen")
	public void user_is_displayed_on_login_screen() {

	}

	@When("user enters {string} in username")
	public void user_enters_in_username(String user) {
			System.out.println("Username is "+user);
	}

	@Then("failed error message appears")
	public void failed_error_message_appears() {

	}



}