package sauce_tests.tests.testng.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sauce_tests.contexts.CheckoutContext;
import sauce_tests.pages.CheckoutPage;
import sauce_tests.pages.LoginPage;
import sauce_tests.pages.ProductsPage;
import sauce_tests.pages.ShoppingCartPage;

import java.io.File;

public class AddToCart_Checkout {

    // TODO: Data provider
    String dtUsername = "standard_user";
    String dtPassword = "secret_sauce";

    String prod1 = "Sauce Labs Onesie";
    String prod2 = "Test.allTheThings() T-Shirt (Red)";

    ChromeDriver driver = new ChromeDriver();

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().clearCache();

        driver.manage().window().maximize();
//        System.setProperty("webdriver.chrome.driver", new File(System.getProperty("user.home"), "chromedriver.exe").getAbsolutePath());

        driver.get("https://www.saucedemo.com/");
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void AddToCart_Checkout() {

        // TODO: Data provider
        CheckoutContext dtYourInfo = new CheckoutContext();
        dtYourInfo.setFirstName("John");
        dtYourInfo.setLastName("Doe");
        dtYourInfo.setZip("3000");
        LoginPage pgLogin = new LoginPage(driver);

        Assert.assertTrue(pgLogin.isAt());
        pgLogin.login(dtUsername, dtPassword);
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
