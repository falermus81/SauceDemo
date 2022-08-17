package pages;

import org.openqa.selenium.By;

public interface WebPage {
    void click(By by);
    void sendKeys(By by, String text);
    String getTitle();
    String getElementTitle(By by);
    void quit();
}
