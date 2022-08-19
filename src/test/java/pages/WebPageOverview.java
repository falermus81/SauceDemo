package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static pages.WebPagePool.webPageComplete;

public class WebPageOverview extends WebPageBase {
    public By buttonFinish = By.id("finish");
    public WebPageOverview(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToComplete() {
        webPageComplete = new WebPageComplete(this.webDriver);
    }
}
