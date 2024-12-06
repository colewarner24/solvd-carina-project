package com.zebrunner.carina.demo.web.pages.desktop;

import com.zebrunner.carina.demo.web.pages.common.SignInBasePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.Context;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage extends SignInBasePage {

    @FindBy(xpath = "//fieldset[@class='fieldset login']")
    private ExtendedWebElement loginForm;

    @Context(dependsOn = "loginForm")
    @FindBy(xpath = "//input[@id='email']")
    private ExtendedWebElement emailField;

    @Context(dependsOn = "loginForm")
    @FindBy(id = "pass")
    private ExtendedWebElement passwordField;

//    @Context(dependsOn = "loginForm")
    @FindBy(xpath = "//button[@class='action login primary']")
    private ExtendedWebElement loginButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public HomePage login(String email, String password) {
        emailField.type(email);
        passwordField.type(password);
        loginButton.scrollTo();
        loginButton.click();
        return new HomePage(driver);
    }
}
