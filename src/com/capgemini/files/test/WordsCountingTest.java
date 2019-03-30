package com.capgemini.files.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.model.WordsCounting;

public class WordsCountingTest {
	
	@Test
	public void testForCountingWords() throws IOException 
	{
		WordsCounting wordCount = new WordsCounting();
		assertEquals(61, wordCount.checkWordCount());
	}
	@Test
	public void testForCountingWordsEmpty() throws IOException 
	{
		WordsCounting wordCount = new WordsCounting();
		assertNotEquals(null, wordCount.checkWordCount());
	}


	
}
