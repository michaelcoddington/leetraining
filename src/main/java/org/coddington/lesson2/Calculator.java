package org.coddington.lesson2;

/**
 * @author michaelcoddington
 */
public class Calculator {

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
        return 0; // this isn't right -- to be done by Lee
    }

    int powerOf4(int i) {
        return 0; // this isn't right -- to be done by Lee
    }

}
