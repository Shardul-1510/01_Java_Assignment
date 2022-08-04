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
// Java program to get the attributes of a file
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.Scanner;
public class File_Attributes {
	public static void main(String[] args) throws Exception
	{

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file path");
		String s = sc.next();

		
		Path path = FileSystems.getDefault().getPath(s);

		
		BasicFileAttributeView view
			= Files.getFileAttributeView(
				path, BasicFileAttributeView.class);

		
		BasicFileAttributes attribute
			= view.readAttributes();

		
		System.out.print("Creation Time of the file: ");
		System.out.println(attribute.creationTime());
		System.out.print(
			"Last Accessed Time of the file: ");
		System.out.println(attribute.lastAccessTime());

		
		System.out.print(
			"Last Modified Time for the file: ");
		System.out.println(attribute.lastModifiedTime());

		
		System.out.println("Directory or not: "
						+ attribute.isDirectory());

		
		System.out.println("Size of the file: "
						+ attribute.size());
	}
}