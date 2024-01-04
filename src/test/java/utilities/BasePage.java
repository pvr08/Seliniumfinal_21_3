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
        WebElement element = driver.findElement(By.xpath(locator));
        element.sendKeys(text);
    }

    public void selectDropdownByVisibleText(String locator, String visibleText) {
        WebElement dropdownElement = driver.findElement(By.xpath(locator));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(visibleText);
    }

    public void click(String locator) {
        WebElement element = driver.findElement(By.xpath(locator));
        System.out.println("Before clicking"+ element.toString());
        System.out.println("Before clicking"+ locator);

        element.click();
    }

    private By getBy(String locator) {
        if (locator.startsWith("//")) {
            return By.xpath(locator);
        } else if (locator.startsWith("id=")) {
            return By.id(locator.substring(3));
        } else if (locator.startsWith("name=")) {
            return By.name(locator.substring(5));
        } else if (locator.startsWith("class=")) {
            return By.className(locator.substring(6));
        } else if (locator.startsWith("css=")) {
            return By.cssSelector(locator.substring(4));
        } else if (locator.startsWith("link=")) {
            return By.linkText(locator.substring(5));
        } else if (locator.startsWith("partialLink=")) {
            return By.partialLinkText(locator.substring(12));
        } else {
            // Assuming default is "id"
            return By.id(locator);
        }
    }

}
