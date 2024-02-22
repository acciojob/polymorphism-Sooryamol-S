package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {

    @Test
    public void testProductWithTwoIntegers() {
        Main.Product p = new Main.Product();
        int result = p.product(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void testProductWithThreeIntegers() {
        Main.Product p = new Main.Product();
        int result = p.product(2, 3, 4);
        assertEquals(24, result);
    }

    @Test
    public void testProductWithTwoDoubles() {
        Main.Product p = new Main.Product();
        double result = p.product(2.5, 3.5);
        assertEquals(8.75, result, 0.0001); // Use a delta value for double comparisons
    }
}
