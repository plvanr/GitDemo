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
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utilits.TestContextSetup;

public class offersPageStepDefinitions {
public WebDriver driver;	
public String landingPageProduct;
public String offerPageProduct;
TestContextSetup textContextSetup;
PageObjectManager pageObjectManager;

public offersPageStepDefinitions(TestContextSetup textContextSetup) 
{
	this.textContextSetup=textContextSetup;
}

@Then("User searched for {string} Shortname in offers page")
public void user_searched_for_shortname_in_offers_page(String shortName) throws InterruptedException {
	
	switchToOffersPage();
	
	OffersPage offersPage = new OffersPage(textContextSetup.driver);
	offersPage.serachItem(shortName);
	Thread.sleep(2000);
	offerPageProduct = offersPage.getProductName();
}

public void switchToOffersPage() 
{
	//if(textContextSetup.driver.getCurrentUrl().equalsIgnoreCase(landingPageProduct))
	//pageObjectManager=new PageObjectManager(textContextSetup.driver);
	LandingPage landingpage = new LandingPage(textContextSetup.driver);
	landingpage.selectTopDealsPage(landingPageProduct);
	textContextSetup.genericUtlis.SwitchWindowToChild();
}

@Then("Validate product name in offers page matches with Landing Page")
public void validate_product_name_in_offers_page_matches_with_landing_page() {
   Assert.assertEquals(landingPageProduct,offerPageProduct );
   textContextSetup.driver.quit();;
}
}
