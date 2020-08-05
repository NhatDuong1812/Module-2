package Week2.Day3.TH1;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class FizzBuzzTest {
    @Test
    void testFizzBuzz0() {
        int number = 24;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
}