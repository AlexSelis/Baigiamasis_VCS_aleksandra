package pages.Simka;

import pages.Common;
import pages.Locator;

public class SimkaMainPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOnLoginButton() {
        Common.clickElement(Locator.Simka.MainPage.loginButton);
    }

    public static void inputUserEmail(String userEmail) {
        Common.sendKeysToElement(userEmail, Locator.Simka.MainPage.emailInput);
    }

    public static void inputUserPassword(String userPassword) {
        Common.sendKeysToElement(userPassword, Locator.Simka.MainPage.passwordInput);
    }

    public static void clickOnConfirmationButton() {
        Common.clickElement(Locator.Simka.MainPage.submitLogInButton);
    }

    public static String readElementNameAfterLogin() {
        return Common.getElementText(Locator.Simka.MainPage.elementTextAfterSuccessfulLogin);
    }

    public static String readAlertMessageAfterUnsuccessfulLogIn() {
        return Common.getElementText(Locator.Simka.MainPage.elementTextAfterUnsuccessfulLogin);
    }

    public static void inputSeachKeyWords(String searchKeyWord) {
        Common.sendKeysToElement(searchKeyWord, Locator.Simka.MainPage.searchBoxInput);
    }

    public static void clickOnSearchButton() {
        Common.clickElement(Locator.Simka.MainPage.searchButton);
    }

    public static String readProductSearchFilterMessage() {
        return Common.getElementText(Locator.Simka.MainPage.productSearchFilterMessage);
    }

    public static String readSearchResultWarningMessage() {
        return Common.getElementText(Locator.Simka.MainPage.nothingFoundInSearchMessage);
    }

    public static void clickOnProductCategory() {
        //Common.waitForElementWithVisibilityChange(Locator.Simka.MainPage.categoryButton);
        Common.clickElement(Locator.Simka.MainPage.categoryButton);
    }

    public static void clickOnFirstSuggestedProduct() {
        Common.waitForElementWithVisibilityChange(Locator.Simka.MainPage.firstSuggestedProduct);
        Common.clickElement(Locator.Simka.MainPage.firstSuggestedProduct);
    }

    public static void clickOnFirstSuggestedSize() {
        Common.clickElement(Locator.Simka.MainPage.firstSuggestedSize);
    }

    public static void clickOnButtonAddToCart() {
        Common.clickElement(Locator.Simka.MainPage.buttonAddToCart);
    }

    public static String readProductAddedToCartModal() {
        Common.waitForElementWithVisibilityChange(Locator.Simka.MainPage.successfulAddToCartModalMessage);
        return Common.getElementText(Locator.Simka.MainPage.successfulAddToCartModalMessage);
    }

    public static void clickOnProductSubcategory() {
        Common.clickElement(Locator.Simka.MainPage.subcategoryButton);
    }
}
