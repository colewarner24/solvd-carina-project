package com.zebrunner.carina.demo.web.pages.desktop;

import com.zebrunner.carina.demo.web.pages.common.PaymentBasePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends PaymentBasePage {

    @FindBy(xpath = "//button[@class='action primary checkout']")
    private ExtendedWebElement placeOrderButton;

    public PaymentPage(WebDriver driver) {
        super(driver);
        setPageURL("checkout/#payment");
    }

    public SuccessPage placeOrder() {
        placeOrderButton.click();
        return new SuccessPage(driver);
    }
}
