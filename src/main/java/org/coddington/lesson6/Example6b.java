package org.coddington.lesson6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Loop-writing!
 *
 * @author michaelcoddington
 */
public class Example6b {

    public static void main(String[] args) {


        File f = new File("test.txt");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(f);
            for (int i = 0; i < 5; i += 1) {
                pw.println("i is " + i);
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