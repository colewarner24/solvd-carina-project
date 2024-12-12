package com.zebrunner.carina.demo.swaglabs.components.common;

import com.zebrunner.carina.demo.swaglabs.components.android.ProductComponent;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;

import java.util.List;

public abstract class ProductsBaseComponent extends AbstractUIObject {

    public ProductsBaseComponent(WebDriver driver) {
        super(driver);
    }

    public abstract List<ProductComponent> getProducts();
}
