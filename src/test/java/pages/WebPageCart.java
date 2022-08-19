package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.WebPagePool.webPageInfo;

public class WebPageCart extends WebPageBase {
    public By buttonCheckout = By.id("checkout");
    public WebPageCart(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToInfo() {
        webPageInfo = new WebPageInfo(this.webDriver);
    }
}
