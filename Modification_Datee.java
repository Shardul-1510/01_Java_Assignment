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
// Java program to demonstrate
// last modified time of a file
// using lastModified() method
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Modification_Datee {
	public static void main(String[] args)
	{
		// Creating two instances of file class
		// file1.txt exists in the system
		File file1 = new File("C:\\Users\\SHARDUL\\OneDrive\\Documents\\NetBeansProjects\\05_Java_Assignmentlogtxt.txt");
	
		// file2.txt does not exist in the system
		File file2 = new File("D:\\myfile.txt");
	
		// last modified returns date in milliseconds
		long time1 = file1.lastModified();
		long time2 = file2.lastModified();
	
		// Convert milliseconds into readable date time
		// format any desirable format can be achieved using
		// SimpleDateFormat
		DateFormat sdf
			= new SimpleDateFormat("MMMM dd, yyyy hh:mm a");
	
		System.out.println("File.java modified date is : "
						+ sdf.format(time1));
	
		System.out.println("file.txt modified date is : "
						+ sdf.format(time2));
	}
}

