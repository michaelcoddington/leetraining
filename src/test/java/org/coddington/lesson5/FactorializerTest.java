package org.coddington.lesson5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author michaelcoddington
 */
public class FactorializerTest {

    Factorializer f = new Factorializer();

    @Test
    public void testFactorial0() throws FactorialException {
        int fact = f.factorial(0);
        assertEquals(1, fact);
    }

    @Test
    public void testFactorial1() throws FactorialException {
        int fact = f.factorial(1);
        assertEquals(1, fact);
    }

    @Test
    public void testFactorial2() throws FactorialException {
        int fact = f.factorial(2);
        assertEquals(2, fact);
    }

    @Test
    public void testFactorial3() throws FactorialException {
        int fact = f.factorial(3);
        assertEquals(6, fact);
    }

    @Test
    public void testFactorial4() throws FactorialException {
        int fact = f.factorial(4);
        assertEquals(24, fact);
    }


}
