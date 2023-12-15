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

    @Test(dataProvider = "logInValidData", priority = 1)
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

    @Test(dataProvider = "logInInvalidData", priority = 2)
    public void testLogInUsingInvalidData(String userEmail, String userPassword) {

        String expectedResult = "Įspėjimas: El. paštas ir/arba slaptažodis nerasti sistemoje.";
        String actualResult;

        SimkaMainPage.clickOnLoginButton();
        SimkaMainPage.inputUserEmail(userEmail);
        SimkaMainPage.inputUserPassword(userPassword);
        SimkaMainPage.clickOnConfirmationButton();
        actualResult = SimkaMainPage.readAlertMessageAfterUnsuccessfulLogIn();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider(name = "searchWithValidData")
    public Object[][] searchUsingValidKeywordsDataProvider() {
        return new Object[][]{
                {"Batai"},
                {"Sijonas"},
                {"Suknele"}
        };
    }

    @Test(dataProvider = "searchWithValidData", priority = 3)
    public void testSearchWithValidData(String searchKeyWord) {
        String expectedResult = "Filtras";
        String actualResult;

        SimkaMainPage.inputSeachKeyWords(searchKeyWord);
        SimkaMainPage.clickOnSearchButton();
        actualResult = SimkaMainPage.readProductSearchFilterMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(actualResult, expectedResult)
        );
    }

    @DataProvider(name = "searchWithInvalidData")
    public Object[][] searchUsingInvalidKeywordsDataProvider() {
        return new Object[][]{
                {"test"},
                {"pagalve"},
                {"humus"}
        };
    }

    @Test(dataProvider = "searchWithInvalidData", priority = 4)
    public void testSearchWithInvalidData(String searchKeyWord) {
        String expectedResult = "Nėra prekės, kuri atitiktų paieškos kriterijus.";
        String actualResult;

        SimkaMainPage.inputSeachKeyWords(searchKeyWord);
        SimkaMainPage.clickOnSearchButton();

        actualResult = SimkaMainPage.readSearchResultWarningMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(actualResult, expectedResult)
        );
    }
    @Test(priority = 5)
    public void testAddProductToCart(){
        String expectedResult = "Pavyko: Jūs patalpinote ";
        String actualResult;

        SimkaMainPage.clickOnProductCategory();
        SimkaMainPage.clickOnProductSubcategory();
        SimkaMainPage.clickOnFirstSuggestedProduct();
        SimkaMainPage.clickOnFirstSuggestedSize();
        SimkaMainPage.clickOnButtonAddToCart();
        actualResult = SimkaMainPage.readProductAddedToCartModal();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
