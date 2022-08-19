package steps;

import io.cucumber.java.en.And;
import static pages.WebPagePool.webPageInfo;

public class WebStepInfo {
    @And("In Info Page I input {string} and {string} and {string}")
    public void inInfoPageIInputAndAnd(String firstName, String lastName, String postalCode) {
        webPageInfo.sendKeys(webPageInfo.textFirstName, firstName);
        webPageInfo.sendKeys(webPageInfo.textLastName, lastName);
        webPageInfo.sendKeys(webPageInfo.textPostalCode, postalCode);
        webPageInfo.click(webPageInfo.buttonContinue);
        webPageInfo.goToOverview();
    }
}
