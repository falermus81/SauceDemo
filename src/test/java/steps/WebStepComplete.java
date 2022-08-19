package steps;

import io.cucumber.java.en.Then;
import static pages.WebPagePool.webPageComplete;

public class WebStepComplete {
    @Then("In Complete Page I quit the browser")
    public void inCompletePageIQuitTheBrowser() {
        webPageComplete.quit();
    }
}
