package lt.jolita.pom.pages.barbora;

import lt.jolita.pom.pages.Common;
import lt.jolita.pom.pages.Locator;

public class ManoDuomenysPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void goToUrl(String url) {
//        Common.setUpChrome();
        Common.goToUrl(url);
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

    public static void waitForElementToBeVisible() {
        boolean isVisible = Common.waitForElementToBeVisibleCustomised(
                Locator.Barbora.Login.myCart, 8
        );
        if (isVisible) {
            Common.checkIfElementVisible(Locator.Barbora.Receptai.clickReceptai);
        }
    }

    public static void writeAciuCardIdIntoField(String aciuCardNumber) {
        Common.addText(Locator.Barbora.ManoDuomenys.enterAciuCardNumber, aciuCardNumber);
    }

    public static void pushButtonAddAciuCard() {
        Common.clickOnElement(Locator.Barbora.ManoDuomenys.pushButtonAddCard);
    }

    public static String readMessageAboutMyCard() {
        return Common.getText(Locator.Barbora.ManoDuomenys.statusOfMyCard);
    }

    public static void pushButtonToRemoveAciuCard() {
        Common.clickOnElement(Locator.Barbora.ManoDuomenys.pushButtonRemoveCard);
    }

    public static void pushButtonAcceptToRemoveAciuCard() {
        Common.clickOnElement(Locator.Barbora.ManoDuomenys.pushButtonAcceptRemoveCard);
    }

    public static String readAlertMessage() {
        return Common.getText(Locator.Barbora.ManoDuomenys.readAlertMessageText);
    }
}
