package org.coddington.lesson7.part1;

/**
 * @author michaelcoddington
 */
class SimpleClass {

    // member
    String someData;

    // constructor
    SimpleClass(String s) {
        someData = s;
    }

    // method
    void someMethod() {
        System.out.println("My data is: " + someData);
    }

}
