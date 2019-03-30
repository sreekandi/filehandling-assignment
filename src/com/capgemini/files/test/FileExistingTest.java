package com.capgemini.files.test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.capgemini.files.model.FileExist;

public class FileExistingTest {

	@Test
	public void testForFileExistance() 
	{
		FileExist fileExist = new FileExist();
		assertEquals(true, fileExist.checkFileExist());
	}
	
	@Test
	public void testForFileNotExistance() 
	{
		FileExist fileExist = new FileExist();
		assertNotEquals(false, fileExist.checkFileExist());
	}

}
