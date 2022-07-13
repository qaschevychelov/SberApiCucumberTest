package sbercucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefinitions {
    @Given("prepare")
    public void prepare() {
        assertTrue(true, "oops failed");
    }

    @When("send request {string}")
    public void send(String param) {
        assertTrue(true, "oops failed");
    }

    @Then("resp {string}")
    public void resp(String param) {
        assertTrue(false, "oops failed");
    }
}
