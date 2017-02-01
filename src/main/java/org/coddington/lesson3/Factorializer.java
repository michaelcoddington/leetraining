package org.coddington.lesson3;

/**
 * A factorial is a given number multiplied by all numbers less than it, and greater than 0.
 * <p>
 * <p>
 * which means factorial(4) is 4 * 3 * 2 * 1
 * or factorial(10) = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
 *
 * @author michaelcoddington
 */
public class Factorializer {

    public int factorial(int numberToFactor) {
        int factorialReturn = 1;

        for (int i = 2; i <= numberToFactor; i = i + 1) {
            factorialReturn = factorialReturn * i;
        }

        return factorialReturn;
    }

}

