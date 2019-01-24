package com.chyernobog.testingdemo;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        fb.runFizzBuzz();
        for (int i = 1; i <= 100; i++) {
            System.out.println(fb.getCount()[i]);
        }
    }

    public void runFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if ( i % 5 == 0) {
                applyBuzz(i);
            } else if ( i % 3 == 0) {
                applyFizz(i);
            } else {
                count[i] = String.valueOf(i);
            }
        }
    }

    private void applyFizz(int i) {
        count[i] = FIZZ;
    }

    private void applyBuzz(int i) {
        if ( i % 3 == 0 ) {
            count[i] = FIZZ.concat(BUZZ);
        } else {
            count[i] = BUZZ;
        }
    }

    private String[] count = new String[101];

    public String[] getCount() {
        return count;
    }

//    public void runFizzBuzz2() {
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(String.valueOf(i));
//            }
//        }
//    }


}
