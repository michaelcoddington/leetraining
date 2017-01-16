package org.coddington.lesson1;

/**
 * @author michaelcoddington
 */
public class Bacteria extends Organism {

    @Override
    public void sayHello() {
        System.out.println("Hi, I'm a bacteria!");
    }

    public void multiply() {
        System.out.println("You're about to die, asshole!");
    }

    public void move() {
        System.out.println("I'm fucking moving dude");
    }

}
