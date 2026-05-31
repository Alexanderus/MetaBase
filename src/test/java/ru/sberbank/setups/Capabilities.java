package ru.sberbank.setups;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.nio.file.Paths;
import java.time.Duration;

import static ru.sberbank.helpers.GlobalVariables.TIMEOUT;

public class Capabilities {
    public static WebDriver webDriver;

    public void ChromeDriver(){
        System.setProperty("webdriver.chrome.driver", Paths.get("src","test","resources", "webdriver/chromedriver").toString());
        ChromeOptions chOptions = new ChromeOptions();
        chOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        webDriver = new ChromeDriver(chOptions);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TIMEOUT));

        System.out.println("Browser: " + System.getProperty("browser"));
    }

    public void FirefoxDriver(){
        System.setProperty("webdriver.gecko.driver", Paths.get("src","test","resources", "webdriver/geckodriver").toString());
        FirefoxOptions frOptions = new FirefoxOptions();
        frOptions.addPreference("acceptInsecureCerts", true);
        //frOptions.addArguments("--headless");
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        System.out.println("Browser: " + System.getProperty("browser"));
    }
}