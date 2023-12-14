package pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Simka {
        public static class MainPage {

            public static By loginButton = By.xpath("//a[@class='dropdown-toggle'][1]");
            public static By emailInput = By.xpath("//input[@id='input-email']");
            public static By passwordInput = By.xpath("//input[@id='input-password']");
            public static By submitLogInButton = By.xpath("//button[@type='submit' and @data-loading-text='<span>Prisijungti</span>']");
            public static By elementTextAfterSuccessfulLogin = By.xpath("//h1[text()='Mano paskyra']");
        }
    }
}
