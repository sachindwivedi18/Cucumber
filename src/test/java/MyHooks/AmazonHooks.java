package MyHooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonHooks {

	
	@Before("@Smoke")    // Will execute only for Smoke test cases
	public void setup(Scenario sc)
	{
		sc.getName(); // scenario name
		System.out.println("Beforeeeeeeeeeeeeeeeeeeeeeee 1");
	}

	@Before(order=2)
	public void setup2()
	{
		System.out.println("Beforeeeeeeeeeeeeeeeeeeeeeee 2");
	}

	
	@After(order=1)
	public void teardown()
	{
		System.out.println("Afterrrrrrrrrrrrrrrrrrrrrrrrrr 1");
	}
	
	@After(order=2)
	public void teardown2()
	{
		System.out.println("Afterrrrrrrrrrrrrrrrrrrrrrrrrr 2");
	}
	
	@Before
	public void takeScreenshot()
	{
		System.out.println("take screenshot");
	}
	
	@After
	public void refresh()
	{
		System.out.println("refresh");
	}
}
