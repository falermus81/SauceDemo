package steps;

import io.cucumber.java.en.When;
import static pages.WebPagePool.webPageCart;
import static pages.WebPagePool.webPageDetail;

public class WebStepCart {
    @When("I tap checkout button")
    public void iTapCheckoutButton() {
        webPageCart.click(webPageCart.buttonCheckout);
        webPageCart.goToInfo();
    }
}