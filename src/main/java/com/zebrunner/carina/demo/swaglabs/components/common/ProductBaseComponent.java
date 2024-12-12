package com.zebrunner.carina.demo.swaglabs.components.common;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;

public abstract class ProductBaseComponent extends AbstractUIObject {
    public ProductBaseComponent(WebDriver driver) {
        super(driver);
    }

    public abstract String getProductName();
}
