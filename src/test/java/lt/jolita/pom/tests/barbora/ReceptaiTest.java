package lt.jolita.pom.tests.barbora;

import lt.jolita.pom.pages.barbora.ReceptaiPage;
import lt.jolita.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;

public class ReceptaiTest extends TestBase {
    @Override
    @BeforeMethod
    public void setUp() {
        ReceptaiPage.openUrl("https://www.barbora.lt/");
        ReceptaiPage.closeCookiePopup();
        ReceptaiPage.doLogin();
    }
}
