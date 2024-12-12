package com.zebrunner.carina.demo.swaglabs.components.android;

import com.zebrunner.carina.demo.swaglabs.components.common.ProductBaseComponent;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductComponent extends ProductBaseComponent implements IMobileUtils {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"test-Item title\"]")
    private ExtendedWebElement productName;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"]")
    private ExtendedWebElement addToCartButton;

    public ProductComponent(WebDriver driver, SearchContext searchContext) {
        super(driver);
        setSearchContext(searchContext);
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public String getProductName() {
        return productName.getText();
    }

}
