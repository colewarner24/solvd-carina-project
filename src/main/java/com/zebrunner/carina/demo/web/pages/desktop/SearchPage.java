package com.zebrunner.carina.demo.web.pages.desktop;

import com.zebrunner.carina.demo.web.components.desktop.HeaderComponent;
import com.zebrunner.carina.demo.web.components.desktop.ProductComponent;
import com.zebrunner.carina.demo.web.components.desktop.ProductsComponent;
import com.zebrunner.carina.demo.web.pages.common.ProductBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

import java.lang.invoke.MethodHandles;

public class SearchPage extends ProductBasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(className = "page-header")
    private HeaderComponent headerComponent;

    //@FindBy(className = "products wrapper grid products-grid")
    @FindBy(xpath = "//div[@class='products wrapper grid products-grid']")
    private ProductsComponent productsComponent;

    public SearchPage(WebDriver driver, String query) {
        super(driver);
        setPageURL("catalogsearch/result/?q=" + query);
    }

    public int productsCount() {
        LOGGER.info("Products count: " + productsComponent.getProductsCount());
        return productsComponent.getProductsCount();
    }

    public List<String> getProductNames() {
        return productsComponent.getProductNames();
    }

    public void addToCart(String productName) {
        productsComponent.addProductToCart(productName);
    }
}
