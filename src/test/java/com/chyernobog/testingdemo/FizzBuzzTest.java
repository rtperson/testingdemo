package com.chyernobog.testingdemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @BeforeEach
    public void runFizzBuzz() {
        fizzBuzz.runFizzBuzz();
    }

    @Test
    @DisplayName("Should count from one to one hundred")
    public void countsFromOneToOneHundred() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                assertEquals(String.valueOf(i), fizzBuzz.getCount()[i]);
            }
        }
    }

    @Test
    @DisplayName("Should print 'Fizz' for multiples of three")
    void printsFizzForMultiplesOfThree() {
        for (int i = 3; i <= 100; i += 3) {
            assertEquals("Fizz", fizzBuzz.getCount()[i]);
        }
    }
}
