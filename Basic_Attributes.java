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
// Java Program to get the basic file attributes of the file
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.Timestamp;
import java.util.Date;
public class Basic_Attributes {
	public static void main(String args[])
		throws IOException
	{
		// path of the file
		String path = "D:\\myfile.txt";

		// creating a object of Path class
		Path file = Paths.get(path);
		
		// creating a object of BasicFileAttributes
		BasicFileAttributes attr = Files.readAttributes(
			file, BasicFileAttributes.class);
		System.out.println("creationTime Of File Is = "
						+ attr.creationTime());
		System.out.println("lastAccessTime Of File Is = "
						+ attr.lastAccessTime());
		System.out.println("lastModifiedTime Of File Is = "
						+ attr.lastModifiedTime());

		System.out.println("size Of File Is = "
						+ attr.size());
		System.out.println("isRegularFile Of File Is = "
						+ attr.isRegularFile());
		System.out.println("isDirectory Of File Is = "
						+ attr.isDirectory());
		System.out.println("isOther Of File Is = "
						+ attr.isOther());

		System.out.println("isSymbolicLink Of File Is = "
						+ attr.isSymbolicLink());
	}
}