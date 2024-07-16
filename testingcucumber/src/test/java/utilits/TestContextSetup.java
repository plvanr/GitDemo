package utilits;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;	
	public String landingPageProduct;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtlis genericUtlis;
	
	public TestContextSetup() 
	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtlis = new GenericUtlis(testBase.WebDriverManager());
	}
}
