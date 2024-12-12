package com.zebrunner.carina.demo.swaglabs.pages.android;

import com.zebrunner.carina.demo.swaglabs.pages.common.CompleteBasePage;
import com.zebrunner.carina.demo.swaglabs.pages.common.OverviewBasePage;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CompleteBasePage.class)
public class CompletePage extends CompleteBasePage {

    @ExtendedFindBy(accessibilityId = "test-CHECKOUT: COMPLETE!")
    private ExtendedWebElement checkoutComplete;

    public CompletePage(WebDriver driver) {
        super(driver);
    }

    public boolean isCheckoutComplete() {
        return checkoutComplete.isElementPresent();
    }

}
