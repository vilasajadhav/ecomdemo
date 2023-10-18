package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\feature\\searchProduct.feature",
glue="stepDefinations", monochrome=true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	
	// Parallel test cases runner
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios(); 
	}

}
