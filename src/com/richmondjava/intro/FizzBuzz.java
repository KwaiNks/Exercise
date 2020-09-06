package com.richmondjava.intro;

public class FizzBuzz {

    public String getFizzBuzz(int value) {

        if ((value % 3 == 0) && (value % 5 == 0)) {
            return "fizz-buzz";
        } else if (value % 3 == 0) {
            return "fizz";
        } else if (value % 5 == 0) {
            return "buzz";
        }

        return String.valueOf(value);
    }

    public String getFizzBuzz(int lowerBound, int upperBound){
        StringBuilder fizzBuzz = new StringBuilder();
        for (int i = lowerBound; i <= upperBound; i++) {
            fizzBuzz.append(getFizzBuzz(i));
        }
        return fizzBuzz.toString();
    }
}