package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @Given("I open url of homepage")
    public void i_open_url_of_homepage() {
        // Write code here that turns the phrase above into concrete actions
        BrowserUtils.getDriver();
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
    }

