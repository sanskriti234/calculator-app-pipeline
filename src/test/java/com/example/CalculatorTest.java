package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void testSub() {
        assertEquals(1, Calculator.sub(3, 2));
    }

    @Test
    void testMul() {
        assertEquals(6, Calculator.mul(2, 3));
    }
}