package com.capgemini.files.model;

import java.io.Serializable;

public class BankAccount implements Serializable{
	
	private int accountId;
	private String accountHolderName;
	private String accounttype;
	private double accountBalence;
	private transient Debitcard debitCard;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accountId, String accountHolderName, String accounttype, double accountBalence,
			Debitcard debitCard) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accounttype = accounttype;
		this.accountBalence = accountBalence;
		this.debitCard = debitCard;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public double getAccountBalence() {
		return accountBalence;
	}
	public void setAccountBalence(double accountBalence) {
		this.accountBalence = accountBalence;
	}
	public Debitcard getDebitCard() {
		return debitCard;
	}
	public void setDebitCard(Debitcard debitCard) {
		this.debitCard = debitCard;
	}
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", accounttype="
				+ accounttype + ", accountBalence=" + accountBalence + ", debitCard=" + debitCard + "]";
	}
	
	

}
