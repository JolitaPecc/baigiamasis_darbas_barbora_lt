package lt.jolita.pom.pages.barbora;

import lt.jolita.pom.pages.Common;
import lt.jolita.pom.pages.Locator;

public class LoginPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void closeCookiePopup() {
        Common.clickOnElement(Locator.Barbora.Login.cookiebotDialogOkButton);
    }

    public static void clickOnPrisijungti() {
        Common.clickOnElement(Locator.Barbora.Login.buttonPrisijungti);
    }

    public static void writeEmail(String myEmail) {
        Common.addText(Locator.Barbora.Login.emailLogin, myEmail);
    }

    public static void writePassword(String myPassword) {
        Common.addText(Locator.Barbora.Login.passwordLogin, myPassword);
    }

    public static void clickOnLoginSubmit() {
        Common.clickOnElement(Locator.Barbora.Login.buttonPrisijunkSuElPastu);
    }

    public static String readCartContentIsZero() {
        return Common.getText(Locator.Barbora.Login.myCart);
    }

    public static void doLigin() throws InterruptedException {
        String myEmail = "peciokiene.jolita@gmail.com";
        String myPassword = "Oranzinis5";


        LoginPage.clickOnPrisijungti();
        Thread.sleep(3000);
        LoginPage.writeEmail(myEmail);
        LoginPage.writePassword(myPassword);
        LoginPage.clickOnLoginSubmit();
    }

    public static String readErrorMessage() {
        return Common.getText(Locator.Barbora.Login.errorMessage);
    }
}
