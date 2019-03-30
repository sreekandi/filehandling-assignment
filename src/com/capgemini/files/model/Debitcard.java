package com.capgemini.files.model;

import java.io.Serializable;

public class Debitcard {
	
	private long cardNumber;
	private int cvv;
	private int expirydate;
	private int expiryYear;
	public Debitcard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Debitcard(long cardNumber, int cvv, int expirydate, int expiryYear) {
		super();
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expirydate = expirydate;
		this.expiryYear = expiryYear;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(int expirydate) {
		this.expirydate = expirydate;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	
	
	

}
