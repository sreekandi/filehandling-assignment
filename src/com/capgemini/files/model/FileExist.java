 package com.capgemini.files.model;

import java.io.File;

public class FileExist {
	
	public boolean checkFileExist()
	{
		File file = new File("C:\\sreevidhya\\Assignment java\\Day2-Assignment\\src\\Amstrong.java");
		if(file.exists())
		{
			System.out.println("File Exists");
			return true;
		}
		else
		{
			System.out.println("File does not Exists");
			return false;
		}
	}

}
