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
import java.io.*;

public class Create_Directory {
  public static void main(String[] args) {
   
    File dir = new File("D:\\IHelp");

   
    boolean isDirectoryCreated = dir.mkdir();

    
    if (isDirectoryCreated)
      System.out.println("Directory successfully created: " + dir);
    else
      System.out.println("Directory was not created successfully: " + dir);
  }
}
