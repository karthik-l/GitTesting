package com.gittesting.stepdefinition;

import cucumber.api.java.en.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
		System.out.println("Test Sample");
	}

	@Then("^Program completed$")
	public void program_completed() throws Throwable {
	}
}
