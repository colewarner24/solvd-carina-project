package com.zebrunner.carina.demo.swaglabs.pages.common;

import com.zebrunner.carina.demo.swaglabs.components.android.HeaderComponent;
import com.zebrunner.carina.demo.swaglabs.components.android.ProductComponent;
import com.zebrunner.carina.demo.swaglabs.components.android.ProductsComponent;
import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

import java.util.List;

public abstract class ProductBasePage extends AbstractPage {

    public ProductBasePage(WebDriver driver) {
        super(driver);
    }

    public abstract ProductComponent findProduct(String name);

    public abstract CartBasePage addToCart(String name);

    public abstract HeaderComponent getHeaderComponent();

    public abstract List<ProductComponent> getProducts();
}
