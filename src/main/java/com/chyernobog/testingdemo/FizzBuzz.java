package com.chyernobog.testingdemo;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";

    private String[] count = new String[101];

    public void runFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            count[i] = String.valueOf(i);
        }
        applyFizz();
    }

    public void applyFizz() {
        for (int i = 3; i <= 100; i += 3) {
            count[i] = FIZZ;
        }
    }

    public String[] getCount() {
        return count;
    }

}
