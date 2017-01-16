package org.coddington.lesson2;

/**
 * @author michaelcoddington
 */
public class Example2 {

        /*
        0) variables (from last time)
        1) Operators
        2) Expressions
        3) Statements
        4) Blocks
        5) Methods
        */


    public static void main(String[] args) {


        /*
        Here's what BASIC looked like. Highly procedural.
        -------------------------------------------------

        10  A% = 2
        20  B% = 4
        30  C% = A% + B%
        40  PRINT C%
        50  D% = 1
        60  E% = 9
        70  F% = D% + E%
        80  PRINT F%

        RUN
         */

        Calculator calc = new Calculator();

        int a = 2;
        int b = 4;
        int c = calc.add(a, b);
        System.out.println("A + B = " + c);

        int d = calc.add(1, 9);
        System.out.println("1 + 9 = " + d);

        int s = calc.square(9);
        System.out.println("9 squared is " + s);

        int x = 9 + calc.add(2, 3);
        System.out.println("9 + (2 + 3) is " + x);

    }

}
