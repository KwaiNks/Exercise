package com.richmondjava.intro;

public class PasswordStrength {

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordStrength(String password) {
		String passwordStrength = "";
		
		if (password.matches(".{1,5}$")) {
			passwordStrength = "weak";
		}
		else if((password.matches("(?=.*[A-Z]).{6,8}$"))){
			passwordStrength = "medium";
		}
		else if (password.matches("(?=.*\\W+)(?=.*[A-Z]).{11,}")) {
			passwordStrength = "strong";
		}
		else {	
			passwordStrength = "Empty password";
		}
		return passwordStrength;
	}
}
