package org.coddington.lesson3;

/**
 * @author michaelcoddington
 */
public class Example3 {

    /*
    Control structures:
    1) if / else
    2) while
    3) for
     */

    public static void main(String[] args) {

        // if example 1
        boolean todayIsThursday = false;

        if (todayIsThursday) {
            System.out.println("Yay thursday!");
        } else {
            System.out.println("NOPE. Not thursday.");
        }

        // if example 2
        int i = 4;
        if (i < 2) {
            System.out.println("< 2");
        } else if (i == 2) {
            System.out.println("2");
        } else {
            System.out.println("> 2");
        }

        // if example 3
        Calculator calc = new Calculator();
        if (calc.isOn()) {
            System.out.println("ON");
        } else {
            System.out.println("OFF");
        }

        // if example 4
        int a = 2;
        int b = 6;

        if ((a > 0) && (b < 5)) {
            System.out.println("And OK!");
        } else {
            System.out.println("And that's no good.");
        }

        if ((a > 0) || (b < 5)) {
            System.out.println("Or OK!");
        } else {
            System.out.println("Or no that's no good.");
        }


        // while example 1
        int a2 = 0;
        while (a2 < 5) {
            System.out.println("Loop: a2 is " + a2);
            a2 = a2 + 1;
        }

        // for example 1
        for (int z = 0; z < 5; z = z + 1) {
            System.out.println("Z is " + z);
            System.out.println("Za is " + z);
            System.out.println("Zb is " + z);
            System.out.println("Zc is " + z);
            System.out.println("Ze is " + z);
        }

        // for example 2
        int g;
        int h = 3;
        for (g = 0; g < 3 && h < 10; g = g + 1) {
            System.out.println("G is " + g);
        }

        // combination example
        for (int s = 0; s < 20; s = s + 1) {
            if (s % 2 == 0) { // % is the "modulo" operator -- returns the remainder after division
                System.out.println(s + " is even");
            } else {
                System.out.println(s + " is odd");
            }
        }


    }

}
