*/*Sample story

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development
					 
Scenario:  A scenario is a collection of executable steps of different type
Given step represents a precondition to an event
When step represents the occurrence of the event
Then step represents the outcome of the event
					 
Scenario:  Another scenario exploring different combination of events
Given a precondition  
When a negative event occurs  
Then a the outcome should be captured*/*
Scenario:  trader is not alerted below threshold
 
Given a stock of symbol STK1 and a threshold of 10.0
When the stock is traded at 5.0
Then the alert status should be OFF
 
Scenario:  trader is alerted above threshold
 
Given a stock of symbol STK1 and a threshold of 10.0
When the stock is traded at 11.0
Then the alert status should be 