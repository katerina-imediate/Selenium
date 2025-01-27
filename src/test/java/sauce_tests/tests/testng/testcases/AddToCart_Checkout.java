package sauce_tests.tests.testng.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import sauce_tests.contexts.CheckoutContext;
import sauce_tests.pages.CheckoutPage;
import sauce_tests.pages.LoginPage;
import sauce_tests.pages.ProductsPage;
import sauce_tests.pages.ShoppingCartPage;

public class AddToCart_Checkout extends Webdriver {

    // TODO: Data provider
    String dtUsername = "standard_user";
    String dtPassword = "secret_sauce";

    String prod1 = "Sauce Labs Onesie";
    String prod2 = "Test.allTheThings() T-Shirt (Red)";

    @Test
    public void AddToCart_Checkout() {

        // TODO: Data provider
        CheckoutContext dtYourInfo = new CheckoutContext();
        dtYourInfo.setFirstName("John");
        dtYourInfo.setLastName("Doe");
        dtYourInfo.setZip("3000");

        new LoginPage(driver).login(dtUsername, dtPassword);
        new ProductsPage(driver)
                .add(prod1)
                .add(prod2);

        CheckoutPage pgCheckout = new ShoppingCartPage(driver)
                .open()
                .checkout()
                .setInformation(dtYourInfo)
                .finish();
        Assert.assertTrue(pgCheckout.isCheckoutComplete());
    }
}
