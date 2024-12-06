package com.zebrunner.carina.demo.web.pages.desktop;

import com.zebrunner.carina.demo.web.components.desktop.HeaderComponent;
import com.zebrunner.carina.demo.web.components.desktop.ProductsComponent;
import com.zebrunner.carina.demo.web.pages.common.ProductBasePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.List;

public class CartPage extends ProductBasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(className = "item-info")
    private List<ExtendedWebElement> products;

    @FindBy(xpath = "//a[@class=\"action action-delete\"]")
    private List<ExtendedWebElement> removeButtons;

    public CartPage(WebDriver driver) {
        super(driver);
        setPageURL("checkout/cart/");
    }

    public int productsCount() {
        LOGGER.info("Products count: " + products.size());
        return products.size();
    }

    public void removeProductFromCart(String productName) {
        ExtendedWebElement removeButton = removeButtons.stream()
                     .filter(button -> button.getAttribute("title").equals("Remove item"))
                     .findFirst().orElse(null);
        if (removeButton != null) {
            removeButton.scrollTo();
            removeButton.click();
        }
    }

    public boolean isProductPresent(String productName) {
        return products.stream()
                       .anyMatch(product -> product.getText().contains(productName));
    }

}
