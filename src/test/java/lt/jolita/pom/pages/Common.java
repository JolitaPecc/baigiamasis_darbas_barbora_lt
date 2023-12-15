package lt.jolita.pom.pages;

import lt.jolita.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class Common {

    public static void setUpChrome(int durationOfSeconds) {
        Driver.setUpChromeDriver();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(durationOfSeconds));
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void goToUrl(String url) {
        Driver.getDriver().navigate().to(url);
    }

    public static void quitDriver() {
        Driver.quitDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator); //gaudom po viena elementa
    }

    public static void addText(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static String getText(By locator) {
        return getElement(locator).getText();
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static boolean waitForElementToBeVisibleCustomised(By locator, int seconds) {
        boolean isVisible;
        int duration = 0;
        do {
            try {
                Thread.sleep(500);
                isVisible = getElement(locator).isDisplayed();;
            } catch (NoSuchElementException e) {
                isVisible = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return false;
            }
            duration++;
        } while (!isVisible || duration / 2 >= seconds);

        return isVisible;
    }

    public static boolean checkIfElementVisible(By locator) {
        try {
            return getElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
