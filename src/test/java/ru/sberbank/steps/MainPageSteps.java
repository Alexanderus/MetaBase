package ru.sberbank.steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.sberbank.pages.SberbankMainPage;
import ru.sberbank.setups.BrowserSetup;

import java.time.Duration;

public class MainPageSteps {

    SberbankMainPage sberbankMainPage = new SberbankMainPage(BrowserSetup.getWebDriver());

    @Given("^the user is open main page$")
    public void userOpenMainPage() {
        BrowserSetup.getWebDriver().get("https://www.sberbank.ru/");
        System.out.println("Открыта главная страница");
    }

    @Given("^the main panel is open$")
    public void isMainPanelIsOpen() {
        WebDriverWait wait = new WebDriverWait(BrowserSetup.getWebDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sberbankMainPage.getSberbankMainPanel())));
        System.out.println("Отображается главная панель");
    }

    @Given("^the user click on login button$")
    public void userClickOnLoginButton() {
        WebDriverWait wait = new WebDriverWait(BrowserSetup.getWebDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sberbankMainPage.getSberbankOnlineButton())));
        BrowserSetup.getWebDriver().findElement(By.xpath(sberbankMainPage.getSberbankOnlineButton())).click();
        System.out.println("Нажата кнопка сбербанк онлайн");
    }

    @Given("^the user click on enter button$")
    public void userClickOnEnterButton() {
        BrowserSetup.getWebDriver().findElement(By.xpath(sberbankMainPage.getEnterSberbankButton())).click();
        System.out.println("Нажата кнопка войти в сбербанк онлайн");
    }

    @Given("^the user see main sberbank online panel$")
    public void  sberbankOnlineMainPageOpen() {
        WebDriverWait wait = new WebDriverWait(BrowserSetup.getWebDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sberbankMainPage.getSberbankOnlineMainPanel())));
        System.out.println("Отображается главная панель сбербанк онлайн");
    }

    @Given("^the user see main login page$")
    public void  userSeeMainLoginPage() {
        WebDriverWait wait = new WebDriverWait(BrowserSetup.getWebDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sberbankMainPage.getSberbankOnlineStageHeader())));
        System.out.println("Отображается главная страница входа в сбербанк онлайн");
    }

    @Given("^the wrong password message is displayed$")
    public void  wrongPasswordMessageIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(BrowserSetup.getWebDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sberbankMainPage.getWrongPasswordMessage())));
        System.out.println("Отображается сообщение о некорректном пароле");
    }

    @Given("^the user click on sberbank online login button$")
    public void userClickOnSberbankOnlineLoginButton() {
        BrowserSetup.getWebDriver().findElement(By.xpath(sberbankMainPage.getSberbankOnlineEnterButton())).click();
        System.out.println("Нажата кнопка входа в сбербанк онлайн");
    }

    @Given("^the user enter login \"([^\"]*)\"$")
    public void userEnterLogin(String login) {
        BrowserSetup.getWebDriver().findElement(By.xpath(sberbankMainPage.getInputLoginField())).sendKeys(login);
        System.out.println("Введен логин пользователя");
    }

    @Given("^the user enter password \"([^\"]*)\"$")
    public void userEnterPassword(String password) {
        BrowserSetup.getWebDriver().findElement(By.xpath(sberbankMainPage.getInputPasswordField())).sendKeys(password);
        System.out.println("Введен пароль пользователя");
    }



}
