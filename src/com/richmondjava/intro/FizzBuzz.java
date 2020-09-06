package com.richmondjava.intro;

public class FizzBuzz {

	public String getFizzBuzz(int lowerBound, int Upperbound) {
		String output = "";
		for (int i = lowerBound; i <= Upperbound; i++) {
			if (i % 3 == 0) {
				output = "fizz";
			}
			else {
				output = String.valueOf(i);
			}
		}
		return output;
	}
}
