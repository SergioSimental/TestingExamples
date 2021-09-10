package com.example.testingexamples;

import junit.framework.TestCase;
import junit.framework.Test;

public class CalculatorTest extends TestCase {
    public void testAdd(){
        int expected = 40;
        int actual = Calculator.add(20,20);
        assertEquals(expected,actual);
    }

    public void testMultiply(){
        int expected = 100;
        int actual = Calculator.multiply(10, 10);
        assertEquals(expected,actual);
    }
}