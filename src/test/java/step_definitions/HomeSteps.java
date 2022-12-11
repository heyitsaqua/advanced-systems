package step_definitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

import java.util.List;

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

    @Then("Verify button media Btn is displayed")
    public void verify_button_media_btn_is_displayed() {
        for (WebElement eachSite : page.mediaBtns2) {
            BrowserUtils.isDisplayed(eachSite);

        }
    }

    //    @When("I click {string} btn")
//    public void i_click_btn(String button) {
//        for (WebElement eachSite : page.mediaBtns2) {
//            BrowserUtils.click(eachSite);
//            //BrowserUtils.sleep(500);
//            }
//    }
    @When("I click {string} button")
    public void i_click_button(String button) {
BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT2, button))));

        }


    @Then("Verify {string} of the destination page matching")
    public void verify_of_the_destination_page_matching(String title) {
//        BrowserUtils.isDisplayed(
//                BrowserUtils.getDriver().findElement(
//                        By.xpath(String.format(XPATH_TEMPLATE_TEXT3, title))));

        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);

    }


//    @Then("Verify {string} of the destination page")
//    public void verify_of_the_destination_page(String title) {
//        BrowserUtils.isDisplayed(
//                BrowserUtils.getDriver().findElement(
//                        By.xpath(String.format(XPATH_TEMPLATE_TEXT, title)))

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
        }


