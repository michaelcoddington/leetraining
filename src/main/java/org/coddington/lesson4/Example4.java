package org.coddington.lesson4;

/**
 * @author michaelcoddington
 */
public class Example4 {

    public static void main(String[] args) {

        /*

        EXPRESSIONS

         expressions are fragments of code (fragment, like sentence fragment)
         that return a value.

         the simplest are literal expressions, like
         2
         "hi"
         true
         1.0

         then there are expressions with operators in them, like
         2 + 4
         true || false
         a = 3
         x == 5

         now consider the expression 2 + 2.  It's easy to think that the + operator
         requires you to give it 2 literal numbers to add together.  Wrong -- it needs you
         to give it 2 *expressions that return numbers* to it, to add together.

         think of it as (int expression) + (int expression)

         (2) + (4 + 5)
         or
         (2 + 2) + (4 + 5)
         or
         ((1 + 1) + (1 + 1)) + (4 + 5)

         and variables can be used as expressions, too...

         int a = 5;
         a + 2
         a * a
         (a - 2) + (5 + a)

         these work because the variable "a" holds an int, and therefore can be used anywhere
         an int is needed in an expression.

        */


        /*
        STATEMENTS

        A statement is an instruction to Java to do some work.  It's usually one line of code ending with
        a semicolon.

        There are more complex statement types, like an if statement, while statement, or for statement.
        These are "compound statements" -- statements that contain other statements inside them.

         */

        //4 + 4; // expression. doesn't compile

        int i = 4 + 4;  // statement -- assign the result of the expression "4 + 4" to i

        System.out.println(i + 5); // statement -- print the expression "i + 5".

        if (false) { // if statement
            int y = 0; // assignment statement
        }


        /*
        METHODS

        A method is a sequence of statements, grouped together, given a name, associated with a class.

         */

        class TestClass {

            int add(int a, int b) {
                return a + b;
            }

        }

        TestClass tc = new TestClass(); // create an object
        int result = tc.add(5, 6); // call its method

       // add(5, 6); // doesn't compile -- you can only use a method by telling a specific object to use a method



    }

}
