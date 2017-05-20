package org.coddington.lesson1;


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

        // literal array creation
        int[] intArray = new int[] {13456, 2, 34545, 4, 5345345};
        System.out.println(intArray[2]);

        // creating arrays the hard way
        int[] ia = new int[2];
        ia[0] = 1;
        ia[1] = 3;

        // and you can modify the values
        ia[0] = 5;

        String iLoveLee = "I LOVE LEE!!";
        System.out.println(iLoveLee.charAt(3));
        /*
        iLoveLee is an object of type String
        String objects have a method called "charAt"
        The charAt method takes one parameter -- the position of the character you want
        In this case, charAt(3) will retrieve the 4TH character, because almost all numbering in Java
            starts with 0

         */


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
