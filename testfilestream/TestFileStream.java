/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfilestream;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author orucitilab
 */
public class TestFileStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create an output stream to the fle
        try {
            FileOutputStream output = new FileOutputStream("temp.dat");

            for (int i = 1; i <= 10; i++) {
                output.write(i);
            }
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(TestFileStream.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream input = new FileInputStream("temp.dat");

            //Read values from the file
            int value;
            while ((value = input.read()) != -1) {
                System.out.print(value + " ");
            }
            input.close();
        } catch (IOException ex) {
            Logger.getLogger(TestFileStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
