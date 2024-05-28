package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testAdd() {
        assertEquals(5, Calculator.add(3, 2));
        assertEquals(5, Calculator.add(5, 0));
        assertEquals(-5, Calculator.add(5, -10));
    }

    @Test
    void testDivide() {
        assertEquals(5, Calculator.divide(10, 2));
        assertThrows(ArithmeticException.class, () -> Calculator.divide(10, 0));
    }

    @Test
    void testMultiply() {
        assertEquals(6, Calculator.multiply(3, 2));
        assertEquals(8, Calculator.multiply(4, 2));
        assertEquals(16, Calculator.multiply(4, 4));
    }

    @Test
    void testSubstract() {
        assertEquals(1, Calculator.substract(3, 2));
        assertEquals(5, Calculator.substract(5, 0));
        assertEquals(-5, Calculator.substract(5, 10));
    }
}
