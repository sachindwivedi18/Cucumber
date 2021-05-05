package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.lang.reflect.Field;
import org.apache.commons.lang.exception.ExceptionUtils;
import Util.JiraPolicy;
import Util.JiraServiceProvider;
import cucumber.api.cli.Main;


public class JiraListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {

		Object value = null;

		ClassLoader classLoader = Main.class.getClassLoader();

		Class cls;
		try {
			cls = classLoader.loadClass("TestRunners.AmazonTestRunner");

			Object clsObject = cls.newInstance();

			Field[] fields = cls.getFields();
			for (Field field : fields) {
				String name = field.getName();
				value = field.get(clsObject);
				System.out.println("Name : " + name + " Value : " + value);
			}

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean isTicketReady = true; // jiraPolicy.logTicketReady();
		if (isTicketReady) {
			// raise jira ticket:
			System.out.println("is ticket ready for JIRA: " + isTicketReady);
			JiraServiceProvider jiraSp = new JiraServiceProvider("https://learnjiranowrightnow.atlassian.net",
					"sachindwivedi18@gmail.com", "hb8FNqXlzmXrgRCNOcZ4853A", "XPROJ");
			String issueSummary = value + " got failed due to some assertion or exception";

			String issueDescription = result.getThrowable().getMessage() + "\n";
			issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));

			jiraSp.createJiraTicket("Bug", issueSummary, issueDescription, "Sachin");
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}