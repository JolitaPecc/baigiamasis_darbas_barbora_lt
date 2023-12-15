package lt.jolita.pom.pages.barbora;

import lt.jolita.pom.pages.Common;
import lt.jolita.pom.pages.Locator;

public class ReceptaiPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void closeCookiePopup() {
        Common.clickOnElement(Locator.Barbora.Login.cookiebotDialogOkButton);
    }

    public static void doLogin() {
        String myEmail = "peciokiene.jolita@gmail.com";
        String myPassword = "Oranzinis5";


        LoginPage.clickOnPrisijungti();
        LoginPage.writeEmail(myEmail);
        LoginPage.writePassword(myPassword);
        LoginPage.clickOnLoginSubmit();
    }
}
