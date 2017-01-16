package org.coddington.lesson2;

/**
 * @author michaelcoddington
 */
public class Example2 {

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

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = a + b;
        System.out.println(c);

        int d = 1;
        int e = 9;
        int f = d + e;
        System.out.println(f);
    }

}
