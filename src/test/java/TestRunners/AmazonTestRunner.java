package TestRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/AppFeature/",
		glue= {"stepDefinition","MyHooks"}, // Give package name of hooks
		plugin= {"pretty","json:target/MyReports/report.json"  
				,"html:target/cucumber-html-report"
				,"junit:target/MyReports/report.xml" , 
				"junit:target/MyReports/cucumber-results.xml",
				"pretty","json:target/MyReports/cucumber.json"
				,"Reporters.ScenarioReporter"
				},
		tags="@Smoke or @Regression", // those scenario who has either regression or smoke. and means scenario that has both tags regression and smoke
		           // @not mens don't execute which has not otherwise all.
		monochrome = true
		) 
public class AmazonTestRunner {

}