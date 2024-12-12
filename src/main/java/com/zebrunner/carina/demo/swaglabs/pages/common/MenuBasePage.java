package com.zebrunner.carina.demo.swaglabs.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MenuBasePage extends AbstractPage {

    public MenuBasePage(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage openPage(String pageName);
}
