package com.zebrunner.carina.demo.swaglabs.components.android;

import com.zebrunner.carina.demo.swaglabs.components.common.HeaderBaseComponent;
import com.zebrunner.carina.demo.swaglabs.pages.common.CartBasePage;
import com.zebrunner.carina.demo.swaglabs.pages.common.MenuBasePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class HeaderComponent extends HeaderBaseComponent {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]")
    private ExtendedWebElement menuButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]")
    private ExtendedWebElement cartButton;

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public MenuBasePage openMenu() {
        menuButton.click();
        return initPage(getDriver(), MenuBasePage.class);
    }

    public CartBasePage openCart() {
        cartButton.click();
        return initPage(getDriver(), CartBasePage.class);
    }

    @Override
    public boolean isElementPresent() {
        return menuButton.isElementPresent() && cartButton.isElementPresent();
    }
}
