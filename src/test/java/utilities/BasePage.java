package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendKeys(String locator, String text) {
        WebElement element = driver.findElement(getBy(locator));
        element.sendKeys(text);
    }

    public void selectDropdownByVisibleText(String locator, String visibleText) {
        WebElement dropdownElement = driver.findElement(getBy(locator));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(visibleText);
    }

    public void click(String locator) {
        WebElement element = driver.findElement(getBy(locator));
        System.out.println("Before clicking"+ element.toString());
        element.click();
    }
    
    public boolean verifyElementPresent(String locator) {
    	System.out.println("Name locator"+locator);
        boolean element = driver.findElement(getBy(locator)).isDisplayed();
		return element;
    }

    private By getBy(String locator) {
        if (locator.startsWith("//")) {
            return By.xpath(locator);
        } else if (locator.startsWith("id=")) {
        	String[] split = locator.split("=");
            return By.id(split[1]);
        } else if (locator.startsWith("name=")) {
        	String[] split = locator.split("=");
            return By.name(split[1]);
        } else if (locator.startsWith("class=")) {
        	String[] split = locator.split("=");
            return By.className(split[1]);
        } else if (locator.startsWith("css=")) {
        	String[] split = locator.split("=");
            return By.cssSelector(split[1]);
        } else if (locator.startsWith("link=")) {
        	String[] split = locator.split("=");
            return By.linkText(split[1]);
        } else if (locator.startsWith("partialLink=")) {
        	String[] split = locator.split("=");
            return By.partialLinkText(split[1]);
        } else {
            // Assuming default is "id"
            return By.xpath(locator);
        }
    }

}
