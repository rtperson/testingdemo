package com.accenture.testingdemo;

public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        fb.runFizzBuzz();
        for (int i = 1; i <= 100; i++) {
            System.out.println(fb.getCount()[i]);
        }
    }

    public void runFizzBuzz() {
        countToOneHundred();
        applyFizz();
        applyBuzz();
    }

    private void countToOneHundred() {
        for (int i = 1; i <= 100; i++) {
            count[i] = String.valueOf(i);
        }
    }

    private void applyFizz() {
        for (int i = 3; i <= 100; i+= 3) {
            count[i] = "Fizz";
        }
    }

    private void applyBuzz() {
        for (int i = 5; i <= 100; i+= 5) {
            if (count[i].equals("Fizz")) {
                count[i] = count[i].concat("Buzz");
            } else {
                count[i] = "Buzz";
            }
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
