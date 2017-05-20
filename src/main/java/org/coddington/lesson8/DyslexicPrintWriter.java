package org.coddington.lesson8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * A class that extends {@link PrintWriter} by reversing the strings it prints.
 *
 * @author michaelcoddington
 */
class DyslexicPrintWriter extends PrintWriter {

    DyslexicPrintWriter(File f) throws FileNotFoundException {
        super(f);
    }

    @Override
    public void println(String x) {
        StringBuilder builder = new StringBuilder(x);
        super.println(builder.reverse().toString());
    }

}
