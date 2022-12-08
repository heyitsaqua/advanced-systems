package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
    public void i_open_url_of_homepage() {
        // Write code here that turns the phrase above into concrete actions
        BrowserUtils.getDriver();
    }

}
