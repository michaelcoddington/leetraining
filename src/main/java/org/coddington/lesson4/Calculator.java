package org.coddington.lesson4;

/**
 * @author michaelcoddington
 */
public class Calculator {

    boolean isOn() {
        return true;
    }

    int add(int a1, int a2) {
        int a3 = a1 + a2;
        return a3;
    }

    int subtract(int a1, int a2) {
        int a3 = a1 - a2;
        return a3;
    }

    int multiply(int a1, int a2) {
        int a3 = a1 * a2;
        return a3;
    }

    int divide(int a1, int a2) {
        int a3 = a1 / a2;
        return a3;
    }

    int square(int i) {
        return multiply(i, i);
    }

    int cube(int i) {
        return multiply(square(i), i);
    }

    int powerOf4(int i) {
        return square(square(i));
    }

    int powerOf5(int i) {
        return multiply(square(i), cube(i));
    }

    int powerOf6(int i) {
        return multiply(cube(i), cube(i));
    }


}
