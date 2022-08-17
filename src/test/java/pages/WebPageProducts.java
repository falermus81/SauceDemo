package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebPageProducts extends WebPageBase {
    public By pageHeader = By.cssSelector("#header_container > div.header_secondary_container > span");
    public WebPageProducts(WebDriver webDriver) {
        super(webDriver);
    }
}
