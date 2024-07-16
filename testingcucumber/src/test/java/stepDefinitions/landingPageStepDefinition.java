package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utilits.TestContextSetup;

public class landingPageStepDefinition {
public WebDriver driver;	
public String landingPageProduct;
public String offerPageProduct;
TestContextSetup textContextSetup;
// constructer
public landingPageStepDefinition(TestContextSetup textContextSetup) 
{
	this.textContextSetup=textContextSetup;
}

	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\plvan\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		textContextSetup.driver = new ChromeDriver();
		textContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	    
	}
	@When("User searched with Shortname {string} and extract actual name of the product")
	public void user_searched_with_shortname_and_extract_actual_name_of_the_product(String shortName) throws InterruptedException {
		LandingPage landingpage = new LandingPage(textContextSetup.driver);
		landingpage.serachItem(shortName);
		Thread.sleep(2000);
		textContextSetup.landingPageProductName = landingpage.getProductName().split("-")[0].trim();
		System.out.println(textContextSetup.landingPageProductName + " is extracted from Home Page");
	   
	   
	}



}
