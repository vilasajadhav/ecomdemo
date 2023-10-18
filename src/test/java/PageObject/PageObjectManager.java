package PageObject;

import org.openqa.selenium.WebDriver;

import Utils.GenericUtilities;

public class PageObjectManager {
	
	
	public WebDriver driver;
	public LandingPage landingpage;
	public OffersPage offerspage;

	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	public LandingPage getLandingPage() 
	{
		landingpage = new LandingPage(driver);
		return landingpage;
	}
	
	public OffersPage getOffersPage() 
	{
		offerspage = new OffersPage(driver);
		return offerspage;
		
	}
	
}
