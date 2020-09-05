package com.richmondjava.intro;

public class FizzBuzz {

	public void getFizzBuzz(int lowerBound, int upperBound) {
		for(int i = lowerBound; i <= upperBound; i++) {
			if (i % 3 == 0) {
				System.out.println("fizz");
			}else if (i % 5 == 0) {
				System.out.println("buzz");
			}else if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("fizz-buzz");
			}else {
				System.out.println(i);
			}
		}
	}
}
