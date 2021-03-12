package Toto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    @DisplayName("For a multiple of 3 the program should return 'Fizz'")
    void fizz() {
        assertEquals("Fizz", fizzBuzz.getOutcome(3));
    }

    @Test
    @DisplayName("For a multiple of 5 the program should return 'Buzz'")
    void buzz(){
        assertEquals("Buzz", fizzBuzz.getOutcome(10));
    }

    @Test
    @DisplayName("For a number that is not a multiple of 3 nor a multiple of 5 return the number")
    void returnNumber() {
        assertEquals("22", fizzBuzz.getOutcome(22));
    }


}
