package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
	features="src/test/resources/Features/googleSearch.feature", //file name to be executed should go here( can be multiple as array)
	glue= {"StepDefinitions","pages"}, // where are our step definitions are present
	monochrome = true,
	plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
	)
public class TestRunner {
	
}
