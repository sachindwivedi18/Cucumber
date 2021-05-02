package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

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
	
	@BeforeStep
	public void takeScreenshot()
	{
		System.out.println("take screenshot");
	}
	
	@AfterStep
	public void refresh()
	{
		System.out.println("refresh");
	}
}
