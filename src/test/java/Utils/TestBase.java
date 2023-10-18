package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	WebDriver driver;
	public WebDriver WebDriverManager() throws IOException
	
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//ResourceFiles//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		
		if(driver==null)
		{
			
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//ResourceFiles//chromedriver.exe");
	driver = new ChromeDriver();

		
		//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			}
			driver.get(url);
		}
		return driver;
	}

}
