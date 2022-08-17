package steps;

import io.cucumber.java.en.Then;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;

import static pages.WebPagePool.webPageProducts;

public class WebStepProducts {
    @Then("I should see a page with title {string}")
    public void iShouldSeeAPageWithTitle(@NotNull String title) {
        Assert.assertArrayEquals(title.toCharArray(), webPageProducts.getTitle().toCharArray());
    }

    @Then("I should see a page with header {string}")
    public void iShouldSeeAPageWithHeader(@NotNull String header) {
        Assert.assertArrayEquals(header.toCharArray(), webPageProducts.getElementTitle(webPageProducts.pageHeader).toCharArray());
    }
}
