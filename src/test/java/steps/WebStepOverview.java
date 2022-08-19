package steps;

import io.cucumber.java.en.And;
import static pages.WebPagePool.webPageOverview;

public class WebStepOverview {
    @And("In Overview Page I confirm my order")
    public void inOverviewPageIConfirmMyOrder() {
        webPageOverview.click(webPageOverview.buttonFinish);
        webPageOverview.goToComplete();
    }
}
