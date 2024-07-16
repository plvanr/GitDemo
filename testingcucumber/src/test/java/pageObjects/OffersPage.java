package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilits.TestContextSetup;

public class OffersPage {
	By search = By.xpath("//input[@type='search']");
	By productname = By.cssSelector("tr td:nth-child(1)");
	
 	
	public WebDriver driver;
	
	public OffersPage(WebDriver driver) 
	{
		this.driver=driver;
	}


public void serachItem(String shortname) 
{
	driver.findElement(search).sendKeys(shortname);
}

public String getProductName() 
{
	return driver.findElement(productname).getText();
}

public void getSearchText(String name) 
{
	driver.findElement(search).getText();
}




}