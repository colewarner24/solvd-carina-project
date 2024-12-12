package com.zebrunner.carina.demo.swaglabs.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CheckoutBasePage extends AbstractPage {

    public CheckoutBasePage(WebDriver driver){
        super(driver);
    }

    public abstract OverviewBasePage fillAndContinueCheckout(String firstName, String lastName, String zipCodes);
}
