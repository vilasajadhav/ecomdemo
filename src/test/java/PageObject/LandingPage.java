package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By search = By.xpath("//input[@type='search']");
	By ProductName = By.cssSelector("h4.product-name");
	By topdeals = By.linkText("Top Deals");
	
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	
	public String getProductName()
	{
	return driver.findElement(ProductName).getText();
	}

	public void topDealsPage()
	{
		driver.findElement(topdeals).click();
	}



}
