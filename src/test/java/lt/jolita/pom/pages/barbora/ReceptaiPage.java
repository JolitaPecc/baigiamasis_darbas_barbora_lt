package lt.jolita.pom.pages.barbora;

import lt.jolita.pom.pages.Common;
import lt.jolita.pom.pages.Locator;

public class ReceptaiPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void closeCookiePopup() {
        Common.clickOnElement(Locator.Barbora.Login.cookieBotDialogOkButton);
    }

    public static void doLogin() {
        String myEmail = "peciokiene.jolita@gmail.com";
        String myPassword = "Oranzinis5";

        LoginPage.clickOnPrisijungti();
        LoginPage.writeEmail(myEmail);
        LoginPage.writePassword(myPassword);
        LoginPage.clickOnLoginSubmit();
    }

    public static void enterRecipeName(String myRecipeName) {
        ReceptaiPage.writeRecipeName(myRecipeName);
    }

    private static void writeRecipeName(String myRecipeName) {
        Common.addText(Locator.Barbora.Receptai.searchBarVisibleAfter, myRecipeName);
    }

    public static void initiateSearch() {
        Common.clickOnElement(Locator.Barbora.Receptai.clickSearchButton);
    }

    public static void clickOnRecipeTab() {
        Common.clickOnElement(Locator.Barbora.Receptai.clickOnRecipe);
    }

    public static void buyRequiredProducts() {
        Common.clickOnElement(Locator.Barbora.Receptai.clickOnProductListButton);
    }

    public static void confirmAddToCartRequiredProducts() {
        Common.clickOnElement(Locator.Barbora.Receptai.clickOnConfirmProductListButton);
    }

    public static String readBuyButtonName() {
        return Common.getText(Locator.Barbora.Receptai.readBuyButtonName);
    }

    public static void waitForPageReceptaiToBeVisible() {
        boolean isVisible = Common.waitForElementToBeVisibleCustomised(
                Locator.Barbora.Receptai.clickReceptai, 8
        );
        if (isVisible) {
            Common.checkIfElementVisible(Locator.Barbora.Receptai.clickReceptai);
        }
    }

    public static void openPageReceptai() {
        Common.clickOnElement(Locator.Barbora.Receptai.clickReceptai);
    }
}
