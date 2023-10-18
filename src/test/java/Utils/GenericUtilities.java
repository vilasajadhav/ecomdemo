package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtilities {
	
	WebDriver driver;
	public GenericUtilities(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void SwitchToChildWindow() 
	{
	
    Set<String> s1 =  driver.getWindowHandles();
    Iterator<String> l1 =  s1.iterator();
    String parentWindow = l1.next();
    String childWindow = l1.next();
    driver.switchTo().window(childWindow);
	}
}
