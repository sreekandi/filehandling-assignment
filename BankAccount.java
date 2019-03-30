package com.capgemini.bankapp.model;

public class BankAccount {

		private long accountId;
		private String accountHolderName;
		private String accountType;
		private double accountBalence;
		
		public BankAccount() {
			super();
			// TODO Auto-generated constructor stub
		}

		public BankAccount(long accountId, String accountHolderName, String accountType, double accountBalence) {
			super();
			this.accountId = accountId;
			this.accountHolderName = accountHolderName;
			this.accountType = accountType;
			this.accountBalence = accountBalence;
		}

		public long getAccountId() {
			return accountId;
		}

		public void setAccountId(long accountId) {
			this.accountId = accountId;
		}

		public String getAccountHolderName() {
			return accountHolderName;
		}

		public void setAccountHolderName(String accountHolderName) {
			this.accountHolderName = accountHolderName;
		}

		public String getAccountType() {
			return accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public double getAccountBalence() {
			return accountBalence;
		}

		public void setAccountBalence(double accountBalence) {
			this.accountBalence = accountBalence;
		}
		public double withdrawAmount(double amount)
		{
			if(accountBalence >=amount)
				accountBalence= accountBalence-amount;
			else 
				System.out.println("you dont have in sufficient balence");
				return accountBalence;
		}
		public double depositAmount(double amount)
		{
			
				accountBalence= accountBalence+amount;
				return accountBalence;
		}

}
