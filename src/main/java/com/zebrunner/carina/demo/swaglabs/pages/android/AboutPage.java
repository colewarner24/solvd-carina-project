package com.zebrunner.carina.demo.swaglabs.pages.android;

import com.zebrunner.carina.demo.swaglabs.pages.common.AboutBasePage;
import com.zebrunner.carina.demo.swaglabs.pages.common.CartBasePage;
import com.zebrunner.carina.demo.swaglabs.pages.common.CheckoutBasePage;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AboutBasePage.class)
public class AboutPage extends AboutBasePage implements IMobileUtils {

    public AboutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return !isAppRunning();
    }

}

