package com.zebrunner.carina.demo.web.pages.desktop;

import com.zebrunner.carina.demo.web.pages.common.SuccessBasePage;
import org.openqa.selenium.WebDriver;

public class SuccessPage extends SuccessBasePage {

    public SuccessPage(WebDriver driver) {
        super(driver);
        setPageURL("checkout/onepage/success/");
    }

}
