package org.coddington.lesson5;

/**
 * @author michaelcoddington
 */
public class Example5 {

    public static void main(String[] args) {

        Factorializer f = new Factorializer();

        try {
            int factor = f.factorial(-1000000);
            System.out.println(factor);
        } catch (FactorialException iae) {
            System.out.println("well shit, that didn't work.");
        }

    }

}
