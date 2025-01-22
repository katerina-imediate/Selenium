package sauce_tests.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
