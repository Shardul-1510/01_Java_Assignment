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
import java.io.File;
public class File_Read {
   public static void main(String[] args) {
      try {
         File file = new File("05_Java_Assignment.txt");
         file.createNewFile();
         System.out.println("The file can be read? " + file.canRead());
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}