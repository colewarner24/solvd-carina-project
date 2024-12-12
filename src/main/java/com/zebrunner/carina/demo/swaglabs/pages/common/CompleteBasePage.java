package com.zebrunner.carina.demo.swaglabs.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CompleteBasePage extends AbstractPage {

    public CompleteBasePage(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isCheckoutComplete();
}
