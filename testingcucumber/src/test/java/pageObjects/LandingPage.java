package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilits.TestContextSetup;

public class LandingPage {
	By search = By.xpath("//input[@type='search']");
	By productname = By.cssSelector("h4.product-name");
	By topDealsPage = By.linkText("Top Deals");
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
	}


public void serachItem(String name) 
{
	driver.findElement(search).sendKeys(name);
}

public String getProductName() 
{
	return driver.findElement(productname).getText();
}

public void getSearchText(String name) 
{
	driver.findElement(search).getText();
}

public void selectTopDealsPage(String name) 
{
	driver.findElement(topDealsPage).click();
}


}