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
            public static By elementTextAfterUnsuccessfulLogin = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
            public static By searchBoxInput = By.xpath("//input[@name='search' and @placeholder='Paieška']");
            public static By searchButton = By.xpath("//button[@class='search-button']");
            public static By productSearchFilterMessage = By.xpath("//span[contains(text(),'Filtras')]");
            public static By nothingFoundInSearchMessage = By.xpath("//p[contains(text(),'Nėra prekės, kuri atitiktų paieškos kriterijus.')]");
            public static By categoryButton = By.xpath("//a[@href='https://simka.lt/drabuziai-moterims' and @class='dropdown-toggle']");
            public static By firstSuggestedProduct = By.xpath("//div[@class='product-layout  '][1]");
            public static By firstSuggestedSize = By.xpath("//span[@class='option-value'][1]");
            public static By buttonAddToCart = By.xpath("//a[@id='button-cart']");
            public static By successfulAddToCartModalMessage = By.xpath("//div[@class='notification-text']");
            public static By subcategoryButton = By.xpath("//span[contains(text(),'Suknelės') and @class='links-text']");
        }
    }
}
