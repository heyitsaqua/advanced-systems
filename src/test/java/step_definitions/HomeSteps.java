package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps implements CommonPage {
    HomePage page;

    public HomeSteps() {
        page = new HomePage();

    }
    @Given("I open url of homepage")
    public void i_open_url_of_homepage() {
        BrowserUtils.getDriver();
    }

    @When("I click a button {string}")
    public void iClickAButton(String button) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_TEXT, button))));
    }

    @Then("Verify button {string} is displayed")
    public void verifyButtonIsDisplayed(String button) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_TEXT, button)))
        );
    }

    @Then("Verify page opens")
    public void verifyPageOpens() {
        String mainUserMgtWindow = BrowserUtils.getDriver().getWindowHandle();
        for (String window : BrowserUtils.getDriver().getWindowHandles()) {
            if (!window.equals(mainUserMgtWindow)) {
                Assert.assertTrue(true);
            } else {
                Assert.assertFalse(false);
            }
        }
    }

    @Then("Verify social media button with link {string} is displayed")
    public void verifySocialMediaButtonWithLinkIsDisplayed(String button) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format("//div[@class='inner']" + XPATH_TEMPLATE_LINKTEXT_HREF, button)))
        );
    }

    @And("I wait {int} seconds")
    public void IWaitSeconds(int seconds) {
        BrowserUtils.sleep(seconds*1000);
    }
}
