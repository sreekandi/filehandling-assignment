package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {

//		File file=new File("test.txt");
//		if(!file.exists())
//		{
//			file.createNewFile();
//			System.out.println(" file is created sucussfully....");
//		}
//		
//		FileWriter writer =new FileWriter(file);
//		//BufferedWriter writer=new BufferedWriter(new FileWriter(file));
//		PrintWriter writer=new PrintWriter(new FileWriter(file));
//		writer.println("hello\n");
//		writer.println("how are u..\n");
//		writer.println("hope ur fine ..\n");
//		writer.println("byee..\n");
//		
//		
//		writer.close();
//		 System.out.println("contents are written sucessfully");

		
		  FileReader reader = new FileReader("C:\\sreevidhya\\work _space\\corejava\\bank app\\src\\com\\capgemini\\bankapp\\model\\BankAccount.java"
		  ); BufferedReader breader = new BufferedReader(reader);
		  
		  PrintWriter writer = new PrintWriter("BankAccount.java");
		 
		  String content;
		  
		  while ((content = breader.readLine()) != null)
		  { 
		  System.out.println(content);
		  writer.println(content);
		  }
		  System.out.println("--sucess--");
		  writer.close(); 
		  breader.close();
		  reader.close();
		 
		/*
		 * File windowsDirectory= new File("C:\\Windows");
		 * System.out.println(windowsDirectory.isDirectory()); String
		 * content[]=windowsDirectory.list();
		 * 
		 * for(String s:content) { System.out.println(s); }
		 */
		 

		File newDir = new File("myDirectory");
		if (!newDir.exists()) {
			newDir.mkdir();
			System.out.println("folder is sucessfully created..");
		}

		File file = new File(newDir, "myFile.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("file created sucessfully");
		}

	}
}
