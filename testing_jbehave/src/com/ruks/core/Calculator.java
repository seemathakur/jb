package com.ruks.core;

public class Calculator {
	private int sum;
	private int sub;

	public Calculator() {
		this.sum = 0;
		this.sub =0;
	}

	public void addTwoNumber(int x, int y) {
		sum = x + y;
	}
public void subTwoNumber(int x, int y){
	sub = y - x;
}

	public int getresult() {
		return this.sum;
	}
	public int get_result() {
		return this.sub;
	}


}
