package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.WebPagePool.webPageDetail;

public class WebPageProducts extends WebPageBase {
    //public By pageHeader = By.cssSelector("#header_container > div.header_secondary_container > span");
    public By pageHeader = By.cssSelector("div.header_secondary_container>span");
    public By linkShoppingCart = By.id("shopping_cart_container");
    public WebPageProducts(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToDetail() {
        webPageDetail = new WebPageDetail(this.webDriver);
    }
}
