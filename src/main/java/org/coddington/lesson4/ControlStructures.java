package org.coddington.lesson4;

/**
 * @author michaelcoddington
 */
public class ControlStructures {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i = i + 1) {
            System.out.println(i + i);
        }

        boolean keepGoing = true;
        int x = 0;
        while (keepGoing) {
            System.out.println("OK, keep going");
            x = x + 1;
            if (x == 3) {
                keepGoing = false;
            }
        }

    }

}
