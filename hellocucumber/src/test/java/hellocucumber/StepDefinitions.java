package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    String today;
    String actualAnswer;

    @Given("today is {string}")
    public void today_is_sunday(String day) {
        today = day;
    }

    @When("I ask if it's Friday")
    public void i_ask_if_it_s_friday() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("It should tell {string}")
    public void i_should_tell(String answer) {
            assertEquals(answer, actualAnswer);
    }
}

class IsItFriday {
    public static String isItFriday(String today) {
        if (today.equals("Friday")) {
            return "TGIF";
        }   
        return "Nope";
    }
}
