package step_definitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import utils.BrowserUtils;
import utils.ConfigReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.apache.http.HttpStatus.*;

public class APIsteps {

    private static final String path = "/api/school/programs/devcourse";
    private static final String path2 = "/api/school/programs/sdetcourse";

    Response response;

    @Given("User gets Base URL")
    public void userGetsBaseURL() {
        RestAssured.baseURI = ConfigReader.readProperty("BASE_URL");
    }
//21
    @When("User send GET request to the endpoint {string}")
    public void userSendGETRequestToTheEndpoint(String endpoint) {
        response = RestAssured.given()
                .when()
                .get(endpoint)
                .then()
                .log().all()
                .extract()
                .response();
    }
    //21
    @Then("User should get status code {int}")
    public void userShouldGetStatusCode(int statusCode) {
        Assert.assertEquals(statusCode, response.statusCode());
    }
    @Then("the response should include fields called {string}, {string} and {string}")
    public void theResponseShouldIncludeFieldsCalledAnd(String field1, String field2, String field3) {
        Assert.assertNotNull(response.jsonPath().getString("data." + field1 + "[0]"));
        Assert.assertNotNull(response.jsonPath().getString("data." + field2 + "[0]"));
        Assert.assertNotNull(response.jsonPath().getString("data." + field3 + "[0]"));
    }

    @Then("the response should include following fields")
    public void theResponseShouldIncludeFollowingFields(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            Assert.assertNotNull(response.jsonPath().getString("data." + list.get(i) + "[0]"));
        }
    }

    @Then("User sends request with username and password")
    public void userSendsRequestWithUsernameAndPassword() {
        String path = "/api/school/departments/gettoken";

        response = RestAssured.given()
                .auth().preemptive().basic("user", "user123")
                .when()
                .get(path)
                //.prettyPeek()
                .then()
                .extract()// Method that extracts the response JSON DATA
                .response();
    }
//27
    @When("User adds basic auth with username {string} and password {string}")
    public void userAddsBasicAuthWithUsernameAndPassword(String arg0, String arg1) {
        String path = "/api/school/departments/gettoken";

        response = RestAssured.given()
                .auth().preemptive().basic("user", "user123")
                .when()
                .get(path)
                .prettyPeek()
                .then()
                .extract()// Method that extracts the response JSON DATA
                .response();
    }
    //27
    @Then("response should contain a {string}")
    public void response_should_contain_a(String token) {

    }
    //27
    @Then("response should contain a message {string}")
    public void response_should_contain_a_message(String string) {


    }
}
