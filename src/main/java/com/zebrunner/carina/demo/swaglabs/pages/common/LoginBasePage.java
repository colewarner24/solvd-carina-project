package com.zebrunner.carina.demo.swaglabs.pages.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class LoginBasePage extends AbstractPage {

    public LoginBasePage(WebDriver driver) {
        super(driver);
    }

    public abstract ProductBasePage login(String username, String password);

}
