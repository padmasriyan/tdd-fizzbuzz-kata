package org.example;

/**
 * Fizz Buzz Kata
 */
public class FizzBuzz {
    public String getTheWord(int i) {
        if (i > 0 && i <= 100) {
            if (i % 15 == 0) {
                return "FizzBuzz";
            } else if (i % 3 == 0) {
                return "Fizz";
            } else if (i % 5 == 0) {
                return "Buzz";
            } else {
                return String.valueOf(i);
            }
        }
        return "Not defined";
    }
}
