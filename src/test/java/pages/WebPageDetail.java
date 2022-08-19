package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.WebPagePool.webPageCart;

public class WebPageDetail extends WebPageBase {
    public By buttonAddToCart = By.xpath("//button[contains(text(), \"Add to cart\")]");
    public By linkShoppingCart = By.id("shopping_cart_container");
    public WebPageDetail(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToCart() {
        webPageCart = new WebPageCart(this.webDriver);
    }
}
