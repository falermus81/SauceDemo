package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebPageDetail extends WebPageBase {
    public By buttonAddToCart = By.xpath("//button[contains(text(), \"Add to cart\")]");
    public WebPageDetail(WebDriver webDriver) {
        super(webDriver);
    }
}
