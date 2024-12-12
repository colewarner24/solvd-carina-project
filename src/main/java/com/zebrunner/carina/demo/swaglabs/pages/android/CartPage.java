package com.zebrunner.carina.demo.swaglabs.pages.android;

import com.zebrunner.carina.demo.swaglabs.pages.common.CartBasePage;
import com.zebrunner.carina.demo.swaglabs.pages.common.CheckoutBasePage;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CartBasePage.class)
public class CartPage extends CartBasePage {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]")
    private ExtendedWebElement checkoutButton;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutBasePage checkout() {
        assert checkoutButton.isElementPresent() : "Checkout button is not displayed!";
        checkoutButton.click();
        return initPage(getDriver(), CheckoutBasePage.class);
    }

}
