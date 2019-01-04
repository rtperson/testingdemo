package com.chyernobog.testingdemo;

import com.chyernobog.testingdemo.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testing FizzBuzz Functionality")
class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @BeforeEach
    void runFizzBuzz() {
        fizzBuzz.runFizzBuzz();
    }

    @Test
    @DisplayName("Should count from one to one hundred")
    void countsFromOneToOneHundred() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                assertEquals(String.valueOf(i), fizzBuzz.getCount()[i]);
            }
        }
    }

    @Test
    @DisplayName("Should print 'Fizz' for multiples of three")
    void printsFizzForMultiplesOfThree() {
        for (int i = 3; i < 100; i+=3) {
            if (i % 5 != 0) {
                assertEquals("Fizz", fizzBuzz.getCount()[i]);
            }

        }
    }

    @Test
    @DisplayName("Should print 'Buzz' for multiples of five")
    void printBuzzForMultiplesOfFive() {
        for (int i = 5; i <= 100; i += 5) {
            if (i % 3 != 0) {
                assertEquals("Buzz", fizzBuzz.getCount()[i]);
            }

        }
    }

    @Test
    @DisplayName("Should print 'FizzBuzz' for multiples of both three and five")
    void printFizzBuzzForMultiplesOfThreeAndFive() {
        for (int i = 15; i <= 100; i += 15) {
            assertEquals("FizzBuzz", fizzBuzz.getCount()[i]);
        }
    }


}
