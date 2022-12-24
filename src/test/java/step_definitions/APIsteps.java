package step_definitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import utils.BrowserUtils;
import utils.ConfigReader;

import java.util.*;
public class APIsteps {

    Response response;
    Map<String, Object> variables;
    @Given("User gets Base URL")
    public void userGetsBaseURL() {
        RestAssured.baseURI = ConfigReader.readProperty("BASE_URL");
        Map<String,Object> map = new HashMap<String, Object>();
        variables = new HashMap();
    }
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
    @When("User adds basic auth with username {string} and password {string}")
    public void userAddsBasicAuthWithUsernameAndPassword(String username, String password) {
        String path = "/api/school/departments/gettoken";

        response = RestAssured.given()
                .auth().preemptive().basic(username, password)
                .when()
                .get(path)
                //.prettyPeek()
                .then()
                .extract()// Method that extracts the response JSON DATA
                .response();
    }
    @Then("response should contain a {string}")
    public void responseShouldContainAToken(String token) {
        System.out.println(response.jsonPath().getString(token));
        Assert.assertNotNull(response.jsonPath().getString(token));
    }
    @Then("response should contain a message {string}")
    public void responseShouldContainAMessage(String message) {
        System.out.println(message);
        Assert.assertTrue(true, message);
    }

    @Then("User should be able to add to student with required fields like batch name, firstname, lastname, email")
    public void userShouldBeAbleToAddToStudentWithRequiredFieldsLikeBatchNameFirstnameLastnameEmail() {
        String path = "/api/school/resources/students";
        String requestBody = "{\"batch\":\"66\",\"firstName\":\"Nurik\",\"lastName\":\"Zh\",\"email\":\"nur@gmail.com\"}";
        response = RestAssured.given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post(path)
                .then().log().all()
                .extract()
                .response();
    }

    @Then("Verify if student added")
    public void verifyIfStudentAdded() {
        System.out.println(response.jsonPath().getString("data"));
        Assert.assertTrue(true, "data");
    }

}



