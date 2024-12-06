package com.zebrunner.carina.demo.web.components.desktop;

import com.zebrunner.carina.demo.web.components.common.HeaderBaseComponent;
import com.zebrunner.carina.demo.web.pages.desktop.CartPage;
import com.zebrunner.carina.demo.web.pages.desktop.ShippingPage;
import com.zebrunner.carina.demo.web.pages.desktop.SignInPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class HeaderComponent extends HeaderBaseComponent {

    @FindBy(className = "authorization-link")
    private ExtendedWebElement signInLink;

    @FindBy(className = "logged-in")
    private ExtendedWebElement loggedInMessage;

    @FindBy(id = "search")
    private ExtendedWebElement searchField;

    //@FindBy(className = "action showcart")
    @FindBy(xpath = "//a[@class='action showcart']")
    private ExtendedWebElement cartButton;

    //@FindBy(className = "action viewcart")
    @FindBy(xpath = "//a[@class='action viewcart']")
    private ExtendedWebElement viewCartButton;

    @FindBy(id = "top-cart-btn-checkout")
    private ExtendedWebElement checkoutButton;

    public HeaderComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public SignInPage openSignInPage() {
        signInLink.click();
        return new SignInPage(driver);
    }

    public String getLoggedInMessage() {
        return loggedInMessage.getText();
    }

    public void search(String query) {
        searchField.type(query);
        searchField.sendKeys(Keys.ENTER);
    }

    public CartPage openCart() {
        cartButton.scrollTo();
        cartButton.click();
        viewCartButton.click(Duration.ofSeconds(10));
        return new CartPage(driver);
    }

    public ShippingPage proceedToCheckout() {
        cartButton.click();
        checkoutButton.click();
        return new ShippingPage(driver);
    }
}
