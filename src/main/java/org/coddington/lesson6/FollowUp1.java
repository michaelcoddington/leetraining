package org.coddington.lesson6;

import org.coddington.lesson5.FactorialException;
import org.coddington.lesson5.Factorializer;

import java.io.PrintStream;

/**
 * @author michaelcoddington
 */
public class FollowUp1 {

    public static void main(String[] args) throws FactorialException {

        // so why use loops?  let's see.

        // let's imagine I want to print out the factorials for numbers 1 through 5 to the screen.
        // First, I need some objects to help me do my work.
        // This is great, because I don't have to rewrite a factorializer every time I need factorials,
        // and I don't have to come up with a new way to print things to the screen.  That work
        // is already done, so I can just reuse the existing classes that do this stuff.
        Factorializer factorializer = new Factorializer();
        PrintStream ps = System.out;


        // here's a straightforward way to print the factorials.
        ps.println("Simple (annoying) way...");
        ps.println("The factorial of " + 1 + " is " + factorializer.factorial(1));
        ps.println("The factorial of " + 2 + " is " + factorializer.factorial(2));
        ps.println("The factorial of " + 3 + " is " + factorializer.factorial(3));
        ps.println("The factorial of " + 4 + " is " + factorializer.factorial(4));
        ps.println("The factorial of " + 5 + " is " + factorializer.factorial(5));
        // that works fine, but I'm going to go crazy if I have to change this very often,
        // or do factorials from 1 through 20 or whatever. Lots of typing.  Hard to change later.

        // this is way better:
        ps.println("Better way...");
        for (int i = 1; i <= 5; i++) {
            ps.println("The factorial of " + i + " is " + factorializer.factorial(i));
        }
        // same result as above, but WAY less code and easier to change later.

        /*
        Notice that I created 2 objects to work with at the beginning of this method.
        1) A Factorializer
        2) A PrintStream

        Once they're created, I can use them over and over again anywhere later in the method.
        I could create them every time I wanted to print a line out, but that would be pointless
        and inefficient.  Just create the object and then use it again and again, that's how you
        do it :)

        So now, how might you meet the lesson 6 challenge?  Does this help?  Let me know!
         */

    }

}
