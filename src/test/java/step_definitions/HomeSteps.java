package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        // Write code here that turns the phrase above into concrete actions
        BrowserUtils.getDriver();
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
                        By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, button)))
        );
    }


    @When("I click nav button English")
    public void iClickNavButtonEnglish() {
            BrowserUtils.click(page.englishBtn);}

    @Then("Verify {string} of the page")
    public void verify_of_the_page(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @Then("Verify click {string} button is enabled")
    public void verify_click_button_is_enabled(String button) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, button))));
    }
    }


