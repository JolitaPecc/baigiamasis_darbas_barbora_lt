package lt.jolita.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Barbora {

        public static class Login {
            public static By cookiebotDialogOkButton =
                    By.xpath("//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
            public static By buttonPrisijungti =
                    By.xpath("//button[@id='fti-header-login']");
            public static By emailLogin = By.xpath("//input[@type='email']");
            public static By passwordLogin = By.xpath("//input[@type='password']");
            public static By buttonPrisijunkSuElPastu =
                    By.xpath("//span[@class='b-login-form--email-txt']");
            public static By myCart = By.xpath("(//button[@id='fti-cart-delivery']//span)[2]");

            public static By errorMessage = By.xpath("//div[@class='b-alert b-alert--error']");
            public static By sewarchBar = By.xpath("(//input[@id='fti-search'])[2]");
            public static By clickSearchButton = By.xpath("(//button[@id='fti-initiate-search'])[2]");
            public static By searchResults = By.xpath("//div[@id='search-results-placeholder']");
        }
    }
}
