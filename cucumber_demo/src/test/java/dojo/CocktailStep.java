package dojo;

import java.util.List;
import java.util.ArrayList;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber_demo.Order;

import static org.junit.Assert.*;
import org.junit.Test;

public class CocktailStep {
    private Order order;

    @Given("(.*) who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(String string) {
        order = new Order();
        order.declareOwner(string);
    }

    @When("an order is declared for (.*)")
    public void an_order_is_declared_for_juliette(String string) {
        order.declareTarget(string);
    }

    @Then("there is {int} cocktails in the order")
    public void there_is_cocktails_in_the_order(int nbCocktails) {
        List<String> cocktails =  order.getCocktails();
        assertEquals(nbCocktails, cocktails.size());
    }

    @When("a message saying {string} is added")
    public void a_message_saying_is_added(String string) {
        order.setMessage(string);
    }

    @Then("the ticket must say {string}")
    public void the_ticket_must_say(String string) {
        assertEquals(string, order.getMessage());
    }
}
