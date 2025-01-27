package browsers.selenium;

import browsers.enums.Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver launch(Browsers browser) {
        if (browser.equals(Browsers.CHROME)) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--profile-directory=Profile 1");

//            options.addArguments("--user-data-dir={}");
//            options.addArguments("--remote-debugging-port=9222");
//            options.setBinary("/usr/bin/google-chrome");

            return new ChromeDriver();
        } else if (browser.equals(Browsers.FIREFOX)) {
            return new FirefoxDriver();
        } else if (browser.equals(Browsers.EDGE)) {
            return new EdgeDriver();
        }
        return new ChromeDriver();
    }
}
