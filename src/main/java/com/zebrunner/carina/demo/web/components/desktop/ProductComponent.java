package com.zebrunner.carina.demo.web.components.desktop;

import com.zebrunner.carina.demo.web.components.common.ProductBaseComponent;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductComponent extends ProductBaseComponent {

    @FindBy(className ="product-item-link")
    private ExtendedWebElement productItemLink;

    @FindBy(xpath = ".//button[@class='action tocart primary']")
    private ExtendedWebElement addToCartButton;

    @FindBy(className = "action towishlist")
    private ExtendedWebElement addToWishListButton;

    public ProductComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void addToCart() {
        this.scrollTo();
        this.hover();
        addToCartButton.click();
    }

    public String getProductName() {
        return productItemLink.getText();
    }
}
