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
// Java Program to rename a file
import java.io.File;
public class Rename_File {
    
	public static void main(String[] args)
	{
		// Create an object of the File class
		// Replace the file path with path of the directory
		File file = new File("D:\\myfile.txt");

		// Create an object of the File class
		// Replace the file path with path of the directory
		File rename = new File("D:\\file.txt");

		// store the return value of renameTo() method in
		// flag
		boolean flag = file.renameTo(rename);

		// if renameTo() return true then if block is
		// executed
		if (flag == true) {
			System.out.println("File Successfully Rename");
		}
		// if renameTo() return false then else block is
		// executed
		else {
			System.out.println("Operation Failed");
		}
	}
}