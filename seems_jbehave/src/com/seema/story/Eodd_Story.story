Scenario: CAl divide testin
Given a calculator
When I divide 4 by 2
Then the outcome should 0

Scenario: Check odd or even number
Given a calculator
When I check 11  is odd or even
Then result is either odd or even

Scenario: Calculating simple interest
Given a calculator
When Principle 100,rate 5,time 6 is set
Then 30 is the interest

Scenario: Calculating volume of box
Given a calculator
When width 10, height 20, breadth 30 is placed
Then 6000 is the volume
