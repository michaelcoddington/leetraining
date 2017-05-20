package org.coddington.lesson7.part1;

/**
 * @author michaelcoddington
 */
public class Runner1 {

    public static void main(String[] args) {
        // here we create an instance of SimpleClass using the constructor we defined
        SimpleClass sc = new SimpleClass("hi there");

        // and then we call a method on our object
        sc.someMethod();

        // subclass has 2 constructors... here's one...
        SubClass sub = new SubClass();
        sub.someMethod();

        // here's the other one
        SubClass sub2 = new SubClass("hello yourself");
        sub2.someMethod();
    }

}
