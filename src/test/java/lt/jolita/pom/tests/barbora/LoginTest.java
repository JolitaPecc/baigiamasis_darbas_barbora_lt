package lt.jolita.pom.tests.barbora;

import lt.jolita.pom.pages.barbora.LoginPage;
import lt.jolita.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Override
    @BeforeMethod
    public void setUp() {
        LoginPage.openUrl("https://www.barbora.lt/");
        LoginPage.closeCookiePopup();
    }

    @Test
    public void testPositiveLogin(){
        String myEmail = "peciokiene.jolita@gmail.com";
        String myPassword = "Oranzinis5";
        String expectedResult = "€0,00";
        String actualResult;

        LoginPage.clickOnPrisijungti();
        LoginPage.writeEmail(myEmail);
        LoginPage.writePassword(myPassword);
        LoginPage.clickOnLoginSubmit();
        actualResult = LoginPage.readCartContentIsZero();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s".formatted(expectedResult, actualResult)
        );
    }

    @Test
    public void testLoginNegative(){
        String myEmail = "jolita@gmail.co";
        String myPassword = "Oran";
        String expectedResult = "Neteisingas";

        LoginPage.clickOnPrisijungti();
        LoginPage.writeEmail(myEmail);
        LoginPage.writePassword(myPassword);
        LoginPage.clickOnLoginSubmit();
        String actualResult = LoginPage.readErrorMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s".formatted(actualResult, expectedResult)
        );
    }

    @Test
    public void testSearchBarForProductMajonezas() {
        String searchFor = "majonezas";
        String expectedResult = "majonezas";
        String actualResult;

        LoginPage.searchForGoods(searchFor);
        LoginPage.initiateSearch();
        actualResult = LoginPage.readResultsFound();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s".formatted(expectedResult, actualResult)
        );
    }
}
