package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.WebPagePool.webPageProducts;

public class WebPageLanding extends WebPageBase {
    public By textUserName = By.id("user-name");
    public By password = By.id("password");
    public By buttonLogin = By.id("login-button");
    //public By messageErrorLockedOut = By.cssSelector("#login_button_container > div > form > div.error-message-container.error");
    public By messageErrorLockedOut = By.className("error-message-container");


    public WebPageLanding(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToProducts() {
        webPageProducts = new WebPageProducts(this.webDriver);
    }
}
