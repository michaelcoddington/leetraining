package org.coddington.lesson5;

import org.coddington.lesson4.Calculator;

/**
 * A factorial is a given number multiplied by all numbers less than it, and greater than 0.

 *
 * which means factorial(4) is 4 * 3 * 2 * 1
 * or factorial(10) = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
 *
 * @author michaelcoddington
 */
public class Factorializer {

    Calculator calc = new Calculator();

    public int factorial(int numberToFactor) throws FactorialException {
        if (numberToFactor < 1) {
            throw new FactorialException("Cannot factor numbers less than 1");
        }

        return factorialByRecursion(numberToFactor);
    }

    private int factorialByLooping(int ln) {
        int factorialReturn = 1;

        for (int i = 2; i <= ln; i = i + 1) {
            factorialReturn = factorialReturn * i;
        }

        return factorialReturn;
    }

    private int factorialByRecursion(int lr) {

         /*

        the factorial of 4 is 4 * 3 * 2 * 1
        which can be written 4 * (3 * 2 * 1)
        therefore factorial of 4 is 4 * (factorial of 3)
        and factorial of 3 is 3 * (factorial of 2)
        and factorial of 2 is 2 * (factorial of 1)
        and factorial of 1 is just 1

        so factorial(n) is n * factorial(n - 1), unless n == 1, in which case that's just 1

        */

        if (lr == 1) {
            return 1;
        } else {
            return lr * factorialByRecursion(lr - 1);
        }

        /*

        recursion =  a method calls itself to solve some problem.
            A method that uses this technique is recursive.
            Many programming problems can be solved only by recursion,
            and some problems that can be solved by other techniques
            are better solved by recursion.

         */

    }

}
