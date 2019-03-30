package com.capgemini.files.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.files.model.MyClass;

public class MyClassTest {

	ArrayList<MyClass> customer;
	MyClass class1;
	
	
	@Before
	public void setUp()
	{
	    class1 =new MyClass(1, "pranavi", 22);
		MyClass c2 =new MyClass(2, "vidhya", 21);
		MyClass c3 =new MyClass(3, "mounika", 23);
		MyClass c4 =new MyClass(4, "teja", 21);
		MyClass c5 =new MyClass(5, "shiva", 22);
		
		customer = new ArrayList<MyClass>();
		customer.add(class1);
		customer.add(c2);
		customer.add(c3);
		customer.add(c4);
		customer.add(c5);
	}
	@Test
	public void testForSerialization() throws IOException 
	{
		MyClass m = new MyClass();
		assertTrue(m.serialization("Myclass.ser", customer));
		
	}
	
	@Test
	public void testForDeSerialization() throws IOException, ClassNotFoundException 
	{
		MyClass m1 = new MyClass();
		ArrayList<MyClass> ar=(ArrayList<MyClass>) m1.deSerialization("myclass.ser");
		
		Iterator<MyClass> iterator=ar.iterator();
		
		assertEquals(class1, iterator.next());
		
	}

}
