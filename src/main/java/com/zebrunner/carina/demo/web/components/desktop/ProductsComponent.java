package com.zebrunner.carina.demo.web.components.desktop;

import com.zebrunner.carina.demo.web.components.common.ProductsBaseComponent;
import com.zebrunner.carina.demo.web.pages.desktop.HomePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class ProductsComponent extends ProductsBaseComponent {

    @FindBy(className = "product-item-info")
    private List<ProductComponent> productComponent;

    public ProductsComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public int getProductsCount() {
        return productComponent.size();
    }

    public ProductComponent getProductByName(String name) {
        return productComponent.stream()
                                .filter(product -> product.getProductName().equals(name))
                                .findFirst().orElse(null);
    }

    public HomePage addProductToCart(String productName) {
        getProductByName(productName).addToCart();
        return new HomePage(driver);
    }

    public List<String> getProductNames() {
        return productComponent.stream()
                                .map(ProductComponent::getProductName)
                                .collect(Collectors.toList());
    }
}
