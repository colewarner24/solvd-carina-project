package com.zebrunner.carina.demo.web.pages.desktop;

import com.zebrunner.carina.demo.web.components.desktop.HeaderComponent;
import com.zebrunner.carina.demo.web.components.desktop.ProductsComponent;
import com.zebrunner.carina.demo.web.pages.common.HomeBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends HomeBasePage {

    @FindBy(className = "page-header")
    private HeaderComponent headerComponent;

    @FindBy(className = "products-grid")
    private ProductsComponent productsComponent;

    public HomePage(WebDriver driver) {
        super(driver);
    }

}
