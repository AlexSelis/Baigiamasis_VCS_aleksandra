package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Common {
    public static void setUpChrome() {
        Driver.setUpChromeDriver();
    }

    public static void quitDriver() {
        Driver.quitDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeysToElement(String keys, By locator) {
        getElement(locator).sendKeys(keys);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }
}
