package lt.jolita.pom.tests.barbora;

import lt.jolita.pom.pages.barbora.ReceptaiPage;
import lt.jolita.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReceptaiTest extends TestBase {
    @Override
    @BeforeMethod
    public void setUp() {
        ReceptaiPage.openUrl("https://www.barbora.lt");
        ReceptaiPage.closeCookiePopup();
        ReceptaiPage.doLogin();
    }

    @Test
    public void testAddRequiredProductsForSelectedRecipeToCart() {
        String myRecipeName = "varškės blynai";
        String expectedResult = "Pirkti";
        String actualResult;

        ReceptaiPage.waitForPageReceptaiToBeVisible();
        ReceptaiPage.openPageReceptai();
        ReceptaiPage.enterRecipeName(myRecipeName);
        ReceptaiPage.initiateSearch();
        ReceptaiPage.clickOnRecipeTab();
        ReceptaiPage.buyRequiredProducts();
        ReceptaiPage.confirmAddToCartRequiredProducts();

        actualResult = ReceptaiPage.readBuyButtonName();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s".formatted(expectedResult, actualResult)
        );
    }
}
