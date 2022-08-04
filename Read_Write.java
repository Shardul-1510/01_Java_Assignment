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
// Java program to read content from one file
// and write it into another file


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Read_Write {

	
	public static void main(String[] args)
	{

		
		try {

			FileReader fr = new FileReader("D:\\myfile.txt");

			
			FileWriter fw = new FileWriter("C:\\Users\\SHARDUL\\OneDrive\\Documents\\NetBeansProjects\\05_Java_Assignmentlogtxt.txt");

			
			String str = "";

			int i;

			
			while ((i = fr.read()) != -1) {

				
				str += (char)i;
			}

			
			System.out.println(str);

			
			fw.write(str);

			
			fr.close();
			fw.close();

			// Display message
			System.out.println(
				"File reading and writing both done");
		}

		
		catch (IOException e) {

			
			System.out.println(
				"There are some IOException");
		}
	}
}


