package ru.sberbank.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import ru.sberbank.setups.BrowserSetup;

public class Hooks {

    @Before
    public void before() throws Exception {
        System.setProperty("browser", "chrome");
        BrowserSetup.startWebDriver();
    }

    @After
    public void after() throws Exception {
        BrowserSetup.getWebDriver().quit();
    }
}