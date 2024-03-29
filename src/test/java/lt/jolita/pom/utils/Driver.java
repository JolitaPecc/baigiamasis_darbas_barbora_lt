package lt.jolita.pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setUpChromeDriver(){
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless=new");
        option.addArguments("start-maximized");
        option.addArguments("--force-device-scale-factor=0.70");
        option.addArguments();

        driver.set(new ChromeDriver(option));
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static WebDriver getDriver() {

        return driver.get();
    }

    public static void quitDriver(){
        driver.get().quit();
        driver.remove();
    }

}
