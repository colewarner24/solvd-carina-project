package com.zebrunner.carina.demo.swaglabs.components.android;

import com.zebrunner.carina.demo.swaglabs.components.common.ProductsBaseComponent;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.collect;

public class ProductsComponent extends ProductsBaseComponent implements IMobileUtils {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Item']")
    private List<ExtendedWebElement> products;

    public ProductsComponent(WebDriver driver, SearchContext searchContext) {
        super(driver);
        setSearchContext(searchContext);
    }

//    public ProductComponent findProduct(String name) {
//        assert !products.isEmpty() : "No products found!";
//        System.out.println("products: " + products.stream().map(ProductComponent::getProductName).reduce((s1, s2) -> s1 + ", " + s2).orElse(""));
//        return products.stream()
//                       .filter(product -> product.getProductName().equals(name))
//                       .findFirst()
//                       .orElse(null);
//    }

    public List<ProductComponent> getProducts() {
        return products.stream()
                .map(element -> new ProductComponent(driver, element.getElement()))
                .collect(Collectors.toList());
    }

}
