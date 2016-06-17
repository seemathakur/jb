package com.wmi.tutorials.bdd.stack.specs;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class StackBehaviourSteps {
    @Given("I have an empty stack")
    public void givenIHaveAnEmptyStack() { System.out.println("empty"); }

    @When("I push an item $item")
    public void whenIPushAnItem(@Named("item") String item) { System.out.println("push"); }

    @Then("I should count $expected")
    public void thenIShouldCount(@Named("expected") int expected) {
        int actual = 10;
        if (actual != expected) 
            throw new RuntimeException("expected:"+expected+";actual:"+actual);
    }
}
