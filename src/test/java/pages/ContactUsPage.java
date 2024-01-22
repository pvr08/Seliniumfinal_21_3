package pages;

import org.openqa.selenium.WebDriver;

import StepDefinitions.SetupClass;
import utilities.BasePage;
import utilities.TestUtils;

public class ContactUsPage {
//@vamshi
	
	String projectPath = System.getProperty("user.dir");
	String propertyFile = projectPath + "/project.properties";
	TestUtils utils = new TestUtils(propertyFile);
	
	private WebDriver driver;
    private BasePage basePage;

    public ContactUsPage() {
        this.driver = SetupClass.getDriver();
        this.basePage = SetupClass.getBasePage();
    }
	
}
