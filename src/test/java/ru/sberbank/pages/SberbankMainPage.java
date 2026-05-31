package ru.sberbank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import ru.sberbank.helpers.GlobalVariables;

import java.util.List;


public class SberbankMainPage {

    private WebDriver webDriver;

    public SberbankMainPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, GlobalVariables.TIMEOUT), this);
    }

    @FindBy(xpath = "//*[@class='login_logo']")
    @CacheLookup
    private List<WebElement> logoImg;

    @FindBy(id = "user-name")
    @CacheLookup
    private WebElement mainPage;

    @FindBy(id = "password")
    @CacheLookup
    private WebElement passwordField;

    @FindBy(id = "login-button")
    @CacheLookup
    private WebElement loginBtn;

    private String sberbankOnlineButton = "//*[@class='header-widget-sbol-button__main']";

    private String sberbankMainPanel = "//*[@class='header-widget-navigation-bar header-widget-navigation-bar_segments']";

    private String sberbankOnlineEnterButton = "//button[@aria-label='По логину и паролю']";

    private String sberbankOnlineMainPanel = "//div[@id='layout-content']";

    private String sberbankOnlineStageHeader = "//div/h1[@id='stage-header']";

    private String inputLoginField = "//input[@data-testid='input-text']";

    private String inputPasswordField = "//input[@data-testid='input-password']";

    private String enterSberbankButton = "//button[@data-testid='button-continue']";

    private String wrongPasswordMessage = "//div[@id='password-error']";


    @FindBy(xpath = "//*[@data-test='error']")
    @CacheLookup
    private List<WebElement> errorMessage;


    public String getSberbankOnlineButton() {
        return sberbankOnlineButton;
    }

    public String getSberbankMainPanel() {
        return sberbankMainPanel;
    }

    public String getSberbankOnlineMainPanel() {
        return sberbankOnlineMainPanel;
    }

    public String getSberbankOnlineEnterButton() {
        return sberbankOnlineEnterButton;
    }

    public String getSberbankOnlineStageHeader() {
        return sberbankOnlineStageHeader;
    }

    public String getInputLoginField() {
        return inputLoginField;
    }

    public String getInputPasswordField() {
        return inputPasswordField;
    }

    public String getEnterSberbankButton() {
        return enterSberbankButton;
    }

    public String getWrongPasswordMessage() {
        return wrongPasswordMessage;
    }

}
