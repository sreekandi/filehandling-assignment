package com.capgemini.files.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordsCounting {
	
	
	
	public int checkWordCount() throws IOException
	{
		FileReader reader = new FileReader("C:\\sreevidhya\\Assignment java\\Day2-Assignment\\src\\Amstrong.java");
		BufferedReader breader = new BufferedReader(reader);
		int count = 0;
		String content;
		while ((content=breader.readLine()) != null)
		{
				String s[] = content.split(" ");
			
			count=count+s.length;
		}
		System.out.println("Words Counted successfully");
		breader.close();
		reader.close();
		return count;
	}

}
