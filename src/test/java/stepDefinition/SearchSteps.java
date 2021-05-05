package stepDefinition;

import org.testng.Assert;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import Util.JiraPolicy;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@JiraPolicy(logTicketReady = true)
public class SearchSteps {

	Product product;
	Search search;

	@Given("^I have a search field on Amazon Page$")
	public void i_have_a_search_field_on_Amazon_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		Assert.assertEquals("Uo", "to00000");

	}

	@When("^I search for a product with name \"([^\"]*)\" and price (\\d+)$")
	public void i_search_for_a_product_with_name_and_price(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	@Then("^Product with \"([^\"]*)\" should be displayed$")
	public void product_with_should_be_displayed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

}
