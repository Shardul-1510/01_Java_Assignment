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
// Java Program to Traverse Through a Directory

// Importing required classes
import java.io.File;

// Main class
public class Traverse_Files {

	// Method 1
	// To display fies
	public static void displayFiles(File[] files)
	{
		// Traversing through the files array
		for (File filename : files) {
			// If a sub directory is found,
			// print the name of the sub directory
			if (filename.isDirectory()) {
				System.out.println("Directory: "+ filename.getName());

				
				displayFiles(filename.listFiles());
			}

			
			else {
				
				System.out.println("File: "+ filename.getName());
			}
		}
	}

	
	public static void main(String[] args)
	{
		
		File[] files = new File("C:\\Users\\SHARDUL\\OneDrive\\Documents\\NetBeansProjects").listFiles();

		
		displayFiles(files);
	}
}


    

