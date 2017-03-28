package org.coddington.lesson6;

import org.coddington.lesson5.Factorializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Lesson 6: Writing data to a file
 *
 * @author michaelcoddington
 */
public class Example6c {

    public static void main(String[] args) {

        File f = new File("example1.txt");
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(f);

            Factorializer c = new Factorializer();

            for (int i = 1; i <= 10; i++) {

            }

        } catch (FileNotFoundException nfne) {
            System.out.println("oh well.");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }

    }
}