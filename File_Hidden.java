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
public class File_Hidden {
   public static void main(String[] args) {
      try {
         File file = new File("myfile.txt");
         file.createNewFile();
         System.out.println("Is file hidden? " + file.isHidden());
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}

    

