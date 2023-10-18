package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.PageObjectManager;

public class TextContextSetup {
	
	
	public WebDriver driver;
	public String LandingPageProductName;
	public String offersPageProductName;
	public PageObjectManager pageobjectmanager;
	public TestBase testbase;
	public GenericUtilities genericutilities;
	//public ChromeDriver driver;
	
	public TextContextSetup() throws IOException
	{
		testbase = new TestBase();
		pageobjectmanager = new PageObjectManager(testbase.WebDriverManager());
		genericutilities = new GenericUtilities(testbase.WebDriverManager());
	}

}
