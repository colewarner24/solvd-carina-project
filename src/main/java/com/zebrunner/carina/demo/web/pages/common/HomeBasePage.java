package com.zebrunner.carina.demo.web.pages.common;

import com.zebrunner.carina.demo.web.components.desktop.HeaderComponent;
import com.zebrunner.carina.demo.web.components.desktop.ProductsComponent;
import com.zebrunner.carina.demo.web.pages.desktop.CartPage;
import com.zebrunner.carina.demo.web.pages.desktop.SearchPage;
import com.zebrunner.carina.demo.web.pages.desktop.ShippingPage;
import com.zebrunner.carina.demo.web.pages.desktop.SignInPage;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class HomeBasePage extends AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public HomeBasePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        super.open();
    }

    private HeaderComponent headerComponent;

    private ProductsComponent productsComponent;

    public SignInPage getSignInPage() {
        return headerComponent.openSignInPage();
    }

    public boolean isSignedIn() {
        return headerComponent.getLoggedInMessage().contains("Welcome");
    }

    public SearchPage getSearchPage(String query) {
        headerComponent.search(query);
        return new SearchPage(driver, query);
    }

    public void addProductToCart(String productName) {
        productsComponent.addProductToCart(productName);
    }

    public CartPage openCart() {
        return headerComponent.openCart();
    }

    public ShippingPage proceedToCheckout() {
        return headerComponent.proceedToCheckout();
    }

    public HeaderComponent getHeaderComponent() {
        return headerComponent;
    }

    public ProductsComponent getProductsComponent() {
        return productsComponent;
    }
}
