package com.zebrunner.carina.demo.swaglabs.pages.android;

import com.zebrunner.carina.demo.swaglabs.pages.common.CompleteBasePage;
import com.zebrunner.carina.demo.swaglabs.pages.common.OverviewBasePage;
import com.zebrunner.carina.demo.swaglabs.pages.common.ProductBasePage;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = OverviewBasePage.class)
public class OverviewPage extends OverviewBasePage implements IMobileUtils {

    @ExtendedFindBy(accessibilityId = "test-FINISH")
    private ExtendedWebElement finishButton;

    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    public CompleteBasePage finishCheckout() {
        swipe(finishButton);
        assert finishButton.isElementPresent() : "Finish button is not displayed!";
        finishButton.click();
        return initPage(getDriver(), CompleteBasePage.class);
    }
}
