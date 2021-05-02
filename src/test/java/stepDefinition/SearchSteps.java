package stepDefinition;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	Product product;
	Search search;

	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {

	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String name, Integer price) {

			product = new Product(name, price);
	}

	@Then("Product with {string} should be displayed")
	public void product_with_should_be_displayed(String prodName) {
		search = new Search();
		System.out.println("Searched prod is "+search.displayProduct(product));
	}
}