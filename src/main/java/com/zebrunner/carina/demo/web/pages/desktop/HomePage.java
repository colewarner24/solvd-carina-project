package com.zebrunner.carina.demo.web.pages.desktop;

import com.zebrunner.carina.demo.web.components.desktop.HeaderComponent;
import com.zebrunner.carina.demo.web.components.desktop.ProductsComponent;
import com.zebrunner.carina.demo.web.pages.common.HomeBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class HomePage extends HomeBasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(className = "page-header")
    private HeaderComponent headerComponent;

    @FindBy(className = "products-grid")
    private ProductsComponent productsComponent;

    public HomePage(WebDriver driver) {
        super(driver);
    }

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
