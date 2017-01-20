package org.coddington.lesson3;

/**
 * @author michaelcoddington
 */
public class ExpressionExampleThing {

    public static void main(String[] args) {
        ExpressionExampleThing thing = new ExpressionExampleThing();

        // sometimes expressions are simple
        print(1);

        // sometimes more complex
        print(1 + 2);

        print(thing.addTwoInts(1, 2));
    }

    private static void print(int o) {
        System.out.println(o);
    }

    int addTwoInts(int int1, int int2) {
        return int1 + int2;
    }

}
