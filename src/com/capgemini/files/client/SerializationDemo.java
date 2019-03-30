package com.capgemini.files.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import com.capgemini.files.model.BankAccount;
import com.capgemini.files.model.Debitcard;

public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Debitcard debitcard=new Debitcard(456823179523456L,563,12,2015);
		BankAccount account =new BankAccount(120,"vidhya","SAVINGS",34000,debitcard);
		
		
		//serialization
	FileOutputStream fileoutputstream=new FileOutputStream("account.ser");
	ObjectOutputStream objectoutputstream=new  ObjectOutputStream(fileoutputstream);
		
		
	objectoutputstream.writeObject(account);
	objectoutputstream.close();
		
		FileInputStream fileinputstream=new FileInputStream("account.ser");
		ObjectInputStream objectinputstream=new  ObjectInputStream(fileinputstream);
		
		
		BankAccount account2=(BankAccount)objectinputstream.readObject();
		
		objectinputstream.close();
		
		System.out.println(account2);
	}

}
