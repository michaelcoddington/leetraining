package org.coddington.lesson7;

/**
 * Lesson 7: Writing data to a file, part 2
 * and concepts of object orientation, part 1
 *
 * AKA how to write to a file dyslexically
 *
 * @author michaelcoddington
 */
public class Example7 {

    public static void main(String[] args) {

    }

}

/*
 * NOTES
 *
 * 1) INTERFACE: a contract that defines a set of capabilities.  A class is said to IMPLEMENT an interface
 *    by (a) declaring that it implements the interface and (b) by defining methods whose signature, modifiers,
 *    and return types match those defined in the interface.
 *
 * 2) METHOD SIGNATURE: a combination of the method's name and its parameter types.
 *    e.g.: a method public int add(int a, int b) has the signature add(int, int)
 *
 * 3) MODIFIERS: keywords that provide additional information about a method or class
 *    e.g.: in a method like public static void main(String[] args), "public" and "static" are modifiers.
 *    "public" indicates this method can be called by any object.
 *    "static" indicates this method is not associated with a specific object, but with the class itself
 *       (we'll discuss this later)
 *
 * 4) There are 4 key principles of object orientation:
 *    * Abstraction -- not having to always define things
 *    * Encapsulation -- keeping data organized and hidden
 *    * Inheritance -- adding functionality to a class by elaborating on its capabilities
 *    * Polymorphism -- allowing an object to serve different purposes in different contexts
 *
 *    Interfaces are related to ABSTRACTION and POLYMORPHISM.
 *    Modifiers like "public", "private", etc. are related to ENCAPSULATION.
 *
 *    We'll talk about inheritance in the next lesson.
 */
