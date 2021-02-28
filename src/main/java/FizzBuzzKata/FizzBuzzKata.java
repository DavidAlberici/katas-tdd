package FizzBuzzKata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 Write a program that prints one line for each number from 1 to 100
 For multiples of three print Fizz instead of the number
 For the multiples of five print Buzz instead of the number
 For numbers which are multiples of both three and five print FizzBuzz instead of the number
 */

public class FizzBuzzKata {
    public static List<String> execute() {
        return IntStream.range(1,101).mapToObj(i -> {
            if (i % 3 == 0 && i % 5 == 0)
                return "FizzBuzz";
            if (i % 3 == 0)
                return "Fizz";
            if (i % 5 == 0)
                return "Buzz";
            return Integer.toString(i);
        }).collect(Collectors.toList());
    }
}
