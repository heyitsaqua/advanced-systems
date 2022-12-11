package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps implements CommonPage {
    HomePage page;

    public HomeSteps() {
        page = new HomePage();

    }

    @Given("I open url of homepage")
    public void iOpenUrlOfHomepage() {
        BrowserUtils.getDriver();
    }


    @Then("Verify {string} info is displayed")
    public void verifyInfoIsDisplayed(String contact) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT,contact)))
        );
    }

    @Then("Verify {string} is displayed")
    public void verifyIsDisplayed(String footerinfo) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS,footerinfo)))
        );

    }
}

