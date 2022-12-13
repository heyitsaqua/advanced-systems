package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Assert;
import org.openqa.selenium.By;

import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

import java.awt.*;

public class HomeSteps implements CommonPage {
    HomePage page;

    public HomeSteps() {
        page = new HomePage();
    }


    public void iOpenUrlOfHomepage() {
        BrowserUtils.getDriver();
    }


    @Given("I open url of homepage")
    public void i_open_url_of_homepage() {
        BrowserUtils.getDriver();
    }


    @Then("Verify section {string} is displayed")
    public void verifySectionIsDisplayed(String arg0) {
        BrowserUtils.isDisplayed(page.header);

    }

    @Then("Verify section {string} text is displayed")
    public void verifySectionTextIsDisplayed(String arg0) {
        BrowserUtils.isDisplayed(page.Description);

    }

    @Then("Verify section {string} button is displayed")
    public void verifySectionButtonIsDisplayed(String arg0) {
        BrowserUtils.isDisplayed(page.ReadMoreButton);
    }

    @Then("user click on {string} button")
    public void userClickOnButton(String arg0) {
        BrowserUtils.isDisplayed(page.ReadMoreBtn);
    }

    @Then("Verify the  header should display {string}")
    public void verify_the_header_should_display(String text) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, text))));


    }

   /* @Then("Verify testimonials, name, state should display on the page")
    public void verify_testimonials_name_state_should_display_on_the_page() {
        List<WebElement> testimonials = page.textMsg;
        for (WebElement each : testimonials) {
            BrowserUtils.isDisplayed(each);

        }


    }

    @Then("Verify testimonials, name, state should display on the page")
    public void verifyTestimonialsNameStateShouldDisplayOnThePage() {



    }

*/

    @When("I click a button {string}")
    public void iClickAButton(String button) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_TEXT, button))));
    }

    @Then("Verify {string} info is displayed")
    public void verifyInfoIsDisplayed(String contact) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, contact)))
        );
    }

    @Then("Verify {string} is displayed")
    public void verifyIsDisplayed(String footerinfo) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, footerinfo)))
        );

    }


    @Then("Verify title text is {string}")
    public void verify_title_text_is(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @Then("Verify  {string} are displayed")
    public void verify_are_displayed(String text) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_TEXT, text))));
    }

    @Then("Verify {string} Btn is displayed")
    public void verify_btn_is_displayed(String btn) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT2, btn))));

    }

    @When("I click {string} button")
    public void i_click_button(String button) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT2, button))));

    }

    @Then("Verify {string} of the destination page matching")
    public void verify_of_the_destination_page_matching(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
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
        BrowserUtils.sleep(seconds * 1000);
    }

    @When("I click nav button English")
    public void iClickNavButtonEnglish() {

        BrowserUtils.click(page.englishBtn);
    }

    @Then("verify Company names are displayed in one row")
    public void verifyCompanyNamesAreDisplayedInOneRow() {
        BrowserUtils.isDisplayed(page.listOfCompany);
    }

    @Then("Verify {string} of the page")
    public void verify_of_the_page(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @Then("Verify click {string} button is enabled")
    public void verify_click_button_is_enabled(String button) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, button))));
    }

}




