package sauce_tests.tests.testng.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import sauce_tests.enums.AppMenu;
import sauce_tests.pages.HeaderPage;
import sauce_tests.pages.LoginPage;

public class Logout extends  Webdriver{

    // TODO: Data provider
    String dtUsername = "standard_user";
    String dtPassword = "secret_sauce";

    @Test
    public void Logout() {
        LoginPage pgLogin = new LoginPage(driver);
        pgLogin.login(dtUsername, dtPassword);

        new HeaderPage(driver).navigateToMenu(AppMenu.LOGOUT);
        Assert.assertTrue(pgLogin.isAt());
    }
}
