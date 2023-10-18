package stepDefinations;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LandingPage;
import PageObject.OffersPage;
import PageObject.PageObjectManager;
import Utils.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OffersPageStepDefination {
	
	
	
	TextContextSetup textcontectsetup;
	PageObjectManager pageobjectmanager;
	
	public OffersPageStepDefination(TextContextSetup textcontectsetup)
	{
		this.textcontectsetup = textcontectsetup;
	}
	
	
	@Then("^user searched (.+) shortname is offers page$")
	public void user_searched_same_shortname_is_offers_page(String shortName) throws InterruptedException {
		
		switchToWindow();
		
		OffersPage offerpage  = textcontectsetup.pageobjectmanager.getOffersPage();
		//OffersPage offerpage = new OffersPage(textcontectsetup.driver);
		
		offerpage.searchItem(shortName);
        //textcontectsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
        Thread.sleep(2000);
        textcontectsetup.offersPageProductName = offerpage.productName();
   
	}
	
	public void switchToWindow() throws InterruptedException 
	{
		
		//pageobjectmanager = new PageObjectManager(textcontectsetup.driver);
		LandingPage landingpage = textcontectsetup.pageobjectmanager.getLandingPage();
		
		//LandingPage landingpage = new LandingPage(textcontectsetup.driver);
		landingpage.topDealsPage();
		Thread.sleep(2000);
		textcontectsetup.genericutilities.SwitchToChildWindow();
		
	}

	@Then("validate product name in offers page matched with landing page")
	public void validate_product_name_in_offers_page()
	{
		
		Assert.assertEquals(textcontectsetup.offersPageProductName, textcontectsetup.LandingPageProductName);
		
	}
	
	
	
}
