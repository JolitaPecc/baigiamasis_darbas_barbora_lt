package lt.jolita.pom.tests.barbora;

import lt.jolita.pom.pages.barbora.ManoDuomenysPage;
import lt.jolita.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManoDuomenysTest extends TestBase {
    @Override
    @BeforeMethod
    public void setUp() {
        ManoDuomenysPage.openUrl("https://www.barbora.lt");
        ManoDuomenysPage.closeCookiePopup();
        ManoDuomenysPage.doLogin();
        ManoDuomenysPage.waitForElementToBeVisible();
        ManoDuomenysPage.goToUrl("https://www.barbora.lt/mano-duomenys/mano-aciu-kortele");
    }

    @Test
    public void testAddAciuCardDetailsToAccount() {
        String aciuCardNumber = "9440003700816017447";
        String expectedResult = "Jūsų AČIŪ kortelės numeris:";
        String actualResult;

        ManoDuomenysPage.writeAciuCardIdIntoField(aciuCardNumber);
        ManoDuomenysPage.pushButtonAddAciuCard();

        actualResult = ManoDuomenysPage.readMessageAboutMyCard();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
