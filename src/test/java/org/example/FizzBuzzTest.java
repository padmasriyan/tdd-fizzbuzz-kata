package org.example;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Unit test for simple FizzBuzz.
 */
public class FizzBuzzTest {

    @Test
    public void getTheWordFor1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1",fizzBuzz.getTheWord(1));
    }

    @Test
    public void getTheWordFor98() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("98",fizzBuzz.getTheWord(98));
    }

    @Test
    public void getTheWordFor12() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz",fizzBuzz.getTheWord(12));
    }

    @Test
    public void getTheWordFor50() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz",fizzBuzz.getTheWord(50));
    }

    @Test
    public void getTheWordFor30() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz",fizzBuzz.getTheWord(30));
    }

    @Test
    public void getTheWordFor60() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz",fizzBuzz.getTheWord(30));
    }

    @Test
    public void getTheWordForMinusTen() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Not defined",fizzBuzz.getTheWord(-10));
    }

    @Test
    public void getTheWordFor1000() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Not defined",fizzBuzz.getTheWord(1000));
    }

}
