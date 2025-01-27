package sauce_tests.tests.testng.testcases;

import browsers.enums.Browsers;
import browsers.selenium.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import sauce_tests.config.Waits;
import java.time.Duration;


public abstract class Webdriver {

    WebDriver driver = new ChromeDriver();
//    private Browsers browser = Browsers.CHROME;
    private String url = "https://www.saucedemo.com/";

    @BeforeMethod
    public void setup() {
//        driver = BrowserFactory.launch(driver);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Waits.WAIT_IMPLICIT));
//        driver.manage().window().maximize();
        driver.get(url);
    }

//    @AfterMethod
//    public void tearDown() {
//       driver.quit();
//    }
}