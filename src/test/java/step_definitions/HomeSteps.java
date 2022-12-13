package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

import java.awt.*;

public class HomeSteps implements CommonPage {
    HomePage page;

    public HomeSteps() {
        page = new HomePage();
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
}
