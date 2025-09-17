package browsers.selenium;

import browsers.enums.Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver launch (WebDriver driver) {
       if (driver.equals(Browsers.CHROME)) {

            ChromeOptions options = new ChromeOptions();
           // options.addArguments("--headless=new");
            options.addArguments("--allow-running-insecure-content, --disable-web-security");
            ChromeDriver  chromeDriver = new ChromeDriver(options);
//            options.addArguments("--user-data-dir=/user-data"); --allow-running-insecure-content", "--disable-web-security"
//            options.addArguments("--remote-debugging-port=9222");
//            options.setBinary("/usr/bin/google-chrome");

            return chromeDriver;
        } else if (driver.equals(Browsers.FIREFOX)) {
            return new FirefoxDriver();
        } else if (driver.equals(Browsers.EDGE)) {
            return new EdgeDriver();
        }
        return null;
    }
}
