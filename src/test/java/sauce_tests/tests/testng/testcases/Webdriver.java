package sauce_tests.tests.testng.testcases;

import browsers.enums.Browsers;
import browsers.selenium.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import sauce_tests.config.Waits;

import java.time.Duration;

public abstract class Webdriver {

    // TODO: Externalise config data
    protected WebDriver driver;
    private Browsers browser = Browsers.CHROME;

    private String url = "https://www.saucedemo.com/";

    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.iniWebDriver(browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Waits.WAIT_MAX));
        //driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}