package com.chyernobog.testingdemo;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    private String[] count = new String[101];

    public void runFizzBuzz() {
        countFromOneToOneHundred();
        applyFizz();
        applyBuzz();
    }

    public void countFromOneToOneHundred() {
        for (int i = 1; i <= 100; i++) {
            count[i] = String.valueOf(i);
        }
    }

    public void applyFizz() {
        for (int i = 3; i <= 100; i += 3) {
            count[i] = FIZZ;
        }
    }

    public void applyBuzz() {
        for (int i = 5; i <= 100; i += 5) {
            if ( i % 3 == 0 ) {
                count[i] = count[i].concat(BUZZ);
            } else {
                count[i] = BUZZ;
            }

        }
    }

    public String[] getCount() {
        return count;
    }


}
