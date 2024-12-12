package android_tests;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.demo.swaglabs.components.android.ProductComponent;
import com.zebrunner.carina.demo.swaglabs.components.common.HeaderBaseComponent;
import com.zebrunner.carina.demo.swaglabs.pages.common.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zebrunner.carina.utils.mobile.IMobileUtils;

public class UserTest implements IAbstractTest, IMobileUtils {

    String ALL_ITEMS = "ALL ITEMS";
    String ABOUT = "ABOUT";
    String LOGOUT = "LOGOUT";

    String STANDARD_USER = "standard_user";
    String LOCKED_OUT_USER = "locked_out_user";
    String PROBLEM_USER = "problem_user";
    String PASSWORD = "secret_sauce";

    String NAME = "John";
    String LAST_NAME = "Doe";
    String ZIP_CODE = "123456";

    String NAME2 = "Paul";
    String LAST_NAME2 = "Smith";
    String ZIP_CODE2 = "654321";

    String P1 = "Sauce Labs Backpack";
    String P2 = "Sauce Labs Bike Light";
    String P3 = "Sauce Labs Bolt T-Shirt";
    String P4 = "Sauce Labs Fleece Jacket";

    @Test(dataProvider = "simple_user")
    public void testLoginPage() {
        LoginBasePage loginPage = initPage(getDriver(), LoginBasePage.class);
        assert(loginPage.isPageOpened());
    }

    @Test(dataProvider = "all_users")
    public void testLogin(String username, String password, boolean expected) {
        LoginBasePage loginPage = initPage(getDriver(), LoginBasePage.class);
        assert(loginPage.isPageOpened());
        ProductBasePage productPage = loginPage.login(username, password);
        if (expected){
            assert(productPage.isPageOpened());
        }
        else{
            assert(loginPage.isPageOpened());
        }
    }

    @Test(dataProvider = "simple_user")
    public void testHeader(String username, String password) {
        LoginBasePage loginPage = initPage(getDriver(), LoginBasePage.class);
        assert(loginPage.isPageOpened());
        ProductBasePage productPage = loginPage.login(username, password);
        assert(productPage.isPageOpened());
        HeaderBaseComponent headerComponent = productPage.getHeaderComponent();
        assert(headerComponent.isElementPresent());
    }

    @Test(dataProvider = "user_products")
    public void testProductHeader(String username, String password, String product) {
        LoginBasePage loginPage = initPage(getDriver(), LoginBasePage.class);
        assert(loginPage.isPageOpened());
        ProductBasePage productPage = loginPage.login(username, password);
        assert(productPage.isPageOpened());
        ProductComponent p = productPage.findProduct(product);
        assert(p != null);
        assert(p.getProductName().equals(product));
        HeaderBaseComponent headerComponent = productPage.getHeaderComponent();
        assert(headerComponent.isElementPresent());
    }

    @Test(dataProvider = "simple_user")
    public void testGetProducts(String username, String password) {
        LoginBasePage loginPage = initPage(getDriver(), LoginBasePage.class);
        assert(loginPage.isPageOpened());
        ProductBasePage productPage = loginPage.login(username, password);
        assert(productPage.isPageOpened());
        assert !productPage.getProducts().isEmpty();
    }

    @Test(dataProvider = "user_products")
    public void testProductPage(String username, String password, String product) {
        LoginBasePage loginPage = initPage(getDriver(), LoginBasePage.class);
        assert(loginPage.isPageOpened());
        ProductBasePage productPage = loginPage.login(username, password);
        assert(productPage.isPageOpened());
        ProductComponent p = productPage.findProduct(product);
        assert(p != null);
        assert(p.getProductName().equals(product));
    }

    @Test(dataProvider = "user_checkout")
    public void testCheckout(String username, String password, String productName, String firstName, String lastName, String zipCode) {
        LoginBasePage loginPage = initPage(getDriver(), LoginBasePage.class);
        assert (loginPage.isPageOpened());
        ProductBasePage productPage = loginPage.login(username, password);
        assert (productPage.isPageOpened());
        CartBasePage cartPage = productPage.addToCart(productName);
        CheckoutBasePage checkoutPage = cartPage.checkout();
        OverviewBasePage overviewPage = checkoutPage.fillAndContinueCheckout(firstName, lastName, zipCode);
        CompleteBasePage completePage = overviewPage.finishCheckout();
        assert completePage.isCheckoutComplete();

    }

    @Test(dataProvider = "simple_user")
    public void testLogOut(String username, String password) {
        LoginBasePage loginPage = initPage(getDriver(), LoginBasePage.class);
        assert(loginPage.isPageOpened());
        ProductBasePage productPage = loginPage.login(username, password);
        assert(productPage.isPageOpened());
        MenuBasePage menuPage = productPage.getHeaderComponent().openMenu();
        loginPage = (LoginBasePage) menuPage.openPage(LOGOUT);
        assert(loginPage.isPageOpened());
    }

    @Test(dataProvider = "simple_user")
    public void testAllItems(String username, String password) {
        LoginBasePage loginPage = initPage(getDriver(), LoginBasePage.class);
        assert(loginPage.isPageOpened());
        ProductBasePage productPage = loginPage.login(username, password);
        assert(productPage.isPageOpened());
        MenuBasePage menuPage = productPage.getHeaderComponent().openMenu();
        productPage = (ProductBasePage) menuPage.openPage(ALL_ITEMS);
        assert(productPage.isPageOpened());
    }

    @Test(dataProvider = "simple_user")
    public void testAbout(String username, String password) {
        LoginBasePage loginPage = initPage(getDriver(), LoginBasePage.class);
        assert(loginPage.isPageOpened());
        ProductBasePage productPage = loginPage.login(username, password);
        assert(productPage.isPageOpened());
        MenuBasePage menuPage = productPage.getHeaderComponent().openMenu();
        AboutBasePage aboutBasePage = (AboutBasePage) menuPage.openPage(ABOUT);
        assert(aboutBasePage.isPageOpened());
    }

    @DataProvider(name = "simple_user")
    public Object[][] simple_user() {
        return new Object[][]{
                {STANDARD_USER, PASSWORD},
        };
    }

    @DataProvider(name = "user_products")
    public Object[][] users() {
        return new Object[][]{
                {STANDARD_USER, PASSWORD, P1},
                {STANDARD_USER, PASSWORD, P2},
                {STANDARD_USER, PASSWORD, P3},
                {STANDARD_USER, PASSWORD, P4},
        };
    }

    @DataProvider(name = "all_users")
    public Object[][] all_users() {
        return new Object[][]{
                {STANDARD_USER, PASSWORD, true},
                {LOCKED_OUT_USER, PASSWORD, false},
                {PROBLEM_USER, PASSWORD, true},
        };
    }

    @DataProvider(name = "user_checkout")
    public Object[][] user_checkout() {
        return new Object[][]{
                {STANDARD_USER, PASSWORD, P1, NAME, LAST_NAME, ZIP_CODE},
                {STANDARD_USER, PASSWORD, P2, NAME2, LAST_NAME2, ZIP_CODE2},
        };
    }
}
