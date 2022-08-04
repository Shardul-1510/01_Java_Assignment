/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_java_assignment;

/**
 *
 * @author SHARDUL
 */
import java.io.FileInputStream;

public class FileInput_YetToBeDone {

   public static void main(String args[]) {

      try {
         // Suppose, the input.txt file contains the following text
         // This is a line of text inside the file.
         FileInputStream input = new FileInputStream("05_Java_Assignment.txt");

         // Returns the number of available bytes
         System.out.println("Available bytes at the beginning: " + input.available());

         // Reads 3 bytes from the file
         input.read();
         input.read();
         input.read();

         // Returns the number of available bytes
         System.out.println("Available bytes at the end: " + input.available());

         input.close();
      }

      catch (Exception e) {
         e.getStackTrace();
      }
   }
}