package ru.sberbank.setups;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void before() throws Exception {
        System.setProperty("browser", "edge");
        BrowserSetup.startWebDriver();
    }

    @After
    public void after() throws Exception {
        BrowserSetup.getWebDriver().quit();
    }
}