package com.zebrunner.carina.demo.swaglabs.pages.android;

import com.zebrunner.carina.demo.swaglabs.components.android.HeaderComponent;
import com.zebrunner.carina.demo.swaglabs.components.android.ProductComponent;
import com.zebrunner.carina.demo.swaglabs.components.android.ProductsComponent;
import com.zebrunner.carina.demo.swaglabs.pages.common.CartBasePage;
import com.zebrunner.carina.demo.swaglabs.pages.common.ProductBasePage;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductBasePage.class)
public class ProductPage extends ProductBasePage implements IMobileUtils {

    @FindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-PRODUCTS\"]")
    private ExtendedWebElement pageTitle;

    @FindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-PRODUCTS\"]")
    private ProductsComponent productElements;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
    private HeaderComponent headerComponent;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return pageTitle.isElementPresent();
    }

    public ProductComponent findProduct(String name) {
        List<ProductComponent> products = productElements.getProducts();
        assert !products.isEmpty() : "No products found!";
        System.out.println("number of products: " + products.size());
        return products.stream()
                .filter(product -> product.getProductName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public CartBasePage addToCart(String name) {
        findProduct(name).addToCart();
        assert headerComponent.isElementPresent() : "Header component is not present!";
        return headerComponent.openCart();
    }

    public HeaderComponent getHeaderComponent() {
        return headerComponent;
    }

    public List<ProductComponent> getProducts() {
        return productElements.getProducts();
    }
}
