package com.zebrunner.carina.demo.web.pages.desktop;

import com.zebrunner.carina.demo.web.pages.common.ShippingBasePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends ShippingBasePage {

    @FindBy(xpath = "//input[@id='customer-email']")
    private ExtendedWebElement email;

    @FindBy(xpath = "//input[@name=\"firstname\"]")
    private ExtendedWebElement firstName;

    @FindBy(xpath = "//input[@name=\"lastname\"]")
    private ExtendedWebElement lastName;

    @FindBy(xpath = "//input[@name=\"street[0]\"]")
    private ExtendedWebElement address;

    @FindBy(xpath = "//input[@name=\"city\"]")
    private ExtendedWebElement city;

    @FindBy(xpath = "//select[@name=\"region_id\"]")
    private ExtendedWebElement state;

    @FindBy(xpath = "//input[@name=\"postcode\"]")
    private ExtendedWebElement zip;

    @FindBy(xpath = "//select[@name=\"country_id\"]")
    private ExtendedWebElement country;

    @FindBy(xpath = "//input[@name=\"telephone\"]")
    private ExtendedWebElement phone;

    @FindBy(xpath = "//input[@value='flatrate_flatrate']")
    private ExtendedWebElement flatRateButton;

    @FindBy(xpath = "//button[@class='button action continue primary']")
    private ExtendedWebElement nextButton;

    public ShippingPage(WebDriver driver) {
        super(driver);
        setPageURL("checkout/#shipping");
    }

    public PaymentPage fillShippingInfo(String email, String firstName, String lastName, String address, String city, String state, String zip, String country, String phone) {
        this.email.scrollTo();
        this.email.type(email);
        this.firstName.scrollTo();
        this.firstName.type(firstName);
        this.lastName.scrollTo();
        this.lastName.type(lastName);
        this.address.scrollTo();
        this.address.type(address);
        this.city.scrollTo();
        this.city.type(city);
        this.state.scrollTo();
        this.state.select(state);
        this.zip.scrollTo();
        this.zip.type(zip);
        this.country.scrollTo();
        this.country.select(country);
        this.phone.scrollTo();
        this.phone.type(phone);
        this.flatRateButton.scrollTo();
        this.flatRateButton.click();
        this.nextButton.scrollTo();
        this.nextButton.click();
        return new PaymentPage(driver);
    }
}
