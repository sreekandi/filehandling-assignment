package com.capgemini.files.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.model.LinesCounting;

public class LinesCountingTest {

	@Test
	public void testForCountingLines() throws IOException 
	{
		LinesCounting lineCount = new LinesCounting();
		assertEquals(32, lineCount.checkLineCount());
	}
	@Test
	public void testNoLinesCounted() throws IOException
	{
		LinesCounting lineCount = new LinesCounting();
		assertNotEquals(null, lineCount.checkLineCount());
		
	}
	

}
