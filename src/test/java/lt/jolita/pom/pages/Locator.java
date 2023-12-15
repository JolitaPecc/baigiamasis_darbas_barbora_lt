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
            public static By searchBar = By.xpath("(//input[@id='fti-search'])[2]");
            public static By clickSearchButton = By.xpath("(//button[@id='fti-initiate-search'])[2]");
            public static By searchResults = By.xpath("//div[@id='search-results-placeholder']");
        }

        public class Receptai {
            public static By searchBarVisibleAfter =
                    By.xpath("//div[@class='b-recipes-cats-bar white-bg']" +
                            "//input[@placeholder='Recepto paieška']");
            public static By clickSearchButton =
                    By.xpath("//button[@class='c-btn c-btn--center b-search--initiate ']");
            public static By clickOnRecipe =
                    By.xpath("//div[@class='b-recipes--items-list--item-content']");
            public static By clickOnProductListButton = By.xpath("//button[@class='c-btn c-btn--block']");
            public static By clickOnConfirmProductListButton =
                    By.xpath("//div[@class='modal-dialog b-recipe-items-modal b-modal-wide b-modal-tall']" +
                            "//button[@class='c-btn c-btn--block']");
            public static By readBuyButtonName = By.xpath("//button[@id='fti-sidebar-buy']");
            public static By clickReceptai =
                    By.xpath("//a[@class='desktop-menu--item ']//span[contains(text(),'Receptai')]");
        }
    }
}
