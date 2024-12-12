package com.zebrunner.carina.demo.swaglabs.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.support.FindBy;

public abstract class AboutBasePage extends AbstractPage {

    public AboutBasePage(WebDriver driver) {
        super(driver);
    }

}
