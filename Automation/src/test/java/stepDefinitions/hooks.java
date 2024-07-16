package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;


public class hooks {
	@Before("@Netbanking")
	public void netBankingStepup()
	{
		System.out.println("-------------------");
	}
	@After("@Mortagage")
	public void user()
	{
		System.out.println("_____________________");
	}
	//Before->Background -> Scenario-> After
}


