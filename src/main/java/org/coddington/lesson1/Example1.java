package org.coddington.lesson1;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author michaelcoddington
 */
public class Example1 {

    public static void main(String[] args) {

        // primitive types

        boolean bool = false;

        char c = '1';

        long l = 12345234523453L;
        int i = 0;
        short s = 32767;
        byte b = 127;

        double d = 1234234523452.234;
        float f = 1.0F;

        // talk about objects, starting with arrays and strings


        int[] intArray = new int[] {13456, 2, 34545, 4, 5345345};
        System.out.println(intArray[2]);

        String iLoveLee = "I LOVE LEE!!";
        System.out.println(iLoveLee.charAt(3));


        /*
        Organism org1 = new Animal();
        org1.sayHello();
        org1.multiply();

        Organism org2 = new Bacteria();
        org2.sayHello();
        org2.multiply();
        */
    }

}
