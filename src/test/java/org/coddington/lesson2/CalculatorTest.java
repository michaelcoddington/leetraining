package org.coddington.lesson2;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author michaelcoddington
 */
public class CalculatorTest {

    private Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void testSquare() {
        assertEquals(16, calc.square(4));
    }

    @Test
    public void testCube() {
        assertEquals(8, calc.cube(2));
    }

    @Test
    public void testPowerOf4() {
        assertEquals(16, calc.powerOf4(2));
    }
}
