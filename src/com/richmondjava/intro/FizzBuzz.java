package com.richmondjava.intro;

public class FizzBuzz {

	public String getFizzBuzz(int lowerBound, int upperBound) {
		for(int i = lowerBound; i <= upperBound; i++) {
			if (i % 3 == 0) {
				return "fizz";
			}else if (i % 5 == 0) {
				return "buzz";
			}else if ((i % 3 == 0) && (i % 5 == 0)) {
				return "fizz-buzz";
			}else {
				return String.valueOf(i);
			}
		}
		return "";
	}
}
