package org.coddington.lesson6;

import org.coddington.lesson5.FactorialException;
import org.coddington.lesson5.Factorializer;

/**
 * Lesson 6: Creating and using an object
 *
 * @author michaelcoddington
 */
public class Example6e {

    public static void main(String[] args) {

        Factorializer factorializer = new Factorializer();

        // ->

        try {
            for (int i = 1; i < 6; i++) {
                int fact = factorializer.factorial(i);
                System.out.println(" -> " + fact);
            }
        } catch (FactorialException fe1) {
            System.out.println("dangit");
            fe1.printStackTrace();
        }

    }
}