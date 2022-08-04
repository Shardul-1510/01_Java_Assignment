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
// Java program to delete a file
import java.io.*;

public class Delete_file {
    
	public static void main(String[] args)
	{
		File file
			= new File("C:\\Users\\SHARDUL\\OneDrive\\Documents\\NetBeansProjects\\05_Java_Assignment.txt");

		if (file.delete()) {
			System.out.println("File deleted successfully");
		}
		else {
			System.out.println("Failed to delete the file");
		}
	}
}


