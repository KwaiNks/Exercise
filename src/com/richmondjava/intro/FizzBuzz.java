package com.richmondjava.intro;

public class FizzBuzz {

	public String getFizzBuzz(int lowerBound, int upperBound) {
		String output = "";
		for (int i = lowerBound; i <= upperBound; i++) {
			if (i % 3 == 0) {
				output = "fizz";
			}else if (i % 5 == 0) {
				output = "buzz";
			}else if ((i % 3 == 0) && (i % 5 == 0)) {
				output = "fizz-buzz";
			}
			else {
				output = String.valueOf(i);
			}
		}
		return output;
	}
}