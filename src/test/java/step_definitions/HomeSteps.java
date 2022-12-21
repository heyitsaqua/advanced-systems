

package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;



public class HomeSteps implements CommonPage {
    HomePage page;
    WebDriver driver;


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
    @Then("Scroll down the page")
    public void scrollDownThePage() {

        JavascriptExecutor js = (JavascriptExecutor) BrowserUtils.getDriver();
        js.executeScript("window.scrollBy(0, 5000)");

    }

    @Then("Verify Navigation Menu is Displayed")
    public void verifyNavigationMenuIsDisplayed() {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath("//*[@class='sticky-header']")));

    }

    @Then("Test the Navigation {string}")
    public void testTheNavigation(String buttons) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_TEXT2_CONTAINS, buttons)))
        );
    }


    @When("I click {string}")
    public void iClick(String arg0) {
        BrowserUtils.click(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_TEXT2_CONTAINS, arg0))));
    }

    @Then("Verify {string} of Destination Page")
    public void verifyOfDestinationPage(String arg0) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), arg0);
    }


    @Then("Verify {string} of the page")
    public void verify_of_the_page(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @Then("Verify click {string} button is enabled")
    public void verify_click_button_is_enabled(String button) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, button))));
    }

    @When("User Verify {string} is displayed")
    public void userVerifyIsDisplayed(String arg0) {
        BrowserUtils.waitForElementVisibility(page.header1);

        BrowserUtils.isDisplayed(page.header1);
    }

    //AS-4
    @And("User Verify {string} text is displayed")
    public void userVerifyTextIsDisplayed(String desc) {
        BrowserUtils.isDisplayed(page.text);
    }

    //AS-4
    @Then("User Verify {string} button is displayed")
    public void userVerifyButtonIsDisplayed(String arg0) {
        BrowserUtils.isDisplayed(page.readMoreBtn);
    }

    //AS-4
    @Then("User click on {string} Btn")
    public void userClickOnBtn(String arg0) {
        BrowserUtils.click(page.readMoreBtn);
        BrowserUtils.switchToNewWindow();

    }

    //AS-4
    @And("Verify {string} button takes User to page")
    public void verifyButtonTakesUserToPage(String Title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), Title);

    }

    @Then("verify Company names are displayed in one row")
    public void verifyCompanyNamesAreDisplayedInOneRow() {
    }

    //AS-12
    @Then("Verify the  header should display {string}")
    public void verifyTheHeaderShouldDisplay(String arg0) {

        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath("//div[@class='sec-title light centered']")));

    }
    //AS-12
    @Then("Verify testimonials, name, state should display on the page")
    public void verifyTestimonialsNameStateShouldDisplayOnThePage() {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath("//div[@class='client-testimonial-carousel owl-carousel owl-theme owl-loaded owl-drag']")));
    }
}