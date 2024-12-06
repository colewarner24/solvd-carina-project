package com.zebrunner.carina.demo.web.components.common;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class HeaderBaseComponent extends AbstractUIObject {

    public HeaderBaseComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
