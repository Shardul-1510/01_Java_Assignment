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
// Java program to read text from file from a specified
// index

import java.io.FileInputStream;

public class Specified_Index {

	public static void main(String args[])
	{

		try {
			
			// attach the file to FileInputStream
			FileInputStream fin = new FileInputStream(
				"D:\\myfile.txt");

			int i = 0;
			
			// discards 7 bytes of data from the input
			// stream.
			fin.skip(7);
			
			// read from the file
			System.out.print("Printing text from index 8: ");
			
			while ((i = fin.read()) != -1) {

				System.out.print((char)i);
			}

			fin.close();
		}
		catch (Exception e) {

			System.out.println(e);
		}
	}
}


    

