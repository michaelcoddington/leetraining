package org.coddington.lesson7;

/**
 * Lesson 7: Writing data to a file, part 2
 * and concepts of object orientation, part 1
 *
 * AKA how to write to a file dyslexically
 *
 * @author michaelcoddington
 */
class Example7 {

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
 *
 *    12) Abstract class:
 *      A class that cannot be directly created.  We'll discuss the use of the "abstract" keyword later, as well as
 *      the role that abstraction plays.  For now, just know that you cannot instantiate an abstract class.  Usually,
 *      though, abstract classes have subclasses that are not abstract.  You CAN instantiate those classes.
 *
 *      e.g. java.io.Writer (http://docs.oracle.com/javase/7/docs/api/java/io/Writer.html) is abstract. You cannot do this:
 *      Writer w = new Writer();
 *
 *      but it has a subclass, java.io.PrintWriter (http://docs.oracle.com/javase/7/docs/api/java/io/PrintWriter.html)
 *      that you can instantiate.
 *
 *  13) Package:
 *      A package is a "thing" in the Java language that lets you group classes together.  Its serves other roles
 *      we'll discuss later, too, related to visibility (public, private, etc.)
 *
 *      Classes are usually created within packages -- to not do so is considered extremely bad form.
 *
 *      There are many packages in the Java Standard Library (java.lang, java.io. et. al.) and there are several
 *      packages in this project -- org.coddington.lesson1, org.coddington.lesson2, and so on.  If you look at any
 *      class in this project, at the top, you'll see it saying which package it is in (including this class!)
 *
 *
 *       * 10) Imports:
 *    When a class in one package needs to use a class in a different package, it needs to "import" that class using
 *    an import statement at the top of the class file.
 *    This lets Java know precisely which class is being used, as there may be classes with the same
 *    name but in different packages, so Java needs to know exactly which class you're using.
 *
 *    The only exception to this is when you're using a class in the java.lang package.  Those classes are automatically
 *    imported for you.
 */
