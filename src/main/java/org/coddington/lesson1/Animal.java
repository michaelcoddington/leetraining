package org.coddington.lesson1;

/**
 * @author michaelcoddington
 */
public class Animal extends Organism {

    public void walkAround() {
        System.out.println("I'm walking around, asshole!");
    }

    @Override
    public void sayHello() {
        System.out.println("Hi, I'm an animal!");
    }

    public void move() {
        System.out.println("You fucking move.");
    }

}
