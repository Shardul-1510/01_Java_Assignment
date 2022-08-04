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
import java.io.FileOutputStream;  
public class FileOutput {
    public static void main(String args[]){    
           try{    
             FileOutputStream f;    
               f = new FileOutputStream("C:\\Users\\SHARDUL\\OneDrive\\Documents\\NetBeansProjects\\05_Java_Assignment.txt");
             
             String s="Welcome to Folder.";    
             byte b[]=s.getBytes();//converting string into byte array    
             f.write(b);    
             f.close();    
             System.out.println("Successfully Creates");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  

    
