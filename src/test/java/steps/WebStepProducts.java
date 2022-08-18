package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.openqa.selenium.By;

import static pages.WebPagePool.webPageDetail;
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

    @And("I add an item {string} into the cart")
    public void iAddAnItemIntoTheCart(String productName) {
        webPageProducts.click(By.linkText(productName));
        webPageProducts.goToDetail();
        webPageDetail.click(webPageDetail.buttonAddToCart);
    }
}
