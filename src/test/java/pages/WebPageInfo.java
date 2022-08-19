package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.WebPagePool.webPageOverview;

public class WebPageInfo extends WebPageBase {
    public By textFirstName = By.id("first-name");
    public By textLastName = By.id("last-name");
    public By textPostalCode = By.id("postal-code");
    public By buttonContinue = By.id("continue");
    public WebPageInfo(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToOverview() {
        webPageOverview = new WebPageOverview(this.webDriver);
    }
}
