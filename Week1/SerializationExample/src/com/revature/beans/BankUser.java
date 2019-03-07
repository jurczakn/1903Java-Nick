package com.revature.beans;

import java.io.Serializable;

public class BankUser implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8505635454923822659L;

	private String username;
	
	private String password;
	
	private String acctNumber;
	
	private transient double balance;
	
	//      vvvv---- this field will not be serialized along with the object
	private transient String ssn;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "BankUser [username=" + username + ", password=" + password + ", acctNumber=" + acctNumber + ", balance="
				+ balance + ", ssn=" + ssn + "]";
	}

	public BankUser() {
		super();
	}

	public BankUser(String username, String password, String acctNumber, double balance, String ssn) {
		super();
		this.username = username;
		this.password = password;
		this.acctNumber = acctNumber;
		this.balance = balance;
		this.ssn = ssn;
	}
	
}
