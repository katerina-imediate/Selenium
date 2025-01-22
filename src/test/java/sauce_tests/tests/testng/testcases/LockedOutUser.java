package sauce_tests.tests.testng.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import sauce_tests.pages.LoginPage;

public class LockedOutUser extends Webdriver {

    // TODO: Data provider
    String dtUsername = "locked_out_user";
    String dtPassword = "secret_sauce";

    @Test
    public void TC002_LockedOutUser() {
        LoginPage pgLogin = new LoginPage(driver);
        pgLogin.login(dtUsername, dtPassword);
        Assert.assertTrue(pgLogin.isUserLockedOut());
    }
}
