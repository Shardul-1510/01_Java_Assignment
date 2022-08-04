/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_java_assignment;

import java.io.BufferedReader;

/**
 *
 * @author SHARDUL
 */
    
import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;




public class NewFile {

	// Main Driver Method
	public static void main(String args[])
	{
		// Creating New File via function
		NewFile n = new n();
		n.newFile();
	}

	// Function To Make New File
	public void newFile()
	{
		String strPath = "", strName = "";

		// Try-catch Block
		try {

			// Creating BufferedReadered object
			BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
			System.out.println("Enter the file name:");

			// Reading File name
			strName = br.readLine();
			System.out.println("Enter the file path:");

			// Reading File Path
			strPath = br.readLine();

			// Creating File Object
			File file1
				= new File(strPath + "" + strName + ".txt");

			// Method createNewFile() method creates blank
			// file.
			file1.createNewFile();
		}

		// Try-Catch Block
		catch (Exception ex1) {
		}
	}

    private static class n extends NewFile {

        public n() {
        }
    }
}

   