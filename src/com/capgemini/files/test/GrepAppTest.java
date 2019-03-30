package com.capgemini.files.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.capgemini.files.model.GrepApplication;

public class GrepAppTest {
	                                                                             
	 @Test
	public void testCheckWordPresent() throws IOException 
	{
	         GrepApplication greap = new  GrepApplication();
			List<String> expectedList=new ArrayList<String>();
			
			expectedList.add("Word found at line 1");
		
	}
}
