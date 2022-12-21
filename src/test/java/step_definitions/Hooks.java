package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.BrowserUtils;
import utils.CucumberLogUtils;

public class Hooks {

    @Before

    public void setUp(Scenario scenario) {
        //initializes the driver object to open the browser
        // BrowserUtils.getDriver();
        CucumberLogUtils.initScenario(scenario);
        scenario.log(CucumberLogUtils.getLogTime() + ""); //custom message would go here
    }


    @After
    public void tearDown(Scenario scenario) {
        if (BrowserUtils.checkDriverStatus() != null) {
            if (scenario.isFailed()) {

                CucumberLogUtils.logFail("Scenario failed", true);
            } else {
                CucumberLogUtils.logPass("Scenario passed", true);

            }
        }
        BrowserUtils.quitDriver();
    }
}

