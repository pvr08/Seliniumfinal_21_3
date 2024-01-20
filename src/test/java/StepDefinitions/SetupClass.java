package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.BasePage;
import utilities.TestUtils;

public class SetupClass {

    private static WebDriver driver;
    private static BasePage basePage;

    @SuppressWarnings("deprecation")
	@Before
    public void setUp() {
        String projectPath = System.getProperty("user.dir");
        String propertyFile = projectPath + "/project.properties";
        TestUtils utils = new TestUtils(propertyFile);

        System.out.println("Setting up the browser");
        System.setProperty(utils.getProperty("Chrome"), projectPath + utils.selectFromChain("SelectedVersion"));

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        basePage = new BasePage(driver);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static BasePage getBasePage() {
        return basePage;
    }
    
    @After
    public void tearDown() {
        if (driver != null) {
            System.out.println("Closing the browser");
            driver.quit();
        }
    }
}
