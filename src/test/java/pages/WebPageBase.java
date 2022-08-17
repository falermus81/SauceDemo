package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class WebPageBase implements WebPage {
    protected WebDriver webDriver;
    private final WebDriverWait webDriverWait;
    private final Actions actions;

    public WebPageBase(WebDriver webDriver) {
        this.webDriver = webDriver;
        long timeOut = 30;
        this.webDriverWait = new WebDriverWait(this.webDriver, Duration.ofSeconds(timeOut));
        this.actions = new Actions(this.webDriver);
    }

    @Override
    public void click(By by) {
        List<WebElement> webElements = this.webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        for (WebElement i: webElements) {
            WebElement webElement = this.webDriverWait.until(ExpectedConditions.elementToBeClickable(i));
            this.actions.click(webElement).perform();
            break;
        }
    }

    @Override
    public void sendKeys(By by, String text) {
        List<WebElement> webElements = this.webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        for (WebElement i: webElements) {
            WebElement webElement = this.webDriverWait.until(ExpectedConditions.elementToBeClickable(i));
            this.actions.sendKeys(webElement, text).perform();
            break;
        }
    }

    @Override
    public String getTitle() {
        return this.webDriver.getTitle();
    }

    @Override
    public String getElementTitle(By by) {
        List<WebElement> webElements = this.webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        String ret = "";
        for (WebElement i: webElements) {
            ret = i.getText();
            break;
        }

        return ret;
    }

    @Override
    public void quit() {
        this.webDriver.quit();
    }
}
