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

    @DataProvider(name = "logInData")
    public Object[][] provideDataForLogIn() {
        return new Object[][]{
                {"test.benuTest@gmail.com", "Test1Test"}
        };
    }

    @Test(dataProvider = "logInData")
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
}
