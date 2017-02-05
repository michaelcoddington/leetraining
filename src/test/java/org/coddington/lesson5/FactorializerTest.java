package org.coddington.lesson5;

import org.coddington.lesson4.Factorializer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author michaelcoddington
 */
public class FactorializerTest {

    Factorializer f = new Factorializer();

    @Test(expected = RuntimeException.class)
    public void testFactorial0() {
        int fact = f.factorial(0);
    }

    @Test
    public void testFactorial1() {
        int fact = f.factorial(1);
        assertEquals(1, fact);
    }

    @Test
    public void testFactorial2() {
        int fact = f.factorial(2);
        assertEquals(2, fact);
    }

    @Test
    public void testFactorial3() {
        int fact = f.factorial(3);
        assertEquals(6, fact);
    }

    @Test
    public void testFactorial4() {
        int fact = f.factorial(4);
        assertEquals(24, fact);
    }


}
