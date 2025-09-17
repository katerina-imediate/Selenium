package sauce_tests.tests.testng.testcases;

import browsers.enums.Browsers;
import browsers.selenium.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;



public abstract class Webdriver {

    WebDriver driver;
    String url = "https://www.saucedemo.com/";

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--allow-running-insecure-content");

        driver = new ChromeDriver(options);
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
