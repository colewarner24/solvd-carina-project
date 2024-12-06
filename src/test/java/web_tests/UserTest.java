package web_tests;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.demo.web.pages.desktop.*;
import com.zebrunner.carina.demo.web.components.desktop.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class UserTest implements IAbstractTest {


    HomePage setUpUser(String email, String password) {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SignInPage signInPage = homePage.getSignInPage();
        homePage = signInPage.login(email, password);
        return homePage;
    }

    @Test()
    public void testHomePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        assert(homePage.isPageOpened());
    }

    @Test()
    public void testHeaderComponent() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        HeaderComponent headerComponent = homePage.getHeaderComponent();
        assert(headerComponent.isElementPresent());
    }

    @Test()
    public void testHomePageProducts() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        ProductsComponent productsComponent = homePage.getProductsComponent();
        assert(productsComponent.getProductsCount() > 0);
    }

    @Test(dataProvider = "user-signin")
    public void testUserSignIn(String email, String password) {
        HomePage homePage = setUpUser(email, password);
        assert(homePage.isSignedIn());
    }

    @Test()
    public void testSearchProduct() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchPage searchPage = homePage.getSearchPage("shirt");
        assert(searchPage.isPageOpened());
        assert(searchPage.productsCount() > 0);
    }

    @Test()
    public void testSearchProduct2() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchPage searchPage = homePage.getSearchPage("pants");
        assert(searchPage.isPageOpened());
        List<String> productNames = Arrays.asList("Caesar Warm-Up Pant, Aether Gym Pant", "Livingston All-Purpose Tight", "Thorpe Track Pant", "Kratos Gym Pant", "Supernova Sport Pant", "Geo Insulated Jogging Pant", "Viktor LumaTech™ Pant", "Carina Basic Capri", "Cora Parachute Pant", "Ida Workout Parachute Pant", "Emma Leggings");
        System.out.println(searchPage.getProductNames());
        System.out.println(productNames);
        assert productNames.containsAll(searchPage.getProductNames());
    }

    @Test()
    public void testAddToCart() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        homePage.addProductToCart("Push It Messenger Bag");
        CartPage cartpage = homePage.openCart();
        assert (cartpage.isPageOpened());
        assert (cartpage.productsCount() > 0);
    }

    @Test()
    public void testRemoveFromCart() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        homePage.addProductToCart("Push It Messenger Bag");
        CartPage cartpage = homePage.openCart();
        assert (cartpage.isPageOpened());
        assert (cartpage.productsCount() > 0);
        cartpage.removeProductFromCart("Push It Messenger Bag");
        assert (!cartpage.isProductPresent("Push It Messenger Bag"));
    }

    @Test()
    public void testAddSearchItemToCart() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchPage searchPage = homePage.getSearchPage("bag");
        assert(searchPage.isPageOpened());
        searchPage.addToCart("Push It Messenger Bag");
        CartPage cartpage = new CartPage(searchPage.getDriver());
        cartpage.open();
        assert (cartpage.isPageOpened());
        assert (cartpage.productsCount() > 0);
    }

    @Test(dataProvider = "user-checkout")
    public void testCheckout(String email, String firstName, String lastName, String address, String city, String state, String zip, String country, String phone) {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        homePage.addProductToCart("Push It Messenger Bag");
        ShippingPage shippingPage = homePage.proceedToCheckout();
        assert (shippingPage.isPageOpened());
        PaymentPage paymentPage = shippingPage.fillShippingInfo(email, firstName, lastName, address, city, state, zip, country, phone);
        assert (paymentPage.isPageOpened());
        SuccessPage successPage = paymentPage.placeOrder();
        assert (successPage.isPageOpened());
    }

    @DataProvider(name = "user-signin")
    public Object[][] createData1() {
        return new Object[][]{
                {"19cowarner@gmail.com", "*9!qty7;KnCL9XN"},
        };
    }

    @DataProvider(name = "user-checkout")
    public Object[][] createData() {
        return new Object[][]{
                {"johndoe@domain.com", "John", "Doe", "123 Main St", "Anytown", "California", "12345", "Ukraine", "1234567890"},
        };
    }
}
