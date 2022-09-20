package com.gl.email.service;

import java.util.Random;

import com.gl.email.model.Employee;

public class CredentialService {
	int i;
	public String generatePassword() {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
								+ "abcdefghijklmnopqrstuvwxyz"
								+ "1234567890"
								+ "!@#$%^&*()_+" ;
		Random rand = new Random() ;
		char[] password = new char[8]; 
		
		for (int i = 0; i<8; i++) {
			password[i] = passwordSet.charAt(rand.nextInt(passwordSet.length()));
		}
		
		return new String(password) ;
	}

	public String generateEmailAddress(String firstName, String lastName , String department) {
		return firstName + lastName + "@" + department + ".gl.com";
	}
	
	public void showCredentials(Employee emp, String email, String password ) {
		System.out.println("Dear" +" " + emp.getFirstName() + " " + "your generated credentials are as follows:");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
	
	
}
