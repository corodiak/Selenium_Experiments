package cucumberTest.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumberTest.prodCode.isItFriday;

import static org.junit.Assert.*;

public class exampleSteps {
    private String today;
    private String actualAnswer;

    @Given("^today is (.*)")
    public void today_is_Sunday(String day) {
        this.today = day;
    }

    @When("^I ask whether it's (.*) yet$")
    public void i_ask_whether_is_s_Friday_yet(String wantedDay) {
        this.actualAnswer = isItFriday.isItFriday(today, wantedDay);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}