package tests.Simka;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Simka.SimkaMainPage;
import tests.TestBase;

public class SimkaMainPageTest extends TestBase {
    @BeforeMethod
    public void setUp() {
        SimkaMainPage.openUrl("https://simka.lt/");
    }

    @DataProvider(name = "logInValidData")
    public Object[][] provideDataForValidLogin() {
        return new Object[][]{
                {"test.benuTest@gmail.com", "Test1Test"}
        };
    }
    @DataProvider(name = "logInInvalidData")
    public Object[][] provideDataForInvalidLogin() {
        return new Object[][]{
                {"test.benst@gmail.com", "Test1Test"},
                {"test.benuTest@gmail.com", "Tesest"}
        };
    }

    @Test(dataProvider = "logInValidData")
    public void testLoginUsingValidData(String userEmail, String userPassword) {
        String expectedResult = "Mano paskyra";
        String actualResult;

        SimkaMainPage.clickOnLoginButton();
        SimkaMainPage.inputUserEmail(userEmail);
        SimkaMainPage.inputUserPassword(userPassword);
        SimkaMainPage.clickOnConfirmationButton();

        actualResult = SimkaMainPage.readElementNameAfterLogin();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(dataProvider = "logInInvalidData")
    public void testLogInUsingInvalidData(String userEmail, String userPassword){

        String expectedResult = "Įspėjimas: El. paštas ir/arba slaptažodis nerasti sistemoje.";
        String actualResult;

        SimkaMainPage.clickOnLoginButton();
        SimkaMainPage.inputUserEmail(userEmail);
        SimkaMainPage.inputUserPassword(userPassword);
        SimkaMainPage.clickOnConfirmationButton();

        actualResult = SimkaMainPage.readAlertMessageAfterUnsuccessfulLogIn();

        Assert.assertEquals(actualResult,expectedResult);

    }

}
