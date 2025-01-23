package sauce_tests.tests.testng.testcases;

//import browsers.enums.Browsers;
//import browsers.selenium.BrowserFactory;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
//import sauce_tests.config.Waits;
//import java.time.Duration;

public abstract class Webdriver {

    // TODO: Externalise config data
    FirefoxDriver chromeDriver = new FirefoxDriver();
   // public Browsers browser = Browsers.CHROME;

    public String url = "https://www.saucedemo.com/";

    @BeforeMethod
    public void setup() {
        //chromeDriver = BrowserFactory.iniWebDriver(chromeDriver);
       // chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Waits.WAIT_MAX));
        //driver.manage().window().maximize();
        chromeDriver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        chromeDriver.quit();
    }
}