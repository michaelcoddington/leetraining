package org.coddington.lesson6;

/**
 * Lesson 6: Writing data to a file
 *
 * @author michaelcoddington
 */
public class Example6 {

    public static void main(String[] args) {

    }
}

/*
 * NOTES
 *
 * 1) public static void main(String[] args) is a special method; it is the starting point of a Java application.
 *    when this method finishes, the application stops.
 *
 * 2) java.io: a package in the Java Standard Library.  It contains classes that are devoted to reading and writing
 *    data.
 *
 * 3) System.out.println
 *    "System" is a class in the Java Standard Library.  It is in the java.lang package (we'll talk about packages later).
 *    http://docs.oracle.com/javase/7/docs/api/java/lang/System.html
 *    "out" is a MEMBER of the System class (we'll talk about this in lesson 7).
 *    It's something you can use to make messages appear on the screen (and much more)
 *    "println" is a method that writes a string and a "newline" character (like hitting the Enter key)
 *
 * 4) File: a class in the java.io package. It's a class that provides access to a file on disk.
 *    http://docs.oracle.com/javase/7/docs/api/java/io/File.html
 *
 * 5) PrintWriter: a class in the java.io package. It's one class (there are others) that let you write data to a File.
 *    http://docs.oracle.com/javase/7/docs/api/java/io/PrintWriter.html
 *
 * 6) Checked exception: an exception that a method says it might throw.  Anything calling that method MUST be
 *    prepared to deal with this exception in case it is thrown by the method.
 *
 *    e.g.: public int divide(int numerator, int denominator) throws DivideByZeroException
 *
 *    in this case, DivideByZeroException is a CHECKED exception. Anything trying to call the divide method needs
 *    to define how it will deal with this exception if it is thrown. (note: there is an alternative, discussed here --
 *    https://docs.oracle.com/javase/tutorial/essential/exceptions/declaring.html -- but we'll cover this later).
 *
 * 7) try/catch/finally: a control structure in Java that lets you specify how an application should cope with an
 *    Exception.  e.g. TRY to do this.  If an exception is THROWN, then CATCH it and do xyz.  And no matter what,
 *    FINALLY do blahblahblah when the try or catch is finished working.
 *
 * 8) CSV: a "comma-separated value" file.  Excel understands and can import this kind of file.  It contains lines like:
 *    1,"a"
 *    2,"b"
 *    3,"c"
 *
 *    or
 *
 *    1,10,6
 *    4,8,165
 *    1094,5,0
 *
 *    All the lines should have the same number of values.  These will be translated into columns in Excel.
 *
 * 9) String concatenation:
 *    You can use the + operator with String objects.  For example, "bad" + "ass" is an expression that returns a
 *    new string "badass".  This is called string concatenation.  You can also concatenate strings and numbers, e.g.
 *    "hey" + 420 is an expression that returns a new string "hey420".
 *
 *    You can concatenate multiple strings and numbers, so "hi" + 3 + "there" + 42 is an expression that returns a new
 *    string "hi3there42".
 *
 * 10) Imports:
 *    When a class in one package needs to use a class in a different package, it needs to "import" that class using
 *    an import statement at the top of the class file.
 *    This lets Java know precisely which class is being used, as there may be classes with the same
 *    name but in different packages, so Java needs to know exactly which class you're using.
 *
 *    The only exception to this is when you're using a class in the java.lang package.  Those classes are automatically
 *    imported for you.
 */
