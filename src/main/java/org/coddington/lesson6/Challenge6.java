package org.coddington.lesson6;

import org.coddington.lesson5.FactorialException;
import org.coddington.lesson5.Factorializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author michaelcoddington
 */
public class Challenge6 {

    /*
     * Challenge: create a file called factorial.csv.  Using the Factorializer from lesson 5,
     * write a file that contains two values per line: a number in column 1, and its factorial in column 2,
     * for all numbers between 1 and 10.
     */

    public static void main(String[] args) {

        File challenge = new File("factorialch6.csv");
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(challenge);
            pw.println("Number, Factorial");

            Factorializer fcuk= new Factorializer();

            /*
            int numberToFactor = c.factorial(1 - 10);
            how to give multiple values?  GIVE MULTIPLE VALUES WITH LOOPS
            */

            for (int i = 1; i <= 10; i++){

                int f = fcuk.factorial(i);

                pw.println(i + "," + f);
            }

                //TWO VALUES PER LINE  how to hand return info to pw? why string not ints? csv - columns/concatenation?

        } catch (FileNotFoundException oops) {
            System.out.println("I caught an exception!");
        } catch (FactorialException e) {
            e.printStackTrace();
        } finally {
            if (pw != null){
                pw.close();
            }
        }


    }

}
