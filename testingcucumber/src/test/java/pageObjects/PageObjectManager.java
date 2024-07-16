package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPage landingPage;
	public OffersPage offersPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void getLandingPage()
	{
		landingPage= new LandingPage(driver);
		return;
	}
	
	public void OffersPage() 
	{
		offersPage = new OffersPage(driver);
		return;
	}

}
