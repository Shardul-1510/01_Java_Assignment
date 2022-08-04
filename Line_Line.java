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
import java.util.Scanner;  
public class Line_Line {

public static void main(String args[])  
{  
try  
{  
 
FileInputStream fis=new FileInputStream("D:\\myfile.txt");       
Scanner sc=new Scanner(fis);      
while(sc.hasNextLine())  
{  
System.out.println(sc.nextLine());       
}  
sc.close();   
}  
catch(IOException e)  
{  
e.printStackTrace();  
}  
}  
}  