package stepDefinition;

import java.util.List;
import java.util.Map;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

	@Given("User is on registeration page")
	public void user_is_on_registeration_page() {

	}

	@When("user enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
		
		List<List<String>> userList = dataTable.asLists(String.class);   // as list
			
		for(List<String> e : userList)
		{
			System.out.println(e);
		}
	}

	@Then("user registeration should be sucessful")
	public void user_registeration_should_be_sucessful(DataTable dataTable) {
		List<Map<String,String>> userList = dataTable.asMaps(String.class, String.class);
		
		System.out.println(userList.get(0).get("firstName"));
		System.out.println(userList.get(1).get("firstName"));


	}
}
