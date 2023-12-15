package lt.jolita.pom.pages;

import lt.jolita.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {

    public static void setUpChrome() {
        Driver.setUpChromeDriver();
    }

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

    public static void closeWindow() {
        Driver.closeDriver();
    }

    public static void quitDriver() {
        Driver.quitDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator); //gaudom po viena elementa
    }

    private static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator); // gaudome po kelis elementus
    }

    public static void addText(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static String getText(By locator) {
        return getElement(locator).getText();
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click(); // padarom, kad programa paspaustu mygtuka
    }

    public static void waitForAlertIsPresent(int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public static void clickOnAcceptOfAlertBox() {
        Driver.getDriver().switchTo().alert().accept();
    }

    public static void switchToFrame(By locator) {
        Driver.getDriver().switchTo().frame(getElement(locator));
    }

    public static List<WebElement> getListOfElements(By locator) {
        return getElements(locator);
    }

    public static void swichToDefaultContent() {
        Driver.getDriver().switchTo().defaultContent();
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
