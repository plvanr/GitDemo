package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	
	@Given("User is on netbanking login page")
	public void user_is_on_netbanking_login_page() 
	{
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("User Landed on Netbanking Page");
	   
	}
	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String username, String password) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(username + "and password is" + password);
	  
	}
	@Then("Login Page should be disaplayed")
	public void login_page_should_be_disaplayed() 
	{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Page got displayed");
	  
	}
	@Then("Account balance should be displayed")
	public void account_balance_should_be_displayed() 
	{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Account Balance Displayed");	
	   
	}
	@Given("Setup entries in Database")
	public void setupEntries() 
	{
		System.out.println("************************");
		System.out.println("Setup entries in Database");
	}
	
	@When("launch browser")
	public void launchBrowser() 
	{
		System.out.println("Launch the Browser");
	}
	@When("Hit the home page url from Browswer")
	public void hitUrl()
	{
		System.out.println("Hit the home page url from Browswer");
	}	
}