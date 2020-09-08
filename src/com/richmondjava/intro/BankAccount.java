package com.richmondjava.intro;

public class BankAccount {
	
	private String sortCode;
	private String accountNumber;
	private boolean isValid = false;
	
	public int getSortCode() {
		return Integer.parseInt(sortCode);
	}
	
	public void setSortCode(String sortCode) {
		this.sortCode = sortCode ;
	}
	
	public int getAccountNumber() {
		return Integer.parseInt(accountNumber);
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public boolean isValid() {
		if ((sortCode.length() == 6 && sortCode.matches("[0-9]+"))) {
			isValid = true;
		}else {
			isValid = false;
		}
		return isValid;
	}
}
