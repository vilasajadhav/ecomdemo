package stepDefinations;

import java.io.IOException;

import Utils.TextContextSetup;
import io.cucumber.java.After;

public class Hooks {
	
	TextContextSetup textcontectsetup;
	public Hooks(TextContextSetup textcontectsetup)
	{
		this.textcontectsetup = textcontectsetup;
	}
	

     @After
	public void quiteBrowser() throws IOException
	{
		textcontectsetup.testbase.WebDriverManager().quit();
		
	}

}
