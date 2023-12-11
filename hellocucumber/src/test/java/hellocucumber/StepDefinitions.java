package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    String today;
    String actualAnswer;

    @Given("today is Sunday")
    public void today_is_sunday() {
        today = "Sunday";
    }

    @When("I ask if it's Friday")
    public void i_ask_if_it_s_friday() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("It should tell {string}")
    public void i_should_tell(String string) {
            assertEquals(string, actualAnswer);
    }

    @Given("today is Friday")
    public void today_is_friday() {
        today = "Friday";
    }

    @Given("today is anything else!")
    public void today_is_anything_else() {
        today = "anything else";
    }
}

class IsItFriday {
    public static String isItFriday(String today) {
        if (today.equals("Friday")) {
            return "TGIF";
        }   
        return "no";
    }
}
