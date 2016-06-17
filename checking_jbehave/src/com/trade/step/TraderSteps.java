package com.trade.step;



import java.util.Stack;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.Story;

import com.trade.story.TradeStory;

public class TraderSteps { 
	private Story stock ;
	private Story Story;
	@Given("a stock of symbol $ symbol and a threshold of $ threshold")
	public void aStock(String symbol, double threshold){
		stock = new Story();
	}
	@When("the stock is traded at $ price")
	public void theStockIsTradedAt(String price){
		stock.asMeta(price)
		;}
	@Then("the alert status should be $ status")
	public void theAlertStatusShouldBe(String status){
		//ensureThat(stock.getstatus().equalTo(status));
	}

}
























