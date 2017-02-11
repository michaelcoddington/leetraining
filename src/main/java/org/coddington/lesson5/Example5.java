package org.coddington.lesson5;

/**
 * @author michaelcoddington
 */
public class Example5 {

    public static void main(String[] args) {

        Factorializer f = new Factorializer();

        try {
            int factor = f.factorial(-1000000);
            System.out.println(factor);
        } catch (FactorialException iae) {
            System.out.println("well shit, that didn't work.");
        }


        /*

        STACK

        an abstract data type that serves as a collection of elements
        with two principle operations:

        PUSH adds an element to the collection
        POP removes the most recently added element not yet removed

        another available operation
        PEEK gives access to the top without modifying the stack

        element removal order denotes its alternate name LIFO (last in, first out)

        STACKS are analogous to a spring-loaded chute of plates in a cafeteria:
        when a plate is removed from the stack
        the one below it pops up
        to become the new top

         */



    }

}
