package FizzBuzzKata;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 Write a program that prints one line for each number from 1 to 100
 For multiples of three print Fizz instead of the number
 For the multiples of five print Buzz instead of the number
 For numbers which are multiples of both three and five print FizzBuzz instead of the number
 */

class FizzBuzzKataTest {
    @Test
    public void execute_whenExecuted_thenListSizeEqualTo100() {
        assertEquals(100, FizzBuzzKata.execute().size());
    }

    @Test
    public void execute_whenExecuted_thenAllNumbersNotDivisibleBy3Or5AreNotSubstituted() {
        List<String> list = FizzBuzzKata.execute();
        IntStream.range(1, 101).forEach(i -> {
            if (i % 3 != 0 && i % 5 != 0)
                assertEquals(Integer.toString(i), list.get(i - 1));
        });
        assertEquals(100, list.size());
    }

    @Test
    public void execute_whenExecuted_thenAllNumbersDivisibleBy3AreSubstitutedByFizz() {
        List<String> list = FizzBuzzKata.execute();
        IntStream.range(1, 101).forEach(i -> {
            if (i % 3 == 0 && i % 5 != 0)
                assertEquals("Fizz", list.get(i - 1));
        });
        assertEquals(100, list.size());
    }

    @Test
    public void execute_whenExecuted_thenAllNumbersDivisibleBy5AreSubstitutedByBuzz() {
        List<String> list = FizzBuzzKata.execute();
        IntStream.range(1, 101).forEach(i -> {
            if (i % 5 == 0 && i % 3 != 0)
                assertEquals("Buzz", list.get(i - 1));
        });
        assertEquals(100, list.size());
    }

    @Test
    public void execute_whenExecuted_thenAllNumbersDivisibleBy3And5AreSubstitutedByFizzBuzz() {
        List<String> list = FizzBuzzKata.execute();
        IntStream.range(1, 101).forEach(i -> {
            if (i % 3 == 0 && i % 5 == 0)
                assertEquals("FizzBuzz", list.get(i - 1));
        });
        assertEquals(100, list.size());
    }
}