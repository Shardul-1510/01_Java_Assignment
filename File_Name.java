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
// Importing modules
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class File_Name {
	public static void main(String[] args) {

		// Taking file path as input
		Path path = Paths.get("D:\\myfile.txt");

		// Create object having the file attribute
		FileOwnerAttributeView file = Files.getFileAttributeView(path,
										FileOwnerAttributeView.class);

		// Exception Handling to avoid any errors
		try {
			// Taking owner name from the file
			UserPrincipal user = file.getOwner();

			// Printing the owner's name
			System.out.println("Owner: " + user.getName());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}