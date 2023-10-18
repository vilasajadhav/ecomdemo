package stepDefinations;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LandingPage;
import Utils.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDefination {

	public String offersPageProductName;
	TextContextSetup textcontectsetup;
	
	public LandingPageStepDefination(TextContextSetup textcontectsetup)
	{
		this.textcontectsetup = textcontectsetup;
	}		
	
	@Given("User is on Greencart Landing page")
	public void user_is_on_greencart_landing_page() {

		/*
		 * System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		 * textcontectsetup.driver = new ChromeDriver(); textcontectsetup.driver.get(
		 * "https://rahulshettyacademy.com/seleniumPractise/#/");
		 */
		
	}
	@When("^user searched with shortname (.+) and extracted actual name of the product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_the_product(String shortName) throws InterruptedException {
        
		
		//LandingPage landingpage = new LandingPage(textcontectsetup.driver);
		LandingPage landingpage = textcontectsetup.pageobjectmanager.getLandingPage();
		landingpage.searchItem(shortName);
		//textcontectsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		Thread.sleep(2000);
		textcontectsetup.LandingPageProductName = landingpage.getProductName().split("-")[0].trim();
         System.out.println(textcontectsetup.LandingPageProductName);

		
	}

	
}
