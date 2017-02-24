package org.coddington.lesson6;

import org.coddington.lesson5.FactorialException;
import org.coddington.lesson5.Factorializer;

/**
 * Lesson 6: Creating and using an object
 *
 * @author michaelcoddington
 */
public class Example6d {

    public static void main(String[] args) {

        Factorializer f = new Factorializer();
        try {
            f.factorial(-1);
        } catch (FactorialException fe1) {
            System.out.println("dangit");
            fe1.printStackTrace();
        }

    }
}