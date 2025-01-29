package sauce_tests.tests.testng.testcases;

import browsers.enums.Browsers;
import browsers.selenium.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import sauce_tests.config.Waits;
import java.time.Duration;


public abstract class Webdriver {



       ChromeDriver driver = new ChromeDriver();

//    private Browsers browser = Browsers.CHROME;

        String url = "https://www.saucedemo.com/";

    @BeforeClass
    public void setup() {
//        System.setProperty("webdriver.chrome.driver","chromedriver.linux");
//       driver = BrowserFactory.launch(driver);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Waits.WAIT_IMPLICIT));
//        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
