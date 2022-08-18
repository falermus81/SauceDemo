package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.WebPageLanding;

import java.util.List;
import java.util.Map;

import static pages.WebPagePool.webPageLanding;

public class WebStepLanding {
    @Given("The web {string} has been opened using Chrome")
    public void theWebHasBeenOpenedUsingChrome(String url) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);
        webPageLanding = new WebPageLanding(webDriver);
    }

    @When("I input {word} and {word}")
    public void iInputUsernameAndPassword(String username, String password) {
        webPageLanding.sendKeys(webPageLanding.textUserName, username);
        webPageLanding.sendKeys(webPageLanding.password, password);
        webPageLanding.click(webPageLanding.buttonLogin);
        webPageLanding.goToProducts();
    }

    @And("I quit the test")
    public void iQuitTheTest() {
        webPageLanding.quit();
    }

    @Then("I should see a toast with text {string}")
    public void iShouldSeeAToastWithText(@NotNull String errorMessage) {
        Assert.assertArrayEquals(errorMessage.toCharArray(), webPageLanding.getElementTitle(webPageLanding.messageErrorLockedOut).toCharArray());
    }

    @And("I login using an account")
    public void iLoginUsingAnAccount(@NotNull DataTable dataTable) {
        List<Map<String, String>> account = dataTable.asMaps();
        String username = account.get(0).get("username");
        String password = account.get(0).get("password");
        webPageLanding.sendKeys(webPageLanding.textUserName, username);
        webPageLanding.sendKeys(webPageLanding.password, password);
        webPageLanding.click(webPageLanding.buttonLogin);
        webPageLanding.goToProducts();
    }
}
