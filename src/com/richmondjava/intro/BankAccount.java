package com.richmondjava.intro;

public class BankAccount {

	private String sortCode;
	private String accountNumber;
	private boolean isSortCodeValid = false;
	private boolean isAccountNumberValid = false;

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

	public boolean isSortCodeValid() {
		if ((sortCode.length() == 6 && sortCode.matches("[0-9]+"))) {
			isSortCodeValid = true;
		}
		return isSortCodeValid; 
	}

	public boolean isAccountNumberValid() {		
		if ((accountNumber.length() == 9 && accountNumber.matches("[0-9]+"))) {
			isAccountNumberValid = true;
		}
		return isAccountNumberValid; 
	}
}
