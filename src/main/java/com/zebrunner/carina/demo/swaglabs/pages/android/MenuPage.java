package com.zebrunner.carina.demo.swaglabs.pages.android;

import com.zebrunner.carina.demo.swaglabs.pages.common.AboutBasePage;
import com.zebrunner.carina.demo.swaglabs.pages.common.LoginBasePage;
import com.zebrunner.carina.demo.swaglabs.pages.common.MenuBasePage;
import com.zebrunner.carina.demo.swaglabs.pages.common.ProductBasePage;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MenuBasePage.class)
public class MenuPage extends MenuBasePage implements IMobileUtils {

    @ExtendedFindBy(accessibilityId = "test-%s")
    private ExtendedWebElement menuLink;

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public AbstractPage openPage(String pageName) {
        switch (pageName.toUpperCase()){
            case "ALL ITEMS":
                menuLink.format(pageName).click();
                return initPage(getDriver(), ProductBasePage.class);
            case "ABOUT":
                menuLink.format(pageName).click();
                return initPage(getDriver(), AboutBasePage.class);
            case "LOGOUT":
                menuLink.format(pageName).click();
                return initPage(getDriver(), LoginBasePage.class);
            default:
                throw new RuntimeException("Unknown page: " + pageName);
        }
    }
}
