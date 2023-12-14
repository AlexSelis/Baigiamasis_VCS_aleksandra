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
}
