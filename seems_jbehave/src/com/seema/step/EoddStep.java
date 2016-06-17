package com.seema.step;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import com.seema.core.Eodd;

public class EoddStep {
	
private Eodd eodd;
	
	@Given("a calculator")
	public void setCal() {
		eodd=new Eodd();
		System.out.println("Created");
	}
	
	
	@When("I divide $num1 by $num2")
	public void DivideTwoNumberCal(int x,int y) {
		eodd.divideTwoNumber(x, y);
	
	}		
	@Then("the outcome should $res")
	public void testResult(int output) {
		 Assert.assertEquals(output, eodd.getresult());

}
	@When("I check $num  is odd or even")
	public void checkEvenOdd(int x){
		eodd.evenOdd(x);
	}
	@Then("result is either odd or even")
	public void showEvenOdd(){
		int chk=eodd.getresult();
		String str=eodd.checkResult(chk);
		System.out.println(str);
		
	}
	@When("Principle $num,rate $num,time $num is set")
	public void verifyInterest(int x , int y, int z){
		eodd.calculateInterest(x,y,z);
}
	@Then("$num is the interest")
	public void resultInterest(int x){
		Assert.assertEquals(x, eodd.getresult());
	}
	@When("width $num, height $num, breadth $num is placed")
	public void boxVolume(int x,int y,int z){
		eodd.calculateVolume(x,y,z);
	}
	@Then("$num is the volume")
	public void resultVolume(int x){
		Assert.assertEquals(x, eodd.getresult());
	}
	


	}
