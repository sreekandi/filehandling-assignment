package com.capgemini.files.model;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class GrepApplication {
	
	public List<String> checkWordPresent(String word) throws IOException{
	FileReader filereader=new FileReader("C:\\sreevidhya\\work _space\\path.txt");
	
	LineNumberReader linenumberreader = new LineNumberReader(filereader);
	String line;
	List<String> list=new ArrayList<String>();
	while ((line = linenumberreader.readLine()) != null) {
		for (String element : line.split(" ")) {
			if (element.equalsIgnoreCase(word)) {
				list.add("Word found at line " + linenumberreader.getLineNumber());
			}
		}
	}
	return list ;
	
	}
	
	

}
