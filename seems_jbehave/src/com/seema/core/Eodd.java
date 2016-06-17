package com.seema.core;

public class Eodd {
	
		private int num;

		public Eodd() {
			this.num = 0;
		}
 public int getresult() {
			return this.num;
}

public void divideTwoNumber(int x, int y) {
			num = x%y;
			}
		public void evenOdd(int x){
			num =x%2;
		}
		public String checkResult(int x){
			if (x==0)
				return("even");
				else
				return("odd");
		}
public void calculateInterest(int x ,int y, int z){
	num=(x * y* z)/100;
}
public void calculateVolume(int x,int y,int z){
	num=(x*y*z);
}

}
