package com.zebrunner.carina.demo.swaglabs.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class OverviewBasePage extends AbstractPage {

    public OverviewBasePage(WebDriver driver) {
        super(driver);
    }

    public abstract CompleteBasePage finishCheckout();
}
