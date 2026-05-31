package ru.sberbank.setups;

import org.openqa.selenium.WebDriver;
import ru.sberbank.helpers.GlobalVariables;

public class BrowserSetup {
    public static WebDriver getWebDriver(){
        return Capabilities.webDriver;
    }

    public static void startWebDriver() {
        Capabilities capabilities = new Capabilities();

        switch (GlobalVariables.BROWSER.toLowerCase()){
            case "chrome":
                capabilities.ChromeDriver();
                break;
            case "edge":
                capabilities.EdgeDriver();
                break;
            case "firefox":
                capabilities.FirefoxDriver();
                break;
        }
    }
}