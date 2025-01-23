package sauce_tests.tests.testng.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import sauce_tests.enums.AppMenu;
import sauce_tests.pages.HeaderPage;
import sauce_tests.pages.LoginPage;
import sauce_tests.pages.ProductsPage;

public class AddToCart_Count extends Webdriver {

    // TODO: Data provider
    String dtUsername = "standard_user";
    String dtPassword = "secret_sauce";

    String prod1 = "Sauce Labs Onesie";

    @Test
    private void test() {
        new LoginPage(chromeDriver).login(dtUsername, dtPassword);
        new HeaderPage(chromeDriver).navigateToMenu(AppMenu.LOGOUT);
    }

    @Test
    public void AddToCart_Count() {
        new LoginPage(chromeDriver).login(dtUsername, dtPassword);

        ProductsPage pgProducts = new ProductsPage(chromeDriver);
        pgProducts.add(prod1);

        HeaderPage pgHeader = new HeaderPage(chromeDriver);
        Assert.assertEquals(1, pgHeader.getCartCount());
    }
}
