package ru.sberbank.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import ru.sberbank.pages.SberbankMainPage;
import ru.sberbank.setups.BrowserSetup;

public class MainPageSteps {

    SberbankMainPage loginPage = new SberbankMainPage(BrowserSetup.getWebDriver());

    @Given("^the user is on the login page$")
    public void userTypeInAddressBar() throws Throwable {
        System.out.println("TESTING PAGE !!!");
        //BrowserSetup.getWebDriver().navigate().to(url);
    }

    @Then("^Sauce Demo web will displayed$")
    public void sauceDemoWebWillDisplayed() throws Throwable {
        //loginPage.seeLogoImg();
    }



}
